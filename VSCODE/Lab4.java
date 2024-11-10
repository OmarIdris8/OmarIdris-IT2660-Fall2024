import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Unsorted Array ---------------------------------------------------");
        ArrayList<Integer> integerList = Lab4.getList();
        Lab4.outputList(integerList);

        // Measure the time for bubbleSort 
        System.out.println("\n\nBubble sort results ----------------------------------------------");
        long startTime = System.nanoTime(); // Start time for bubble sort
        ArrayList<Integer> bubbleSortedList = Lab4.bubbleSort(new ArrayList<>(integerList));
        long endTime = System.nanoTime(); // End time for bubble sort
        Lab4.outputList(bubbleSortedList);
        System.out.println("\nTime taken for bubbleSort: " + (endTime - startTime) + " nanoseconds");

        // Measure the time for insertionSort
        System.out.println("\n\nInsertion sort results -------------------------------------------");
        startTime = System.nanoTime(); // Start time for insertion sort
        ArrayList<Integer> insertionSortedList = Lab4.insertionSort(new ArrayList<>(integerList));
        endTime = System.nanoTime(); // End time for insertion sort
        Lab4.outputList(insertionSortedList);
        System.out.println("\nTime taken for insertionSort: " + (endTime - startTime) + " nanoseconds");
    }
}

class Lab4 {
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> integerList) {
        // Step 1 - Implement insertion sort algorithm here

        for (int i = 1; i < integerList.size(); i++) {
            int key = integerList.get(i);
            int j = i - 1;

            // Move elements of integerList[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && integerList.get(j) > key) {
                integerList.set(j + 1, integerList.get(j));
                j = j - 1;
            }
            integerList.set(j + 1, key);
        }
        return integerList;
    }

      

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> integerList) {
        // Step 2 - Implement the bubble sort algorithm here
        
        int n = integerList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (integerList.get(j) > integerList.get(j + 1)) {
                    // Swap the elements
                    int temp = integerList.get(j);
                    integerList.set(j, integerList.get(j + 1));
                    integerList.set(j + 1, temp);
                }
            }
        }
        return integerList;
    }


    public static ArrayList<Integer> getList() {
        ArrayList<Integer> integerList = new ArrayList<>();
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader("integers.txt"))) {
            while ((line = br.readLine()) != null) {
                integerList.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return integerList;
    }

    public static void outputList(ArrayList<Integer> integerList) {
        for (int i = 0; i < integerList.size(); i++) {
            System.out.print(integerList.get(i) + " ");
        }
    }
}

// 1. If you were implementing a sort algorithm for a new language, which sort would you use?
// My understanding is that choice of sorting algorithm would depend on the size of the datasets, but after this practice I would apply 
// Insertion sort. 

// 2. Was there a difference in the time it took for bubble and insertion sort to run? Does this make sense given the time complexities for these sorting algorithms?
// On my first run bubble sort took about 4000000 nanoseconds longer. 
// Time taken for bubble sort was 6814500 nanoseconds
// Time taken for insertion sort was 2814800 nanoseconds
// Both algorithms are O(n^2) but insertion performs quicker especially with nearly sorted or small data. 
// Best case insertion is O(n) if list is already sorted as it performs fewer unnecessary swaps compared to bubble sort.


// 3. Which sort algorithm has an easier implemenation (in terms of understanding) to you?
// Insertion sort has a simple understanding for me. It goes through the list one at a time and correctly inserts element in the sorted part of list.
// Bubble sort compares adjacent elements and swaps them and this is done for every pair in multiple passes throught the list.
// Insertion is easier to implement and visualize like pulling cards from a deck and sorting it in your hand one by one.