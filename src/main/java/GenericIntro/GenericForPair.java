package GenericIntro;

import PreGeneric.PairGeneral;

import java.util.ArrayList;
import java.util.List;

public class GenericForPair {
    public static void main(String[] args) {
        PairGeneric<String,String> pairGeneric=new PairGeneric<>("Lion","tiger");

       // pairGeneric.setX(3);//once you declare (String,String) you can't set
        //as integer
        pairGeneric.setX("Panther");
        System.out.println(pairGeneric.toString());

        List<PairGeneric<String,Integer>> pairGenerics=
                             new ArrayList<>(List.of(
                                     new PairGeneric<>("Cat",2),
                                     new PairGeneric<>("Dog",5),
                                     new PairGeneric<>("cow",4)
                             ));
        //pairGenerics.add(new PairGeneric<>("hen","pen"));
        //now this is compiletime error

        pairGenerics.forEach(p->{
            String str=p.getX();
            int z=p.getY();//here autoInboxing happening from Integer to int
            System.out.println(str+" "+z);
        });

        PairGeneric<Integer,String> pairGeneric1=new PairGeneric<>(1,"chittah");
        System.out.println(pairGeneric1.toString());


    }
}
