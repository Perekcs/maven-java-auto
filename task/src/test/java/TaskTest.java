import org.junit.Test;
import org.task.Task;
import static org.junit.Assert.*;
public class TaskTest {

    @Test
    public void testTaskTitle() {
        Task task = new Task("Sample Title", "Sample Description");
        assertEquals("Sample Title", task.getTitle());
    }

    @Test
    public void testTaskDescription() {
        Task task = new Task("Sample Title", "Sample Description");
        assertEquals("Sample Description", task.getDescription());
    }

    @Test
    public void testTaskCompletion() {
        Task task = new Task("Sample Title", "Sample Description");
        assertFalse(task.isCompleted());

        task.setCompleted(true);
        assertTrue(task.isCompleted());
    }
}
