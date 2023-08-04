
public class SortingAlgorithms{

    //bubble sort
    public static void bubbleSort(String [] a) {
        String temp = " ";
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++) {
                if(a[j].compareTo(a[j+1])>0){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            System.out.print(i+" ");
        }
    }

   /***************************************************************************************
   *    Title: Selection Sort
   *    Author: Servin, C.
   *    Date: 10/11/2021
   *    Code version: Uknown
   *    Availability: https://learn.zybooks.com/zybook/EPCCCOSC1437Fall2021/chapter/7/section/2
   *
   ***************************************************************************************/
    public static void selectionSort(String [] a) {
        int indexSmallest;
        String temp;
        for (int i = 0; i < a.length - 1; ++i) {
           indexSmallest = i;
           for (int j = i + 1; j < a.length; ++j) {
              if (a[j].compareTo(a[indexSmallest])<0) {
                 indexSmallest = j;
              }
           }
         temp = a[i];
           a[i] = a[indexSmallest];
           a[indexSmallest] = temp;
        }
    }

   /***************************************************************************************
   *    Title: Insertion Sort
   *    Author: Servin, C.
   *    Date: 10/11/2021
   *    Code version: Uknown
   *    Availability: https://learn.zybooks.com/zybook/EPCCCOSC1437Fall2021/chapter/7/section/3
   *
   ***************************************************************************************/
    public static void insertionSort(String [] a) {
        String temp;

        for (int i = 1; i < a.length; ++i) {
            int j = i;
            while (j > 0 && a[j].compareTo(a[j-1])<0) {

                temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
                --j;
            }
        }
    }

   /***************************************************************************************
   *    Title: Merge Sort
   *    Author: Servin, C.
   *    Date: 10/11/2021
   *    Code version: Uknown
   *    Availability: https://learn.zybooks.com/zybook/EPCCCOSC1437Fall2021/chapter/7/section/5
   *
   ***************************************************************************************/
    public static void merge(String [] a, int i, int j, int k) {
        int mergedSize = k - i + 1;
        String [] mergedNumbers  = new String[mergedSize];
        int mergePos = 0;
        int leftPos = i;
        int rightPos = j + 1;
        while (leftPos <= j && rightPos <= k) {
           if (a[leftPos].compareTo(a[rightPos])<0) {
              mergedNumbers[mergePos] = a[leftPos];
              ++leftPos;
           } 
           else {
              mergedNumbers[mergePos] = a[rightPos];
              ++rightPos;
           }
           ++mergePos;
        }
        while (leftPos <= j) {
           mergedNumbers[mergePos] = a[leftPos];
           ++leftPos;
           ++mergePos;
        }
        while (rightPos <= k) {
           mergedNumbers[mergePos] = a[rightPos];
           ++rightPos;
           ++mergePos;
        }
        for (mergePos = 0; mergePos < mergedSize; ++mergePos) {
           a[i + mergePos] = mergedNumbers[mergePos];
        }
     }
     public static void mergeSort(String [] a, int i, int k) {
        int j;
        if (i < k) {
           j = (i + k) / 2;
           mergeSort(a, i, j);
           mergeSort(a, j + 1, k);
           merge(a, i, j, k);
        }
     }
     
   /***************************************************************************************
   *    Title: Quick Sort
   *    Author: Servin, C.
   *    Date: 10/11/2021
   *    Code version: Uknown
   *    Availability: https://learn.zybooks.com/zybook/EPCCCOSC1437Fall2021/chapter/7/section/4
   *
   ***************************************************************************************/
     public static int partition(String [] a, int i, int k) {
        int l=i;
        int h=k;
        int midpoint=i + (k - i) / 2;
        String pivot=a[midpoint];
        String temp;
        boolean done=false;
        while (!done) {
           while (a[l].compareTo(pivot) < 0) {
              ++l;
           }
           while (pivot.compareTo(a[h]) < 0) {
              --h;
           }
           if (l >= h) {
              done = true;
           } 
           else {
              temp = a[l];
              a[l] = a[h];
              a[h] = temp;
              ++l;
              --h;
           }
        }
        return h;
     }
     public static void quicksort(String [] a, int i, int k) {
        int j;
        if (i >= k) {
           return;
        }
        j = partition(a, i, k);
        quicksort(a, i, j);
        quicksort(a, j + 1, k);
     }

   /***************************************************************************************
   *    Title: Shell Sort
   *    Author: Baeldung
   *    Date: 10/11/2021
   *    Code version: Uknown
   *    Availability: https://www.baeldung.com/java-shell-sort
   *
   ***************************************************************************************/
    public static void shellSort(String [] a) {
        int n = a.length;
      for (int gap = n / 2; gap > 0; gap /= 2) {
         for (int i = gap; i < n; i++) {
               String key = a[i];
               int j = i;
               while (j >= gap && a[j - gap].compareTo(key) > 0) {
                  a[j] = a[j - gap];
                  j -= gap;
               }
               a[j] = key;
         }
      }
    }

    public static boolean linearSearch(String [] a, String target) {
        for(int i=0;i<a.length;++i) {
            if(a[i].equals(target)){
                return true;
            }
        }
        return false;
    }

   /***************************************************************************************
   *    Title: Binary Search
   *    Author: Servin, C.
   *    Date: 10/11/2021
   *    Code version: Uknown
   *    Availability: https://learn.zybooks.com/zybook/EPCCCOSC1437Fall2021/chapter/8/section/2
   *
   ***************************************************************************************/
    public static boolean binarySearch(String [] a, String target) {
      int mid = 0;
      int low =0;
      int high = a.length-1;
      while (high>=low){
         mid = (high+low)/2;
         if(a[mid].compareTo(target) < 0)
            low = mid +1;
         else if(a[mid].compareTo(target) > 0)
            high = mid -1;
         else
            return true;
      }
      return false;
    }
}