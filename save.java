////// DSA with jav
// -------------(450) ---------a- 

// ================================(Array)===========================
// Reverse the Array 
/*
Input: arr[] = [1, 4, 3, 2, 6, 5]  
Output:  [5, 6, 2, 3, 4, 1]
Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.

Input: arr[] = [4, 5, 1, 2]
Output: [2, 1, 5, 4]
Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on.
*/

// import java.util.Arrays;

// class save{
//     public static void reverseArray(int[] arr){
//         // reverse krna h ab two pointer method k use krke krte h ab
//         int i = 0, j = arr.length -1 ;
//         while(i <= j){
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             i++; 
//             j--;
//         }
//     }
//     public static void main(String[] args){
//         int[] arr = { 1, 4, 3, 2, 6, 5};

//         reverseArray(arr);
//         for(int i = 0; i < arr.length; i++){
//             System.out.printf(arr[i] + " ");
//         }
//     }
// }

//Find the max and min element in an array
/*
Input: arr[] = [3, 5, 4, 1, 9]
Output: [1, 9]
Explanation: The minimum element is 1, and the maximum element is 9.

Input: arr[] = [22, 14, 8, 17, 35, 3]
Output: [3, 35] 
Explanation: The minimum element is 3, and the maximum element is 35.
// */

// import java.util.ArrayList;

// class GfG {
//     public static ArrayList<Integer> findMinMax(int[] arr) {
//         int mini = Integer.MAX_VALUE;
//         int maxi = Integer.MIN_VALUE;
        
//         // Find minimum and maximum
//         for (int num : arr) {
//             if (num < mini) mini = num;
//             if (num > maxi) maxi = num;
//         }
        
//         ArrayList<Integer> result = new ArrayList<>();
//         result.add(mini);
//         result.add(maxi);
//         return result;
    
// }

//     public static void main(String[] args) {
//         int[] arr = {3, 5, 4, 1, 9};
//         ArrayList<Integer> result = findMinMax(arr);
//         System.out.println(result.get(0) + " " + result.get(1));
//           }
// }


// import java.util.Arrays;
// import java.util.Scanner;

// class Solution {
//     public static int kthSmallest(int[] arr, int k) {
//         Arrays.sort(arr);
//         return arr[k - 1];
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < arr.length; i++){
//             arr[i] = sc.nextInt();
//         }
//         int k = sc.nextInt();
//         int result = kthSmallest(arr, k);
//         System.out.println(result);
//     }
// }


// class Solution {
//     public void sort012(int[] arr) {
//         // algorithm --> count 0, 1, 2
//         int countz = 0, counto = 0, countt = 0;
//         // then insert in same array --> 0, 1, 2
//         for(int num : arr) {
//             if(num == 0) countz++;
//             else if(num == 1) counto++;
//             else countt++;
//         }
        
//         // now inserting element's till count size
//         for(int i = 0 ; i < countz; i++){
//             arr[i] = 0;
//         }
//         for(int i = countz; i < countz + counto; i++){
//             arr[i] = 1;
//         }
//         for(int i = countz + counto ; i < countz + counto + countt; i++){
//             arr[i] = 2;
//         }
//     }
// }


// 4 --> Move all negative number's to the left side of an array 
// Java program to Move all negative numbers
// to beginning and positive to end
/*
Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5
*/
// By using two pointer approach 

// import java.util.Scanner;

// class save{
//     static int[] move(int[] arr){
//         int left = 0, right = arr.length - 1;
//         while(left < right){
//             // jb left m -ve ho tb left ko increase nhi krna bcz hume left m -ve lane h
//             if(arr[left] < 0) left++;

//             else if(arr[right] > 0) right--;

//             // baki bacha test case swap 
//             int temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;
//         }
//         return arr;
//     }

//     public static void main(String[] args) {
//         int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
//         int[] ans = move(arr);

//         for (int num : ans) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }
// }

// User function Template for C++

// class Solution {
//   public:
//     void rotate(vector<int> &arr) {
//         int length = arr.size();
//         // shift by 1 krna h 
//         //sbse pehle agar array k last element store krna 
//         // store = 5
//         int store = arr[length - 1];
//         // aur fhir 1 shift krna array k elements ko
//         // .. | 1 | 2 | 3 | 4|
//         for(int i = length - 1; i > 0; i--){
//             arr[i] = arr[i - 1];
//         }
//         // arr[4] = arr[3]
//         // arr[3] = arr[2]
//         // arr[2] = arr[1]
//         // arr[1] = arr[0]
//         arr[0] = store;
        
//         // aur fhir last element ko 1st index p store krna 
//         //  5 | 1 | 2 | 3 | 4 |
//     }
// // };

// 8, 13).------------Kadane's Algorithm-------------
// class Solution {
//     int maxSubarraySum(int[] arr) {
//         // kadane algorithm --> largest subarray sum --> 
//         int sum = arr[0];
//         int Max = arr[0];
//         for(int i = 1; i < arr.length; i++){
//             sum = Math.max(arr[i], sum + arr[i]);
//             // if(sum < 0) sum = 0; 
//             Max = Math.max(Max, sum);
//         }
//         return Max;
//     }
// }


// 9).---------

// ------------------------(String)------------------------
// Reverse String 
// class Solution {
//     public void reverseString(char[] s) {
//         int i = 0, j = s.length - 1;
//         while(i < j){
//             char c = s[i];
//             s[i] = s[j];
//             s[j] = c;
//             i++;
//             j--;
//         }
//     }
// }

// Palimdrome 
// class Solution {
//     boolean isPalindrome(String s) {
//         int i = 0, j = s.length() - 1;
//         while(i < j){
//             if(s.charAt(i) != s.charAt(j)) return false;
//             i++;
//             j--;
            
//         }
//         return true;
//     }
// }


/*
Input: s = "geeksforgeeks"
Output: ['e', 4], ['g', 2], ['k', 2], ['s', 2]
Explanation: Characters e, g, k, and s appear more than once. Their counts are shown in order of first occurrence.
*/

import java.util.*;

class Main{
    static void printDuplicates(String s){
        char[] arr = s.toCharArray();
    Arrays.sort(arr); // eeeefggkkss
    for(int i = 0; i < arr.length; ){
        int count = 1;
        // i = 0 --> 0 + 1 -> 1 < 13 && e == e(duplicate find krna)
        while(i + count  < arr.length && arr[i] == arr[i + count]){
            count++;
        } 
        if(count > 1) {
            System.out.println(arr[i] + " " + count);
        }
        i += count;
    }
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        printDuplicates(s);
    }
}

/*
Dry run :-- 
// print duplicates 
geeksforgeeks --> g --> 2
e --> 4
k --> 2
s --> 2


// eeee f  ggkk ss
// 0123 4 5678910

i = 0 --> 
count = 1;


arr[i] == arr[i + count] 

// agar count 1 se bda h to 
*/

//Check if Strings Are Rotations of Each Other
