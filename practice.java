
import java.util.Arrays;

class save{
    public static void reverseArray(int[] arr){
        // reverse krna h ab two pointer method k use krke krte h ab
        int i = 0, j = arr.length -1 ;
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; 
            j--;
        }
    }
    public static void main(String[] args){
        int[] arr = { 1, 4, 3, 2, 6, 5};

        reverseArray(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.printf(arr[i] + " ");
        }
    }
}