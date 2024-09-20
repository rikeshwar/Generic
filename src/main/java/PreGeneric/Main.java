package PreGeneric;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pair pair=new Pair("tiger",5);
        //Pair pair1=new Pair("Lion","cat");//this will not work
        //and again required class for each use case

        PairGeneral pairGeneral=new PairGeneral("tiger","Lion");
        PairGeneral pairGeneral1=new PairGeneral("Cat",7);
        pairGeneral1.setX(5);//allowed

        List<PairGeneral> pairGenerals=new ArrayList<>(
                List.of(new PairGeneral("Tiger",9),
                        new PairGeneral("Lion",3),
                        new PairGeneral("cat",6))
        );
        //our user case here (String,Integer) but compiler
        //will allow any combination so now its responsibiliity on programmmer

        pairGenerals.add(new PairGeneral(7,"Pather"));
        pairGenerals.forEach(p-> {
            String str=(String)p.getX();//here no compiler error
            //rather its throw run time exception of Integer can't convert into
            //String and its due to line 23
            Integer z=(Integer) p.getY();
            System.out.println(str+" "+z);
        });

    }
}
