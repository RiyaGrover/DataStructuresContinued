/**
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are given a number k.
4. You are required to find and print the k largest elements of array in increasing order.
 */



import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here,

    int k = 3;
    int[] arr = {10 , 19 , 3, 74, 86, 57,24,5, 11 , 3};
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    for(int i = 0 ; i < k ; i++){
        pq.add(arr[i]);
    }
    for (int i = k ;i < arr.length ; i++){
        int val = arr[i];
        if(val > pq.peek()){
            pq.remove();
            pq.add(val);
        }
    }
    while(pq.size()>0){
        System.out.println(pq.peek());
        pq.remove();
    }
 }

}