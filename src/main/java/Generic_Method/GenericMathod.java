package Generic_Method;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter@AllArgsConstructor
@ToString
public class GenericMathod <A,B>{
    private A x;
    private B y;

    public<T> void appendwithx(T variable)
    {
        System.out.println(x+" And "+variable);
    }
    public<T> T display(T variable)
    {
        //return x+variable;
        //ADDITION NOT SUPPORTED IN GENERIC TYPE
        //since java is not sure whether you wann add or concat the string
        return variable;
    }

}
