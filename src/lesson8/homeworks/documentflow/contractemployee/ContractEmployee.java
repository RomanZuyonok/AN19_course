package lesson8.homeworks.documentflow.contractemployee;

import lesson8.homeworks.documentflow.Document;

import java.util.Date;

public class ContractEmployee extends Document {

    private String nameEmp;

    private Date dateEndContract;

    public ContractEmployee() {
    }

    public ContractEmployee(int numberDoc, Date dateDoc) {
        super(numberDoc, dateDoc);
    }

    public ContractEmployee(String nameEmp, Date dateEndContract) {
        this.nameEmp = nameEmp;
        this.dateEndContract = dateEndContract;
    }

    public ContractEmployee(int numberDoc, Date dateDoc, String nameEmp, Date dateEndContract) {
        super(numberDoc, dateDoc);
        this.nameEmp = nameEmp;
        this.dateEndContract = dateEndContract;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "nameEmp='" + nameEmp + '\'' +
                ", dateEndContract=" + dateEndContract +
                '}';
    }
}
