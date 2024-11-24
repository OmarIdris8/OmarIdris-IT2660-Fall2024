/*
 * IT-2660 - Lab 1
 * Student Name: Omar Idris
 */

 public class Main {
  public static void main(String[] args) {
    
    System.out.println("Hello World!");
    Lab1 lab = new Lab1();
    int i = 0;
    int[] myArray ={5, 9, 3, 12, 7, 3, 11, 5};

   //return array in order using while loop
    while(i<myArray.length) 
    {
      System.out.println(myArray[i]);
      i++;
    }

  //return the array in reverse using for loop
    for (int j = myArray.length-1; j>=0; j--) 
    {
      System.out.println(myArray[j]);
    }

    //return first and last values of array
    System.out.println(myArray[0]);
    System.out.println(myArray[myArray.length-1]);

    //return max using if statement
    System.out.println(lab.max(myArray));
    //return min using if statement
    System.out.println(lab.min(myArray));
    //return sum of array values
    System.out.println(lab.sum(myArray));
    //return average of array values
    System.out.println(lab.average(myArray));
    //return max using for loop
    System.out.println(lab.max(myArray));
    //return min using for loop
    System.out.println(lab.min(myArray));
  }
  
}     

class Lab1 {
  public int increment(int num) {
    return ++num;
  }
  
  public int max(int a, int b) {
  if (a>b)
  {
    return a;
  } 
  else if (b>a)
  {
    return b;
  } 
  else 
  {
    return a;
  }
}

  public int min(int a, int b) {
  if (a<b)
  {
    return a;
  } 
  else if (b<a)
  {
    return b;
  } 
  else 
  {
    return a;
  }
  }

  public int sum(int[] nums) {
    int subTotal = 0;
    for (int i = 0; i < nums.length; i++) 
    {
      subTotal += nums[i];
    }
    return subTotal;
  }
  public double average (int[] nums){
    int subTotal = 0;
    for(int i : nums)
    {
      subTotal += i;
    }
    return ((double)subTotal/(double)nums.length);
  }

  public int max(int[] nums) {
    int currentValue = nums[0];
    for(int i = 0; i<nums.length; i++) 
      {
      if (nums[i]>currentValue)
      {
        currentValue=nums[i];
      }
    }
    return currentValue;
  }

  public int min(int[] nums) {
    int currentValue = nums[0];
    for(int i = 0; i<nums.length; i++) 
    {
      if (nums[i]<currentValue)
      {
        currentValue=nums[i];
      }
    }
    return currentValue;
  }
}