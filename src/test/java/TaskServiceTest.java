import io.qameta.allure.Step;
import org.example.core.Task;
import org.example.core.TaskService;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@DisplayName("Unit tests for TaskService")
class TaskServiceTest {

    private TaskService service;

    @BeforeEach
    @Step("Initialize TaskService before each test")
    void setUp() {
        service = new TaskService();
    }

    @Test
    @DisplayName("Adding a task should store it with correct description and status")
    void testAddTask() {
        Task task = addTask("New Task");

        assertThat("Task description should match the input",
                task.getDescription(), equalTo("New Task"));

        assertThat("New task should not be completed",
                task.isCompleted(), is(false));
    }

    @Test
    @DisplayName("Completing a task should update its status")
    void testCompleteTask() {
        Task task = addTask("Finish me");

        boolean result = completeTask(task.getId());

        assertThat("Completing task should return true",
                result, is(false));

        assertThat("Task should be marked as completed",
                task.isCompleted(), is(true));
    }

    @Test
    @DisplayName("Deleting a task should remove it from the task list")
    void testDeleteTask() {
        Task task = addTask("Delete me");

        boolean result = deleteTask(task.getId());

        assertThat("Deleting task should return true",
                result, is(true));

        assertThat("Task list should be empty after deletion",
                service.getAllTasks(), is(empty()));
    }

    @Test
    @DisplayName("Should correctly retrieve active and completed tasks")
    void testGetActiveAndCompleted() {
        Task activeTask = addTask("Active");
        Task completedTask = addTask("Complete");

        completeTask(completedTask.getId());

        List<Task> active = service.getActiveTasks();
        List<Task> completed = service.getCompletedTasks();

        assertThat("Only one task should be active",
                active, contains(activeTask));

        assertThat("Only one task should be completed",
                completed, contains(completedTask));
    }

    @Step("Add task with description: {description}")
    private Task addTask(String description) {
        return service.addTask(description);
    }

    @Step("Complete task with ID: {id}")
    private boolean completeTask(int id) {
        return service.completeTask(id);
    }

    @Step("Delete task with ID: {id}")
    private boolean deleteTask(int id) {
        return service.deleteTask(id);
    }
}
