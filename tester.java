import java.util.*;
import java.io.*;
public class tester {
  public static void main(String[] args) {
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
    Random rng2 = new Random(1000);//seed of 100 is stored.
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
    Random rng3 = new Random();//seed of 100 is stored.
    for(int i =  0; i < arr3.length; i++ ){
      arr3[i] = rng3.nextInt() % 1000;
    }
    System.out.println(Arrays.toString(arr3));
    Sorts.bubbleSort(arr3);
    System.out.println(Arrays.toString(arr3));
    System.out.println(check(arr3));

  }

  public static String check(int[] arr) {
    for (int i = 0; i < arr.length-1; i++) {
      if (arr[i] > arr[i+1]) {
        return "you're baddd";
      }
    }
    return "you gooddd";
  }
  
}
