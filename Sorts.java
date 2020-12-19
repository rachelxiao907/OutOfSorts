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
        //repeated values should stay in order
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
  //doesn't swap!!
  public static void insertionSort(int[] data) {
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < i; j++) {
        if (data[i] < data[j]) {
          int temp = data[i];
          for (int x = i - 1; x >= j; x--) {
            data[x+1] = data[x];
          }
          data[j] = temp;
          j = i;
        }
      }
    }
  }

}
