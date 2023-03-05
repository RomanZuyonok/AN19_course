package lesson6.homework6;

public class HDD {

    String modelHdd;

    String type;

    int capacityHdd;

    {
        modelHdd = "Dell PowerEdge";
        type = "Serial ATA (SATA)";
        capacityHdd = 5;
    }

    public HDD() {
    }

    public HDD(String modelHdd) {
        this.modelHdd = modelHdd;
    }

    public HDD(String modelHdd, String type) {
        this.modelHdd = modelHdd;
        this.type = type;
    }

    public HDD(String modelHdd, String type, int capacityHdd) {
        this.modelHdd = modelHdd;
        this.type = type;
        this.capacityHdd = capacityHdd;
    }
    void outputInformationHdd(){
        System.out.println("HDD model "+ modelHdd + ", type HDD "+ type + ", capacity HDD "+ capacityHdd +"Tb");
    }


}
