package Review4;

public class E7Arrays {
    public static void main(String[] args) {

        int []salaries ={12000,15000,20000};
        System.out.println(salaries[1]);
        salaries[1]=160000;                 // updating the value at index 1
        System.out.println(salaries[1]);
       // salaries[3]=145000;     out of bound becuase when we create array, then we cannot change the size
      //  System.out.println();
    }

}
