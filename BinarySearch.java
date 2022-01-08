
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
    int[] ar= {1,3,4,6,12,13,16,20,25,44,49};
    int target=4;
    int index = Binary(ar,target);
      
    System.out.println(index);
    } static int Binary(int[]arr, int target){
      int start=0;
      int end =arr.length-1;
      
      while(start<=end){
          int mid =start +(end-start)/2;
          if (arr[mid]>target) {
              end=mid-1;}
          else if (arr[mid]<target) {
              start=mid +1;
            } else return mid;
          }
      
      return -1;
      }
    }
   
        
