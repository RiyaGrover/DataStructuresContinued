/**Question:
1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. You are required to print all elements of a2 which are also present in 
a1 (in order of their occurence in a2). Make sure to not print duplicates (a2 may have same value present many times).

 */



import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    int n1 = 9;
   int[] a1 = {5, 5, 9, 8, 5, 5, 8, 0, 3};
    int n2 = 18;
    int[] a2 = {9,7,1,0,3,6,5,9,1,1,8,0,2,4,2,9,1,5};

    HashMap<Integer, Integer> frequencyMap = new HashMap<>();
    for(int val : a1){
        if(frequencyMap.containsKey(val)){
            int oldfreq = frequencyMap.get(val);
            int newFreq = oldfreq + 1;
            frequencyMap.put(val , newFreq);
        } else {
            frequencyMap.put(val,1);
        }
    }
    for(int val : a2){
        if(frequencyMap.containsKey(val)){
            System.out.println(val);
            frequencyMap.remove(val);
        }
    }

 }

}