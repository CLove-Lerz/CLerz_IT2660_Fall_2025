//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Christine Lerz: 
 */

public class Main {
  public static void main(String[] args) {
       System.out.println("hello, world!");
    // Create an array with values {5, 9, 3, 12, 7, 3, 11, 5}
    int[] numbers = {5, 9, 3, 12, 7, 3, 11, 5};
    
    // Output the array in order using a while loop
    System.out.println("Array in order:");
    int i = 0; 
    while (i < numbers.length) { 
      System.out.println(numbers[i]); 
      i++; 
    }

	// Output the array in reverse using a for loop
    System.out.println("Array in reverse order:");
    for (int j = numbers.length - 1; j >= 0; j--) {
      System.out.println(numbers[j]);
    }
    
    // Output the first and last values of the array
    System.out.println("First value of array: " + numbers[0]);
    System.out.println("Last value of array: " + numbers[numbers.length - 1]);
    
    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));
    // Calling methods added as part of lab1
    System.out.println("Max: " + lab.max(5, 25));
    System.out.println("Min: " + lab.min(5, 10)); 
    int totalSum = lab.sum(numbers);
    System.out.println("Sum of array: " + totalSum);
    double avg = lab.average(numbers);
    System.out.println("The of the array numbers: " + avg);
    int maxNumber = lab.max(numbers);
    System.out.println("The maximum value in the array: " + maxNumber);
    int minimumValue = lab.min(numbers);
        System.out.println("The minimum value in the array: " + minimumValue);
    }
}

// Add all of the methods here
class Lab1 {
    public int increment(int num) {
        return ++num;
    }

//max(int a, int b): Use an if-statement to return the maximum value.
  public int max(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }
  
//min(int a, int b): Use an if-statement to return the minimum value.  
  public int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
    
//sum(int[] nums): Return the sum of all values in the array.
   public int sum(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        return total;
    }
    
//average(int[] nums): Use a foreach loop to return the average.    
   public double average(int[] nums) {
            double sum = 0;
            for (int num : nums) { 
                sum += num;
            }
            return sum / nums.length;
    }
    
//max(int[] nums): Use a for loop to return the maximum value.    
    public int max(int[] nums) {
            int maxValue = nums[0];
            for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
            }
        }
        return maxValue;
    }
    
//min(int[] nums): Use a for loop to return the minimum value.   
    public int min(int[] nums) {
            
            int minValue = nums[0]; 
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < minValue) {
                    minValue = nums[i]; 
                }
            }
            return minValue;
     }
    
}

