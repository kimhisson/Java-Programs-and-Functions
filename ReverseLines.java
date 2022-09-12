/*
 Kim Johnson
 CPSC-34000-004
 ReverseLines.java
 --------------
 * This program contains 1 method: PUBLIC reverseArrayList(ArrayList).
 * reverseArrayList(ArrayList<String> list): accepts an ArrayList of Strings and returns an ArrayList
 * of Strings in reverse order.
*/
import java.util.*;

// *** START PROGRAM ***
public class Main {
    // --- Start Main ---
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(); // Creates an array called myList to store String values.
        ArrayList<String> reversedList; // Creates an array to store reversed String values of myList.

        Scanner s = new Scanner(System.in); // Creates scanner object s for accepting input.
        String done = "DONE"; // Once the user inputs DONE, input is ended. This stores a DONE comparison value.
        // Get String input.
        System.out.println("Enter a line of text. Type DONE if you are done entering lines of text: ");
        String lines = s.nextLine(); // nextLine() accepts Strings with spaces (sentences).

        // while input(variable "lines") is not equal to DONE do this...
        while(!lines.equals(done)) {
            myList.add(lines); // adds input to myList
            // Get additional lines because input did not equal to DONE.
            System.out.println("Enter another line of text. Type DONE if you are done entering lines of text: ");
            lines = s.nextLine(); // stores new input into var. lines.
        }
        // Calls to function reverseArrayList(myList) to output myList in reverse order.
        reversedList = reverseArrayList(myList); // myList is now reversed and stored as a new ArrayList: reversedList.

        // *** NOTE: String.join WILL ONLY WORK IN JAVA 8 OR LATER. ***
        /* String.join gets the new reversed ArrayList and using the delimiter of a space and (and \n
         * so that each line show up in the next line. Creates a String so output will be a line of text.*/
        String listToString = String.join(" \n", reversedList);
        System.out.println(listToString); // Output is now a String, not an ArrayList.

        s.close(); // Close Scanner.
    }

    // --- End Main ---

    // --- Start METHOD PUBLIC reverseArrayList(ArrayList<String> list) ---
    /* Accepts an ArrayList and returns an ArrayList in reverse order.*/

    public static ArrayList<String> reverseArrayList(ArrayList<String> list) {
        // Creates new ArrayList for storing list elements in reverse order.
        ArrayList<String> reverseList = new ArrayList<String>();
        /* For loop to go through list starting from end of list. Decrements as it adds values into
         * the new ArrayList reverseList (reverseList is what will be returned from this method.)*/
        for (int i = list.size() - 1; i >= 0; i--) {
            reverseList.add(list.get(i)); // adds list elements in reverse order.
        }
        return reverseList; // Returns the reversed arraylist
    }

    // --- END METHOD reverseArrayList(ArrayList<String> list) ---
}
// *** END PROGRAM ***


