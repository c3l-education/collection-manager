package se.almstudio.collectionmanager.service;

public class BookTitleSorter {

  public static void main(String[] args){
    String [][] books = {
      {"Vanskap", "Algebra", "Statistik", "Didaktik"},
      {"Vargen", "Oktoberbarn", "Taksamhet", "Python"}
    };
    int [][] prices = {
      {150, 200, 130, 300},
      {240, 500, 380, 150}
    };
    showBook(books, prices);
  }

  /**
   * sorting the name of books alphabetically
   * @param books
   * @param prices
   */
  public static void showBook( String[][]books, int[][]prices){
    int count = 1;
    String booksandPrices[] = new String[8];
    System.out.print("------Before Sorting------");
    System.out.println(" ");
    //print books and prices collection before sorting
    for(int i=0; i<books.length; i++) {
      for(int j = 0; j<books[i].length;j++) {
        System.out.print(count + "." + books[i][j] + "," + prices[i][j] + " kr\n");
        booksandPrices[count-1] =  books[i][j] + "," + prices[i][j] + " kr\n";
        count++;
      }
    }
    String temp;
    //sort books alphabetically
    for (int i = 0; i < booksandPrices.length; i++) {
      for (int j = i + 1; j < booksandPrices.length; j++){
        if (booksandPrices[i].compareTo(booksandPrices[j]) > 0){
          temp = booksandPrices[i];
          booksandPrices[i] = booksandPrices[j];
          booksandPrices[j] = temp;
        }
      }
    }
    System.out.println(" ");
    System.out.print("------After Sorting------");
    System.out.println(" ");
    int counter = 1;
    //print books and prices collection after sorting
    for(int i = 0; i<booksandPrices.length;i++){
      System.out.print( counter + "." + booksandPrices[i]);
      counter++;
    }
  }
}
