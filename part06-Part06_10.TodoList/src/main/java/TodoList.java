
/**
 * File: ToDoList.java
 * Author: Anthony Francis
 * Date: Apr 7, 2020
 * Purpose:
 */
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> toDo;

    public TodoList() {
        this.toDo = new ArrayList<>();
    }

    public void add(String task) {
        this.toDo.add(task);
    }

    public void print() {
        for (String task : this.toDo) {
            System.out.println(toDo.indexOf(task) + 1 + ": " + task);
        }
    }

    public void remove(int number) {
        this.toDo.remove(number - 1);
    }
}
