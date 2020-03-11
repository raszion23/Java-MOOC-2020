
import java.util.ArrayList;

/**
 * File: Stack.java 
 * Author: Anthony Francis 
 * Date: Mar 11, 2020 
 * Purpose:
 */
public class Stack {

    private ArrayList<String> values;

    public Stack() {
        this.values = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (values.isEmpty()) {
            return true;
        }
        return false;
    }

    public void add(String value) {
        if (!values.contains(value)) {
            values.add(value);
        }

    }

    public String take() {
        String value = this.values.remove(this.values.size() - 1);
        return value;
    }

    public ArrayList<String> values() {
        return this.values;
    }
}
