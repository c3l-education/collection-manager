package se.almstudio.collectionmanager.service;

import java.util. Scanner;
public class ExpenseCalculator {

  /*get number of days for driving car as the first input.
  * get driving kilometer as a the second input.
  * calculate expenses with expense function.*/
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number of days: ");
    while (true){
      int sum = 0;
      int numberofDriveDays = input.nextInt();
      for(int i = 1; i <= numberofDriveDays ; i++){
        System.out.println("Day: " + i);
        System.out.println("Enter kilometer: ");
        int kilometer = input.nextInt();
        expense(kilometer);
        int[] dailyCarExpense = new int[numberofDriveDays + 1];
        dailyCarExpense[i] = expense(kilometer);
        sum = sum + dailyCarExpense[i];
        System.out.println("Expenses for the car is: " + dailyCarExpense[i]);
        if(i==numberofDriveDays){
          System.out.println(" ");
          System.out.println(i+ " Daily expenses " + sum  + " kr");
          System.exit(1);
        }
      }
    }
    }

  /**
   * calculate car expense based on driving kilometer
   * @param kilometer
   * @return cartExpense
   */
    public static int expense(int kilometer){
    int carExpense = 850 + 9*kilometer;
    return carExpense;
    }
  }

