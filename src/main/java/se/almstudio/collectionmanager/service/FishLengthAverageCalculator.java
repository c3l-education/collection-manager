package se.almstudio.collectionmanager.service;

public class FishLengthAverageCalculator {

  //print a collection of fish sizes and calculate the length average
  public static void main(String[]args){
    double sumAllFishSizes = 0;
    System.out.println("Length of all fishes in cm: ");
    double [] allFishSizes = {20, 15, 35, 45, 30, 40, 25, 40, 20, 50};
    for(int i=0; i<allFishSizes.length; i++){
      double oneFishSize = allFishSizes[i];
      sumAllFishSizes = sumAllFishSizes + allFishSizes[i];
      System.out.print(oneFishSize +"");
    }
    System.out.println();
    double averageofFishSizes = average(allFishSizes);
    System.out.println("Average length of fishes is: " + averageofFishSizes);
  }

  /**
   * calculate the average of numbers
   * @param input collection of double numbers
   * @return the average of numbers
   */
  public static double average(double [] input){
    double sumofItems = 0;
    double numberofItems = 0;
    for(int counter = 0; counter < input.length; counter++){
      sumofItems = (int) (sumofItems + input[counter]);
      numberofItems = numberofItems + 1;
    }
    double averageofItems = (sumofItems/numberofItems);
    return averageofItems;
  }
}
