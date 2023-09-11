import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
    @Test
    void calculateWeeklyPay() {
        Worker worker = new Worker("Yutong", "Chen", "001", "Mr.", 2003, 17.0);
        assertEquals(680.00, worker.calculateWeeklyPay(40));
    }

    @Test
    void displayWeeklyPay() {
        Worker worker = new Worker("Yutong", "Chen", "001", "Mr.", 2003, 17.0);
        assertEquals("Normal hours worked: 40.0\n" +
                "Overtime hours worked: 0.0\n" +
                "Total Pay: 680.0", worker.displayWeeklyPay(40));

    }
}