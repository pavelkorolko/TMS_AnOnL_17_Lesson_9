package FirstTask;

import FirstTask.Documents.EmployeeContract;
import FirstTask.Exceptions.ABCSequenceException;
import FirstTask.Exceptions.EndingException;
import FirstTask.Exceptions.FivesSequenceException;
import FirstTask.Services.Printer;
import FirstTask.Services.Register;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Register register = new Register();
        Printer printer = new Printer();

        try {
            //change docNumber naming for throwing exception
            EmployeeContract contract1 = new EmployeeContract("555abc1a2b", new Date(2018, 11, 4), "John Doe", new Date(2019, 4, 10));

            register.saveDocument(contract1);
            System.out.println(printer.getInfo(contract1));
        } catch (ABCSequenceException | FivesSequenceException | EndingException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}