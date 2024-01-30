package Services;

import Documents.Document;
import Documents.EmployeeContract;
import Documents.Invoice;
import Documents.SupplyGoodsDoc;
import Interfaces.IPrinterable;

public class Printer implements IPrinterable {

    @Override
    public String getInfo(Document document) {
        if (document instanceof Invoice) {
            Invoice temp = (Invoice) document;
            return "Total sum per month: " + temp.getTotalSumPerMonth() + ", department: " + temp.getDepartmentCode() + ", document number: " + temp.getDocNumber() + ", date: " + temp.getDate();
        }

        if (document instanceof EmployeeContract) {
            EmployeeContract temp = (EmployeeContract) document;
            return "Employee name: " + temp.getEmployeeName() + ", ending date: " + temp.getEndingDate() + ", document number: " + temp.getDocNumber() + ", date: " + temp.getDate();
        }

        if (document instanceof SupplyGoodsDoc) {
            SupplyGoodsDoc temp = (SupplyGoodsDoc) document;
            return "Product type: " + temp.getProductType() + ", amount: " + temp.getAmount() + ", document number: " + temp.getDocNumber() + ", date: " + temp.getDate();
        }

        return null;
    }
}
