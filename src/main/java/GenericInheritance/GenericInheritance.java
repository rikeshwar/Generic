package GenericInheritance;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter@Setter
public class GenericInheritance <A,B,C extends Animal>{

    private A x;
    private B y;
    private C z;

    public GenericInheritance(A x, B y,C z) {
        this.x = x;
        this.y = y;
        this.z=z;
    }

    public <V> void printListWithLocalGeneric(List<V> list)
    {
        System.out.println(list);
    }

    public  void printListFix(List<C> list)
    {
        System.out.println(list);
    }
    public  void printListWildCard(List<?> list)
    {
        System.out.println(list);
    }
    public  void printListWildCardUpperBound(List<? extends Animal> list)
            //? is called wild card and need not to declare before use in method signature

    {
        System.out.println(list);
    }





}
