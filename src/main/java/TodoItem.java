
public class TodoItem {
    private String name;
    private int id;
    private boolean completed;

    public TodoItem(String name){
        this.name=name;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return this.id;
    }
    public void setCompleted(boolean completed){
        this.completed = completed;
    }
    public boolean getCompleted(){
        return this.completed;

    }

}
