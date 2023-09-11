import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(new Worker("Yutong", "Chen", "001", "Mr.", 2003, 17.0));
        workers.add(new Worker("James", "Cook", "002", "Mr.", 2002, 25.0));
        workers.add(new Worker("Tom", "Peppercorn", "003", "Mr.", 2003, 20));
        workers.add(new SalaryWorker("Jakobi", "Meyers", "004", "Mr.", 1990, 15.0, 60000));
        workers.add(new SalaryWorker("Grace", "Hostelley", "005", "Mrs.", 2003, 18.0, 99999999));
        workers.add(new SalaryWorker("Yutong", "Chen Jr.", "006", "Dr.", 2005, 10, 8000));

        int[] weeklyHours = {40, 50, 40};

        for (int week = 1; week <= 3; week++) {
            System.out.println("Week " + week + " Pay:");
            for (Worker worker : workers) {
                double hoursWorked = weeklyHours[week - 1];
                System.out.println(worker.formalName() + ": " + worker.displayWeeklyPay(hoursWorked));
            }
           // System.out.println("\n");
        }
    }
}