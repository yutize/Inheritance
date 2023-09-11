public class SalaryWorker extends Worker {
    private double annualSalaryPay;

    public SalaryWorker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate, double annualSalaryPay) {
        super(firstName, lastName, ID, title, YOB, hourlyPayRate);
        this.annualSalaryPay = annualSalaryPay;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalaryPay / 52;
    }

    @Override
    public String displayWeeklyPay(double hoursWorked) {
        double weeklyPay = calculateWeeklyPay(hoursWorked);
        return String.format("Weekly Salary Pay: %.2f", weeklyPay);
    }
}
