package lesson6.homework6;

public class Computer {
    String modelComputer;
    String manufacturer;
    double coastComputer;

    CPU cpu = new CPU();

    RAM ram = new RAM();

    HDD hdd = new HDD();

    public Computer(String modelComputer, String manufacturer, double coastComputer) {
        this.modelComputer = modelComputer;
        this.manufacturer = manufacturer;
        this.coastComputer = coastComputer;
    }

    public Computer(String modelComputer, String manufacturer, double coastComputer, CPU cpu, RAM ram, HDD hdd) {
        this.modelComputer = modelComputer;
        this.manufacturer = manufacturer;
        this.coastComputer = coastComputer;
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    void outputInformationComputer() {
        System.out.println(" Model " + modelComputer + ", manufacturer " + manufacturer + ", coast of the computer " + coastComputer + "USD");
    }
    void outputAllInformationComputer(){
        System.out.println(" Model " + modelComputer + ", manufacturer " + manufacturer + ", coast of the computer " + coastComputer + "USD");
        System.out.print("> "); cpu.outputInformationCpu();
        System.out.print("> "); ram.outputInformationRam();
        System.out.print("> "); hdd.outputInformationHdd();
   }

}
