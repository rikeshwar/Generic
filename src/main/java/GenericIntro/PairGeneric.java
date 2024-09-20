package GenericIntro;


public class PairGeneric<A,B> {//<> syntex to define Generic Datatype
    private A x;
    private B y;

    public PairGeneric(A x, B y) {
        this.x = x;
        this.y = y;
    }

    public A getX() {
        return x;
    }

    public void setX(A x) {
        this.x = x;
    }

    public B getY() {
        return y;
    }

    public void setY(B y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "PairGeneric{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
