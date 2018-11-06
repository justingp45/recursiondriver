

import java.util.Scanner;
public class recursionDriver
{
 
 public static int count(int n)
 {
     if (n<1)
        return 0;
     return 4+count(n-1);
 }
 
 public static int count2(int n){
     if (n<1)
        return 0;
     return 20+count2(n-1);
    }
 
 public static int fingerCount(int n){
     if (n<1)
        return 0;
     return 10+fingerCount(n-1);
    }
 
 public static int countOdd(int n){
     if (n<1)
        return 0;
     if (n%2==0)
        n -= 1;
     return n+countOdd(n-2);
    }
    
 public static void main(String[] args)
 {
     /*
     * Count 
     * 1. Number of legs 10 elephant have
     * 2. Number of students in a school if each
     * class has 20 students and there are 12 rooms
     * 3. Number of fingers if there are 8 people
     * 4. Find the sum of odd numbers from 0 to N
     * 5. Find the sum of even numbers from 0 to N
    */ 
     int counted=0;
     // Task 1.
     System.out.println(" **Task 1** ");
     counted = count(10);
     System.out.println("They have "+counted+" legs.");
     
     // Task 2.
     System.out.println("");
     System.out.println(" **Task 2** ");
     counted = count2(12);
     System.out.println("There are "+counted+" students.");
     
     // Task 3.
     System.out.println("");
     System.out.println(" **Task 3** ");
     counted = fingerCount(8);
     System.out.println("There are "+counted+" fingers.");
     
     // Task 4.
     System.out.println("");
     System.out.println(" **Task 4** ");
     Scanner s = new Scanner(System.in);
     int x = s.nextInt();
     counted = countOdd(x);
     System.out.println("The sum is "+counted+".");
     
     
 }
}

