import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //--------------- Arrays----------
//        int[] array = {6,2,3,4,5,8,9,8,8};
//        for(int num : array)
//        {
//        System.out.println(num);
//        }
//        for (int i =0;  i < Array.getLength(array); i++)
//        {
//            System.out.println("Element Number " + (i + 1) + " = " + array[i]);
//        }

        // -------------- Dynamic Arrays ---------------
//        String userInput;
//        ArrayList<Integer> dynamicArray = new ArrayList<>();
//        while (true) {
//            System.out.println("Please Enter the array element value:");
//            int num = scanner.nextInt();
//            dynamicArray.add(num);
//
//            while (true) {
//                System.out.println("Would you like to add another element? (y/n)");
//                userInput = scanner.next().trim().toLowerCase();
//
//                if (userInput.equals("y") || userInput.equals("n")) {
//                    break;
//                }
//                System.out.println("Invalid input. Please enter 'y' for Yes or 'n' for No.");
//            }
//
//            if (userInput.equals("n")) {
//                break;
//            }
//        }

//        System.out.println("Elements in the dynamic array:");
//        for (int number : dynamicArray) {
//            System.out.println(number);
//        }
//        scanner.close();

        //--------------------- Linked List------------------------------
//        LinkedList list = new LinkedList();
//        int[] listData ={10,20,30,40,50};
//        for(int value : listData){
//            list.insert(value);
//        }
//        list.delete(30);
//        list.display();

        //-------------------- Queue---------------------------------
//        Queue queue = new Queue();
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.display();
//        queue.dequeue();
//        queue.display();

        //-------------------- Stack ---------------------------------
//        Stack stack = new Stack();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.display();
//        stack.pop();
//        stack.display();

        //------------------------- Maps ----------------------
//        HashMap<String, Integer> map = new HashMap<>();
//
//        // Inserting key-value
//        map.put("Noah", 25);
//        map.put("Mohamed", 30);
//        map.put("Ahmed", 22);
//
//        // Retrieving a value
//        System.out.println("Noah's age: " + map.get("Noah")); // Output: 25
//
//        // Removing a key-value pair
//        map.remove("Ahmed");
//
//        // Checking if a key exists
//        System.out.println("Contains Mohamed? " + map.containsKey("Mohamed")); // Output: true
//
//        // Iterating through the map
//        for (String key : map.keySet()) {
//            System.out.println(key + " -> " + map.get(key));
//        }
    }
}