import java.util.ArrayList;

public class ArrayVSarrayList {
    public static void main(String[] args) {

     // Array example
        int[] numbers = new int[5]; // array is created to hold 5 values
        /*
        Variables are created and value assigned
        */
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        /*
        if we try to assign numbers[5] it will cause an error; since array is not resizable
        */
        System.out.println("Array values:");
        for (int n : numbers) {
            System.out.println(n);
        }

    
        // ArrayList example
        ArrayList<Integer> list = new ArrayList<>();
        // since array list is dynamic we can add as many value as we want
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40); 

        System.out.println("\nArrayList values:");
        for (int value : list) {
            System.out.println(value);
        }

        // ArrayLists allow removal
        list.remove(1); // removes the element at index 1
        System.out.println("\nArrayList after removal: " + list);
    }
}