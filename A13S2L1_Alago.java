import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class A13S2L1_Alago {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        
        if (arraySize <= 0) {
            System.out.println("Array size must be a positive integer.");
            return;
        }
        
        ArrayList<String> names = new ArrayList<>();
        
        while (names.size() < arraySize) {
            System.out.print("Enter a name: ");
            String name = scanner.next();
            //name checker i.o
            if (!containsIgnoreCase(names, name)) {
                names.add(name);
            } else {
                System.out.println("Name already exists. Please enter a different name.");
            }
        }
        
        displayReverse(names);
        
        scanner.close();
    }
    
    public static boolean containsIgnoreCase(ArrayList<String> list, String name) {
        for (String n : list) {
            if (n.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
    
    public static void displayReverse(ArrayList<String> names) {
        System.out.println("\nNames in reverse order:");
        Collections.reverse(names);
        for (String name : names) {
            System.out.println(name);
        }
    }
}