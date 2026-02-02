package collections.list;
// ArrayListProblem.java
// A simple Java program to demonstrate ArrayList operations
// including adding, removing, and accessing elements.
// This program is part of the collections.list package.
//What is ArrayList in Java?
//ArrayList in Java is a resizable array implementation of the List interface.
// It allows dynamic arrays that can grow as needed.
// It provides methods to manipulate the size of the array that is used internally to store the list.
// It is part of the java.util package and provides various methods for adding, removing, and accessing elements.
// Example of ArrayList usage in Java is shown below.
// 1. Import the ArrayList class
// 2. Create an ArrayList
// 3. Add elements to the ArrayList
// 4. Access elements from the ArrayList
// 5. Remove elements from the ArrayList
// 6. Iterate through the ArrayList

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProblem {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Add Elements in ArrayList: ");
        while(true) {
            int num = sc.nextInt();
            if(num == -1) {
                break;
            }
            a1.add(num);
        }

    }
}
