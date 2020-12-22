import java.util.*;
import java.io.*;
public class tester {
  public static void main(String[] args) {
    /**
    System.out.println("seed 100");
    int[] arr = new int[5];
    Random rng = new Random(100);//seed of 100 is stored.
    for(int i =  0; i < arr.length; i++ ){
      arr[i] = rng.nextInt() % 1000;
    }
    System.out.println(Arrays.toString(arr));
    Sorts.bubbleSort(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println(check(arr));
    System.out.println();

    System.out.println("seed 1000");
    int[] arr2 = new int[5];
    Random rng2 = new Random(1000);
    for(int i =  0; i < arr2.length; i++ ){
      arr2[i] = rng2.nextInt() % 1000;
    }
    System.out.println(Arrays.toString(arr2));
    Sorts.bubbleSort(arr2);
    System.out.println(Arrays.toString(arr2));
    System.out.println(check(arr2));
    System.out.println();

    System.out.println("no seed");
    int[] arr3 = new int[5];
    Random rng3 = new Random();
    for(int i =  0; i < arr3.length; i++ ){
      arr3[i] = rng3.nextInt() % 1000;
    }
    System.out.println(Arrays.toString(arr3));
    Sorts.bubbleSort(arr3);
    System.out.println(Arrays.toString(arr3));
    System.out.println(check(arr3));
    System.out.println();

    System.out.println("repeats");
    int[] arr4 = new int[] {6,8,9,17,4,6,10,8,13};
    System.out.println(Arrays.toString(arr4));
    Sorts.bubbleSort(arr4);
    System.out.println(Arrays.toString(arr4));
    System.out.println(check(arr4));
    System.out.println();
    System.out.println();
    */

    System.out.println("CUSTOM TESTS?? w/ no duplicates");
    //good if this doesn't print anything
    int times = 100;
    int size = 100;
    int error = 0;

    System.out.println("BUBBLE SORT!!!");
    for (int i = 0; i < times; i++) {
      int[] a = new int[size];
      Random r = new Random();
      int seed = r.nextInt() % 1000;
      Random num = new Random(seed);
      for(int j =  0; j < a.length; j++ ){
        a[j] = num.nextInt() % 1000;
      }
      int[] compare = a.clone();
      Arrays.sort(compare);
      Sorts.bubbleSort(a);
      if (!Arrays.equals(a, compare)) {
        System.out.println("error in test case " + i);
        error++;
      }
      //REVERSE TESTS
      reverse(compare);
      reverse(a);
      Sorts.bubbleSort(a);
      Arrays.sort(compare);
      if (!Arrays.equals(a, compare)) {
        System.out.println("REVERSE SORT error in test case " + i);
        error++;
      }
    }
    System.out.println();

    System.out.println("SELECTION SORT!!!");
    for (int i = 0; i < times; i++) {
      int[] a = new int[size];
      Random r = new Random();
      int seed = r.nextInt() % 1000;
      Random num = new Random(seed);
      for(int j =  0; j < a.length; j++ ){
        a[j] = num.nextInt() % 1000;
      }
      int[] compare = a.clone();
      Arrays.sort(compare);
      Sorts.selectionSort(a);
      if (!Arrays.equals(a, compare)) {
        System.out.println("error in test case " + i);
        error++;
      }
      //REVERSE TESTS
      reverse(compare);
      reverse(a);
      Sorts.selectionSort(a);
      Arrays.sort(compare);
      if (!Arrays.equals(a, compare)) {
        System.out.println("REVERSE SORT error in test case " + i);
        error++;
      }
    }
    System.out.println();

    System.out.println("INSERTION SORT!!!");
    for (int i = 0; i < times; i++) {
      int[] a = new int[size];
      Random r = new Random();
      int seed = r.nextInt() % 1000;
      Random num = new Random(seed);
      for(int j =  0; j < a.length; j++ ){
        a[j] = num.nextInt() % 1000;
      }
      int[] compare = a.clone();
      Arrays.sort(compare);
      Sorts.insertionSort(a);
      if (!Arrays.equals(a, compare)) {
        System.out.println("error in test case " + i);
        error++;
      }
      //REVERSE TESTS
      reverse(compare);
      reverse(a);
      Sorts.insertionSort(a);
      Arrays.sort(compare);
      if (!Arrays.equals(a, compare)) {
        System.out.println("REVERSE SORT error in test case " + i);
        error++;
      }
    }
    System.out.println();

    if (error == 0) System.out.println("GOOD JOBBB!!");
  }

  public static String check(int[] arr) {
    for (int i = 0; i < arr.length-1; i++) {
      if (arr[i] > arr[i+1]) {
        return "you're baddd";
      }
    }
    return "you gooddd";
  }

  public static void reverse(int[] arr) {
    for(int i = 0; i < arr.length; i++) {
      arr[arr.length - 1 - i] = i;
    }
  }

}
