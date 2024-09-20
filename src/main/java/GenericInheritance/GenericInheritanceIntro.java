package GenericInheritance;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter@AllArgsConstructor
public class GenericInheritanceIntro{
    public static void main(String[] args) {

        List<Animal> animals=new ArrayList<>(List.of(
                new Animal(),new Animal(),new Animal()
        ));
        List<Cat> cats=new ArrayList<>(
                List.of(
                        new Cat(),new Cat(),new Cat()
                )
        );

        GenericInheritance<String, String,Animal> genericInheritance=new GenericInheritance<String,String,Animal>(
                                        "pen","book",new Animal()
        );
        genericInheritance.printListWithLocalGeneric(animals);
        genericInheritance.printListWithLocalGeneric(cats);
       //genericInheritance.printListFix(cats);here its error  class level generic
       //is fixed and if used in method then its expect
        genericInheritance.printListFix(animals);

        //genericInheritance.printListFix(cats);here problwm is even though in class
        //defination C extends Animal means C could be Animal or any of its subclass
        //but when we create object and <String, String,Animal> fixed C as Animal
        //and for that object now if C refered somehwere else like in method its now
        //expecting Animal only hemce cats list not working .......though one
        //can use wild card

        genericInheritance.printListWildCard(cats);//allowed
        genericInheritance.printListWildCardUpperBound(cats);//also allowed
        genericInheritance.printListWithLocalGeneric(cats);
        //this one allowed as Generic <v> local  to method
        //ans method Generic are flexible and its sync with type passed to
        //method parameter while using


    }


}
