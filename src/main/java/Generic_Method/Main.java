package Generic_Method;

public class Main {
    public static void main(String[] args) {
        GenericMathod<Integer,String> genericMathod=
                                      new GenericMathod<>(3,"Tiger");

        System.out.println(genericMathod.toString());
        genericMathod.appendwithx(44.6);
        genericMathod.appendwithx('c');
        //so class level generic is predefined but method level
        //generic to open and take any value at any time
        genericMathod.appendwithx(true);
        String str=genericMathod.display("parrot");
        System.out.println(str);
    }
}
