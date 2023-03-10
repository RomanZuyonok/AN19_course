package lesson8.homeworks.documentflow;

import lesson8.homeworks.documentflow.contractemployee.ContractEmployee;
import lesson8.homeworks.documentflow.contractsupplygoods.ContractSupplyGoods;
import lesson8.homeworks.documentflow.financialinvoice.FinancialInvoice;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Register register = new Register();


        ContractEmployee contractEmployee1 = new ContractEmployee(1, new Date(), "Jack", new Date());
        ContractEmployee contractEmployee2 = new ContractEmployee(2, new Date(), "Voodoo", new Date());

        FinancialInvoice financialInvoice1 = new FinancialInvoice(1, new Date(), 120000.00d, "XV-1254");
        FinancialInvoice financialInvoice2 = new FinancialInvoice(2, new Date(), 325470.00d, "XX-3257");

        ContractSupplyGoods contractSupplyGoods1 = new ContractSupplyGoods(1, new Date(), "Many goods goods", 235.00d);
        ContractSupplyGoods contractSupplyGoods2 = new ContractSupplyGoods(2, new Date(), "Goods boots", 15657.00d);

        //  Register storage
        register.save(contractEmployee1);
        register.save(contractEmployee2);

        register.save(financialInvoice1);
        register.save(financialInvoice2);

        register.save(contractSupplyGoods1);
        register.save(contractSupplyGoods2);

        // Print all array
        register.printArray();

        //First method implementation -
        register.inputInfoDoc(contractSupplyGoods1);

        //Calling the delete method
        register.delRegDoc(financialInvoice2);

        // Print all array
        register.printArray();

        //Second method implementation
        register.inputInfoDoc(2);
        //end)

    }
}
