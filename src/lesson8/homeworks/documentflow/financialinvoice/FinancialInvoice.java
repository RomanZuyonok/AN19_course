package lesson8.homeworks.documentflow.financialinvoice;

import lesson8.homeworks.documentflow.Document;

import java.math.BigDecimal;
import java.util.Date;

public class FinancialInvoice extends Document {

    private double monthlyTotal;

    private String departmentCode;

    public FinancialInvoice() {
    }

    public FinancialInvoice(int numberDoc, Date dateDoc) {
        super(numberDoc, dateDoc);
    }

    public FinancialInvoice(double monthlyTotal, String departmentCode) {
        this.monthlyTotal = monthlyTotal;
        this.departmentCode = departmentCode;
    }

    public FinancialInvoice(int numberDoc, Date dateDoc, double monthlyTotal, String departmentCode) {
        super(numberDoc, dateDoc);
        this.monthlyTotal = monthlyTotal;
        this.departmentCode = departmentCode;
    }

    @Override
    public String toString() {
        return "FinancialInvoice{" +
                "monthlyTotal=" + monthlyTotal +
                ", departmentCode='" + departmentCode + '\'' +
                '}';
    }
}
