package class5_AndNotOperators;

public class E5OROperator {
    public static void main(String[] args) {
       boolean broughtFlowers=false;
       boolean broughtChocolates=true;
       boolean allMyMistake=false;

       if(broughtChocolates||broughtFlowers|| allMyMistake){
           System.out.println("Wife is happy");
       }else{
           System.out.println("Wife is sad");
       }
    }
}
