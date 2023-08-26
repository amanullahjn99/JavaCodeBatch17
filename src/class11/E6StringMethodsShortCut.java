package class11;

public class E6StringMethodsShortCut {
    public static void main(String[] args) {
        String str="sdfk-ljasSdfAK nL-JSKL^&*)_+J456 46!@#%^&$%AS";
        System.out.println(str.replaceAll("[A-Z]","="));
        System.out.println(str.replaceAll("[A-C]","="));
        System.out.println(str.replaceAll("[a-z]","="));
        System.out.println(str.replaceAll("[0-9]","="));
        System.out.println(str.replaceAll(" ",""));
        System.out.println(str.replaceAll("[A-z]",""));
        System.out.println(str.replaceAll("[&-;]","")); // the range come from ascci table
        System.out.println(str.replaceAll("[A-Z0-9]",""));
        System.out.println(str.replaceAll("[A-Z0-5a-j!-*]",""));
        System.out.println(str.replaceAll("[ks2S-]",""));      //remove selected character

        //RegExr.com sheet which explian cha classes
        System.out.println(str.replaceAll("\\d",""));   //\\d is for remove digits
        System.out.println(str.replaceAll("\\s",""));   //\\s is for remove spaces
        System.out.println(str.replaceAll("[^A-Z]","")); //^ donot remove these A-Z, and remain remove
        System.out.println(str.replaceAll("[^A-Za-z]",""));//^ donot remove these A-Z, and remain remove
    }
}
