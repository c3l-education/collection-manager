package se.almstudio.collectionmanager.service;

public class NeighborAgeClassifier {

  //print number of neighbors with the same age in a rows of table
  public static void main(String[]args) {
    int [][] neighborsInformation ={
      {10, 20, 30, 40, 50, 55, 60, 65, 70},
      {21,46,78,111,179,268,358,440,500}
    };
    System.out.printf("%-30.30s  %-30.30s%n", "Age", "Number of Neighbors");
    showNeighborsAge(neighborsInformation);
  }

  /**
   * show persons' age in a table
   * @param neighborsInformation neighbors' age and number of neighbors in each age
   * @return a table including neighbors' information
   */
  public static void showNeighborsAge(int neighborsInformation[][]){
    for(int j = 0; j<9; j++) {
      System.out.printf("%-30.30s  %-30.30s%n", neighborsInformation[0][j], neighborsInformation[1][j]);
    }
  }
}
