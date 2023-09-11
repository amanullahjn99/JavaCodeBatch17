package class5_AndNotOperators;

public class E6OROperator {
    public static void main(String[] args) {
      String genre="thriller";
      if(genre.equals("thriller")||genre.equals("HORROR")||genre.equals("sci fi")){
          System.out.println("I a going to watch this movie");
      }else {
          System.out.println("I dont like this genre");
      }
    }
}
