public class Sorts{
  //Bubble sort of an int array.
  //@postcondition The array will be modified such that the elements will be in increasing order.
  public static void bubbleSort(int[] data) {
    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data.length - i - 1; j++) {
        if (data[j] > data[j+1]) {
          int old = data[j];
          data[j] = data[j+1];
          data[j+1] = old;
        }
      }
    }
  }
}
