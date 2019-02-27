import java.util.concurrent.CopyOnWriteArrayList;

public class TodoService {
    private CopyOnWriteArrayList<TodoItem> items;
    private int idIndex = 0;
    private boolean completed;
    public TodoService() {
        this.items = new CopyOnWriteArrayList<TodoItem>();
    }

    public TodoItem add(TodoItem todoItem) {
        todoItem.setId(++this.idIndex);
        this.items.add(todoItem);
        return todoItem;
    }

    public boolean updateStatus(int id,boolean completed) {
        for (int i = 0; i < items.size(); i++) {
            TodoItem item = items.get(i);
            if (id == item.getId()){
                item.setCompleted(completed);
                return true;
            }
        }
        return false;
    }

    public void updateName(int id,String name){
        for(int i=0; i<items.size(); i++){
            TodoItem item = items.get(i);
            if(id == item.getId()){
                item.setName(name);
            }
        }
    }

    public void delete(int id) {
        for (int i = 0; i < items.size(); i++) {
            TodoItem item = items.get(i);
            if (item.getId() == id) {
                this.items.remove(i);
            }
        }
    }

    public CopyOnWriteArrayList<TodoItem> getItems() {
        return this.items;
    }

}
