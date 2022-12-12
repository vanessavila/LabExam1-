public class ShiftWorker extends Employee {

    private String shift;
    private String payroll_number;
    private String hourly_payRate;

    public ShiftWorker(String shift, String payroll_number, String hourly_payRate) {
        this.shift = shift;
        this.payroll_number = payroll_number;
        this.hourly_payRate = hourly_payRate;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getPayroll_number() {
        return payroll_number;
    }

    public void setPayroll_number(String payroll_number) {
        this.payroll_number = payroll_number;
    }

    public String getHourly_payRate() {
        return hourly_payRate;
    }

    public void setHourly_payRate(String hourly_payRate) {
        this.hourly_payRate = hourly_payRate;
    }
    
}
