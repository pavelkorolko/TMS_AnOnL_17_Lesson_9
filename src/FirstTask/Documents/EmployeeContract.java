package FirstTask.Documents;

import java.util.Date;

public class EmployeeContract extends Document{
    private Date endingDate;
    private String employeeName;

    public EmployeeContract(){}

    public EmployeeContract(String docNumber, Date endingDate, String employeeName, Date date){
        super(docNumber, date);
        this.employeeName = employeeName;
        this.endingDate = endingDate;
    }

    public Date getEndingDate() {
        return endingDate;
    }

    public String getEmployeeName() {
        return employeeName;
    }
}
