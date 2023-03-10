package lesson6.homework6;

public class RAM {
    String modelRam;

    String typeRam;

    int capacityRam;

    {
        modelRam ="TEAM XTREEM ARGB";
        typeRam="DDR4 SDRAM";
        capacityRam = 16;
    }

    public RAM() {
    }

    public RAM(String modelRam) {
        this.modelRam = modelRam;
    }

    public RAM(String modelRam, String typeRam) {
        this.modelRam = modelRam;
        this.typeRam = typeRam;
    }

    public RAM(String modelRam, String typeRam, int capacityRam) {
        this.modelRam = modelRam;
        this.typeRam = typeRam;
        this.capacityRam = capacityRam;
    }

    void outputInformationRam(){
        System.out.println("RAM model "+ modelRam + ", type RAM "+ typeRam + ", capacity RAM "+ capacityRam + "Gb");
    }
}
