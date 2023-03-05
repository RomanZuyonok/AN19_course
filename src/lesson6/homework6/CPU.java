package lesson6.homework6;

public class CPU {
    String modelCpu;

    String typeCpu;

    int performanceCpu;

    {
        modelCpu="CORE I3";
        typeCpu = "Intel";
        performanceCpu = 2;
    }
    public CPU() {
    }

    public CPU(String modelCpu) {
        this.modelCpu = modelCpu;
    }

    public CPU(String modelCpu, String typeCpu) {
        this.modelCpu = modelCpu;
        this.typeCpu = typeCpu;
    }

    public CPU(String modelCpu, String typeCpu, int performanceCpu) {
        this.modelCpu = modelCpu;
        this.typeCpu = typeCpu;
        this.performanceCpu = performanceCpu;
    }

    void outputInformationCpu(){
        System.out.println("CPU model "+ modelCpu + ", manufacturer "+ typeCpu + ", performance "+ performanceCpu + "Ghz");
    }
}
