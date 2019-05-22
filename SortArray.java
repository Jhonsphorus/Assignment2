// Author: Adebayo Johnson
// Date: 21/05/2019
// Purpose: How to create class and method with return

public class SortArray{ 
    public static void main(String args[]) {
        int[] nums = { 1, 4, 7, 5, 6, 10, 2, 8, 9, 3 };
        //int nums[] = { 1, 4, 7, 5, 6, 10, 2, 8, 9, 3 }; 
        int a, b, t;
        int size; 
        size = 10; // number of elements to sort

        // display original array 
        System.out.print("Original array is:"); 
        for(int i=0; i < size; i++){ 
        System.out.print(" " + nums[i]); 
        //System.out.println(); 
        }
        System.out.println(); 
        
        for(a=1; a < size; a++){
            for(b=size-1; b >= a; b--) {
                if(nums[b-1] > nums[b]) { // if out of order exchange elements
                t = nums[b-1]; 
                nums[b-1] = nums[b]; 
                nums[b] = t;
                }
            }

        }
        // display sorted array 
        System.out.print("Sorted array is:"); 
        for(int i=0; i < size; i++) 
        System.out.print(" " + nums[i]); 
        System.out.println();


    }
}