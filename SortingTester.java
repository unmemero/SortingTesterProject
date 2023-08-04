import java.util.*;
import java.io.*;

public class SortingTester{
    public static void main(String[]args) throws IOException{
        //variable initialization
        Scanner scnr = new Scanner(new File("dictionary.txt"));
        double startTime = 0;
        double endTime = 0;
        double totalTime = 0;
        int totElements = 0;
        while(scnr.hasNextLine()) {
            scnr.nextLine();
            ++totElements;
        }
        System.out.println(totElements);
        // copy from file to array and multiple array copies
        String [] sort1 = new String [totElements];
        Scanner scnr2 = new Scanner(new File("dictionary.txt"));
        for(int i=0;i<sort1.length;++i) {
            sort1[i]=scnr2.nextLine();
        }
        String [] sort2 = new String [totElements];
        for(int i=0;i<sort2.length;++i) {
            sort2[i]=sort1[i];
        }
        String [] sort3 = new String [totElements];
        for(int i=0;i<sort3.length;++i) {
            sort3[i]=sort1[i];
        }
        String [] sort4 = new String [totElements];
        for(int i=0;i<sort4.length;++i) {
            sort4[i]=sort1[i];
        }
        String [] sort5 = new String [totElements];
        for(int i=0;i<sort5.length;++i) {
            sort5[i]=sort1[i];
        }
        String [] sort6 = new String [totElements];
        for(int i=0;i<sort6.length;++i) {
            sort6[i]=sort1[i];
        }
        // method implementation
        Scanner input = new Scanner(System.in);

        System.out.print("Do you want to execute bubble sort? (y/n) ");
        char userInput = input.next().charAt(0);
        if(userInput == 'y') {
            startTime = System.nanoTime();
            SortingAlgorithms.bubbleSort(sort1);
            endTime = System.nanoTime();
            totalTime = endTime-startTime;
            System.out.println("Bubble Sort = " + totalTime + "nanoseconds ");
            System.out.println((totalTime/1000000000)+" seconds");
            System.out.println();
        }

        System.out.print("Do you want to execute selection sort? (y/n) ");
        userInput = input.next().charAt(0);
        if(userInput == 'y') {
            startTime = System.nanoTime();
            SortingAlgorithms.selectionSort(sort2);
            endTime = System.nanoTime();
            totalTime = endTime-startTime;
            System.out.println("Selection Sort = " + totalTime + "nanoseconds ");
            System.out.println((totalTime/1000000000)+" seconds");
            System.out.println();
        }

        System.out.print("Do you want to execute insertion sort? (y/n) ");
        userInput = input.next().charAt(0);
        if(userInput == 'y') {
            startTime = System.nanoTime();
            SortingAlgorithms.insertionSort(sort3);
            endTime = System.nanoTime();
            totalTime = endTime-startTime;
            System.out.println("Insertion Sort = " + totalTime + " nanoseconds");
            System.out.println((totalTime/1000000000)+" seconds");
            System.out.println();
        }

        System.out.print("Do you want to execute merge sort? (y/n) ");
        userInput = input.next().charAt(0);
        if(userInput == 'y') {
            startTime = System.nanoTime();
            SortingAlgorithms.mergeSort(sort4, 0, sort4.length-1);
            endTime = System.nanoTime();
            totalTime = endTime-startTime;
            System.out.println("Merge Sort = " + totalTime + " nanoseconds");
            System.out.println((totalTime/1000000000)+" seconds");
            System.out.println();
        }

        System.out.print("Do you want to execute quicksort? (y/n) ");
        userInput = input.next().charAt(0);
        if(userInput == 'y') {
            startTime = System.nanoTime();
            SortingAlgorithms.quicksort(sort5, 0, sort5.length-1);
            endTime = System.nanoTime();
            totalTime = endTime-startTime;
            System.out.println("QuickSort = " + totalTime + " nanoseconds");
            System.out.println((totalTime/1000000000)+" seconds");
            System.out.println();
        }

        System.out.print("Do you want to execute shell sort? (y/n) ");
        userInput = input.next().charAt(0);
        if(userInput == 'y') {
            startTime = System.nanoTime();
            SortingAlgorithms.shellSort(sort6);
            endTime = System.nanoTime();
            totalTime = endTime-startTime;
            System.out.println("Shell Sort = " + totalTime + " nanoseconds");
            System.out.println((totalTime/1000000000)+" seconds");
            System.out.println();
        }

        System.out.print("Do you want to execute Linear search? (y/n) ");
        userInput = input.next().charAt(0);
        if(userInput == 'y') {
            startTime = System.nanoTime();
            System.out.println("Result for yellow-earth: " + SortingAlgorithms.linearSearch(sort4, "yellow-earth"));
            endTime = System.nanoTime();
            totalTime = endTime-startTime;
            System.out.println("Linear search = " + totalTime + " nanoseconds");
            startTime = System.nanoTime();
            System.out.println("Result for AMARyYO: " + SortingAlgorithms.linearSearch(sort4, "AMARyYO"));
            endTime = System.nanoTime();
            totalTime = endTime-startTime;
            System.out.println("Linear search = " + totalTime + " nanoseconds");
            startTime = System.nanoTime();
            System.out.println("Result for amarillo: "+SortingAlgorithms.linearSearch(sort4, "amarillo"));
            endTime = System.nanoTime();
            totalTime = endTime-startTime;
            System.out.println("Linear search = " + totalTime + " nanoseconds");
            startTime = System.nanoTime();
            System.out.println("Result for yellow: "+SortingAlgorithms.linearSearch(sort4, "yellow"));
            endTime = System.nanoTime();
            totalTime = endTime-startTime;
            System.out.println("Linear search = " + totalTime + " nanoseconds");
            System.out.println();
        }

        System.out.print("Do you want to execute Binary search? (y/n) ");
        userInput = input.next().charAt(0);
        if(userInput == 'y') {
            startTime = System.nanoTime();
            System.out.println("Result for yellow-earth: " + SortingAlgorithms.binarySearch(sort4, " yellow-earth"));
            endTime = System.nanoTime();
            totalTime = endTime-startTime;
            System.out.println("Binary search = " + totalTime + " nanoseconds");
            startTime = System.nanoTime();
            System.out.println("Result for AMARyYO: " + SortingAlgorithms.binarySearch(sort4, "AMARyYO"));
            endTime = System.nanoTime();
            totalTime = endTime-startTime;
            System.out.println("Binary search = " + totalTime + " nanoseconds");
            startTime = System.nanoTime();
            System.out.println("Result for amarillo: "+SortingAlgorithms.binarySearch(sort4, "amarillo"));
            endTime = System.nanoTime();
            totalTime = endTime-startTime;
            System.out.println("Binary search = " + totalTime + " nanoseconds");
            startTime = System.nanoTime();
            System.out.println("Result for yellow: "+SortingAlgorithms.binarySearch(sort4, "yellow"));
            endTime = System.nanoTime();
            totalTime = endTime-startTime;
            System.out.println("Binary search = " + totalTime + " nanoseconds");
            System.out.println();
        }
        
    }
}