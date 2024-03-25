import java.sql.Array;
import java.util.ArrayList;
import java.util.List;


public class Expression implements  Terme{

    public Expression(int i, int i1, int i2) {
    }

    public Expression() {

    }

    public List<Terme> getTermes() {
        return termes;
    }

    public void setTermes(List<Terme> termes) {
        this.termes = termes;
    }

    public Expression(List<Terme> termes) {
        this.termes = termes;
    }

    private List<Terme> termes;

    @Override
    public void Calculervaleur( ) {
        Expression expression=new Expression(2,3,4);
        System.out.println("((2+3)*4 ) se decompose en *4 et(2,3) ");


    }
}
