import java.util.*;
public class Insertion{
    public static void main(String[] args){
        int[] arr = {3,6,5,1,0,4,8,7,2,9};
        System.out.println(Arrays.toString(arr));
        
        System.out.println(Arrays.toString(insertionSort(arr)));
        
    }
    
    public static int[] insertionSort(int[] arr){
        int i, key;
        for (int bar = 1; bar<arr.length; bar++){
            key = arr[bar];
            i = bar-1;
            while(i>=0 && key<arr[i]){
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
        }
    
        return arr;
    }
    
}