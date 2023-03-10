package lesson8.homeworks.documentflow.contractsupplygoods;

import lesson8.homeworks.documentflow.Document;

import java.util.Date;

public class ContractSupplyGoods extends Document {

    private String typeGoods;

    private double amountGoods;

    public ContractSupplyGoods() {
    }

    public ContractSupplyGoods(int numberDoc, Date dateDoc) {
        super(numberDoc, dateDoc);
    }

    public ContractSupplyGoods(String typeGoods, double amountGoods) {
        this.typeGoods = typeGoods;
        this.amountGoods = amountGoods;
    }

    public ContractSupplyGoods(int numberDoc, Date dateDoc, String typeGoods, double amountGoods) {
        super(numberDoc, dateDoc);
        this.typeGoods = typeGoods;
        this.amountGoods = amountGoods;
    }

    public String getTypeGoods() {
        return typeGoods;
    }

    public double getAmountGoods() {
        return amountGoods;
    }

    @Override
    public String toString() {
        return "ContractSupplyGoods{" +
                "typeGoods='" + typeGoods + '\'' +
                ", amountGoods=" + amountGoods +
                '}';
    }
}
