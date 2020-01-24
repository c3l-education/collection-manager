package se.almstudio.collectionmanager.service;

import java.util.Scanner;
public class StudentScoreTracker {

  /*the program has a collection of students grade named "gradeScale".
  The user is asked to enter a grade between A and F and as output the program
  prints number of grades in "gradeScale" which are the same as entered number*/
  public static void main(String[] args) {
    /* the default grades collection*/
    char [][] gradeScale = {
      {'A', 'E', 'D', 'C', 'B', 'A'},
      {'B', 'F', 'E', 'D', 'A', 'B'},
      {'C', 'A', 'F', 'E', 'D', 'C'},
      {'D', 'B', 'A', 'F', 'E', 'D'},
      {'E', 'C', 'B', 'A', 'F', 'E'}
    };
    while (true){
      double numberofSameGrades = 0;
      /*if a user enters S, the "STOPP!" message will be printed*/
      char S = 0;
      System.out.println("Enter a grade between A-F: ");
      Scanner userInput = new Scanner(System.in);
      char gradeInput = userInput.next().charAt(0);
      if(gradeInput == 'S'){
        System.out.println("STOPP!");
        System.exit(1);
      }
      for (int i=0; i<5; i++){
        for(int j=0; j<6; j++){
          if(gradeScale[i][j]==gradeInput){
            numberofSameGrades++;
          }
        }
      }
      System.out.println("There are " + numberofSameGrades + " students who got " + gradeInput);
    }
  }
}
