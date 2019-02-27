import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodoServiceTest {

    TodoService todoService = new TodoService();

    @Test
    public void testAdd() {
        TodoItem item = new TodoItem("Check mail");
        TodoItem item1 = new TodoItem("Kursa git");
        todoService.add(item);
        todoService.add(item1);

        List<TodoItem> items = todoService.getItems();

        assertEquals(items.get(0).getName(), "Check mail");
        assertEquals(items.get(1).getName(), "Kursa git");
    }

    @Test
    public void testUpdateName() {
        TodoItem item = new TodoItem("Check mail");
        todoService.add(item);

        todoService.updateName(item.getId(), "sinemaya git");
        assertEquals("sinemaya git", todoService.getItems().get(0).getName());
    }

    @Test
    public void testDelete() {
        TodoItem item1 = new TodoItem("check mail");
        TodoItem item2 = new TodoItem("sinemaya git");
        todoService.add(item1);
        todoService.add(item2);

        todoService.delete(1);
        //assertEquals(2,todoService.getItems().get(0).getId());
        assertEquals("sinemaya git",todoService.getItems().get(0).getName());

    }
    @Test
    public void updateStatus(){
        TodoItem item1 = new TodoItem("check mail");
        item1 = todoService.add(item1);
        assertEquals(false,todoService.getItems().get(0).getCompleted());
        todoService.updateStatus(item1.getId(),true);
        assertEquals(true,todoService.getItems().get(0).getCompleted());
        todoService.updateStatus(item1.getId(),false);
        assertEquals(false,todoService.getItems().get(0).getCompleted());
    }
    @Test
    public void testGetItems(){
        TodoItem item1 = new TodoItem("check mail");
        todoService.add(item1);

        assertEquals(item1,todoService.getItems().get(0));
    }
}
