package lesson8.homeworks.documentflow;


public class Register implements BaseRegister {

    Document[] register = new Document[10];

    @Override
    public void save(Document document) {
        if (document != null) {
            for (int i = 0; i < register.length; i++) {
                if (register[i] == null) {
                    register[i] = document;
                    System.out.println("The document is saved in the register!");
                    break;
                }
            }
        } else {
            System.out.println("The document isn`t saved in the register!");
        }

    }

    @Override
    public void inputInfoDoc(Document document) {
        for (int i = 0; i < register.length; i++) {
            if (document.equals(register[i])) {
                System.out.println(i + " register position");
                System.out.println("Number document " + register[i].getNumberDoc() + ": date document " + register[i].getDateDoc() + "  " + register[i].toString());
                System.out.println();
                break;
            }

        }
    }

    public void inputInfoDoc(int number) {
        for (int i = 0; i < register.length; i++) {
            if (register[i] != null) {
                if (register[i].getNumberDoc() == number) {
                    System.out.println("Register position N"+i);
                    System.out.println(" --> " + register[i].toString());
                }
            }
        }
    }

    @Override
    public void delRegDoc(Document document) {
        for (int i = 0; i < register.length; i++) {
            if (document.equals(register[i])) {
                register[i] = null;
                System.out.println("The document is delete in the register!");
            }
        }
    }

    public void printArray() {
        for (int i = 0; i < register.length; i++) {
            if (register[i] != null) {
                System.out.println(i + " = " + register[i]);
            }
        }
    }

}
