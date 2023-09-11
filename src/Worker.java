public class Worker extends Person
{
    private double hourlyPayRate;
    public Worker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate) {
        super(firstName, lastName, ID, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked)
        {
            double netPay;
            if (hoursWorked > 40)
            {
                double overTimeHours = hoursWorked - 40;
                netPay = (40 * hourlyPayRate) + (overTimeHours * (hourlyPayRate * 1.5));
            } else {
                netPay = hoursWorked * hourlyPayRate;
            }
            return netPay;
        }

    public String displayWeeklyPay(double hoursWorked)
    {
        double weeklyPay = calculateWeeklyPay(hoursWorked);
        double overtimeHours;
        double normalHours;
        if (hoursWorked > 40)
        {
            overtimeHours = hoursWorked - 40;
            normalHours = 40;
        } else {
            overtimeHours = 0;
            normalHours = hoursWorked;
        }

        return ("Normal hours worked: " + normalHours + "\n" + "Overtime hours worked: " + overtimeHours + "\n" +
        "Total Pay: " + weeklyPay);
    }
}
