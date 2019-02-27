import java.awt.peer.SystemTrayPeer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TodoItem item1 = new TodoItem("okul");
        //TodoItem item2 = new TodoItem("sinema");
        //TodoItem item3 = new TodoItem("okul");
        TodoService todoService = new TodoService();

        //todoService.add(item1);
        //todoService.add(item2);
        //todoService.add(item3);
        System.out.println(todoService.getItems());
        //item1.setCompleted(false);
       //System.out.println("Item's id=> "+item1.getId()+item1.getCompleted());
        //System.out.println(todoService.updateStatus(1,true));
        System.out.println(item1.getName());
        //todoService.updateName(1,"Kursa git");
        //System.out.println(item1.getName());



    }
}
