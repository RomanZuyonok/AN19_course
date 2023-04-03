package homeworks14;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class QueueReentrantLock<T> {

    private  volatile int size = 0;
    private final Object[] content;
    private final int capacity;

    private int out;
    private int in;

    private final ReentrantLock lock = new ReentrantLock();
    private final Condition isEmpty = lock.newCondition();
    private final Condition isFull = lock.newCondition();

    QueueReentrantLock(int capacity) {
        try {
            lock.lock();
            this.capacity = capacity;
            content = new Object[capacity];
            out = 0;
            in = 0;
        } finally {
            lock.unlock();
        }
    }

    private int cycleInc(int index) {
        return (++index == capacity)
                ? 0
                : index;
    }

    @SuppressWarnings("unchecked")
    T get() throws InterruptedException {
        try {
            lock.lockInterruptibly();
            if (size == 0) {
                while (size < 1) {
                    isEmpty.await();
                }
            }
            final Object value = content[out];
            content[out] = null;
            if (size > 1) {
                out = cycleInc(out);
            }
            size--;
            isFull.signal();
            return (T) value;
        } finally {
            lock.unlock();
        }
    }

    QueueReentrantLock<T> put(T value) throws InterruptedException {
        try {
            lock.lockInterruptibly();
            if (size == capacity) {
                while (size == capacity) {
                    isFull.await();
                }
            }
            if (size == 0) {
                content[in] = value;
            } else {
                in = cycleInc(in);
                content[in] = value;
            }
            size++;
            isEmpty.signal();
        } finally {
            lock.unlock();
        }
        return this;
    }
}