import java.util.*;
import java.io.*;

public class Sorts{
  //Bubble sort of an int array.
  //@postcondition The array will be modified such that the elements will be in increasing order.
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

  public static void selectionSort(int[] data) {
    for (int i = 0; i < data.length; i++) {
      int smallest = i;
      int min = data[i];
      for (int j = i; j < data.length; j++) {
        //repeated values should stay in order
        if (data[j] < min) {
          min = data[j];
          smallest = j;
        }
      }
      int temp = data[i];
      data[i] = data[smallest];
      data[smallest] = temp;
    }
  }

}
