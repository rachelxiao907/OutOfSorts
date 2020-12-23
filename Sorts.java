import java.util.*;
import java.io.*;

public class Sorts {
  /**Bubble sort of an int array.
  *postcondition - The array will be modified such that the elements will be in increasing order.
  *param data - the elements to be sorted.
  */
  public static void bubbleSort(int[] data) {
    boolean sorted = false;
    for (int end = 0; !sorted; end++) {
      sorted = true;
      for (int i = 0; i < data.length - 1 - end; i++) {
        if (data[i] > data[i+1]) {
          sorted = false;
          int old = data[i];
          data[i] = data[i+1];
          data[i+1] = old;
        }
      }
    }
  }

  /**selection sort of an int array.
  *postcondition - The array will be modified such that the elements will be in increasing order.
  *param data - the elements to be sorted.
  */
  public static void selectionSort(int[] data) {
    for (int i = 0; i < data.length - 1; i++) {
      int smallest = i;
      for (int j = i; j < data.length; j++) {
        if (data[j] < data[smallest]) {
          smallest = j;
        }
      }
      int temp = data[i];
      data[i] = data[smallest];
      data[smallest] = temp;
    }
  }

  /**insertion sort of an int array.
  *postcondition - The array will be modified such that the elements will be in increasing order.
  *param data - the elements to be sorted.
  */
  public static void insertionSort(int[] data) {
    for (int i = 1; i < data.length; i++) {
      int temp = data[i];
      int index = i;
      //shift the elements over until you find the correct spot
      for (int j = i - 1; j >= 0 && temp < data[j]; j--) {
         data[j+1] = data[j];
         index = j;
      }
      //then store the current element there
      data[index] = temp;
    }
  }

}
