import java.util.List;

public class Unaire extends Expression{
    public  int a;
    public Unaire(List<Terme> termes) {
        super(termes);

    }
    public Unaire(int a){
        this.a=a;
    }

    @Override
    public List<Terme> getTermes() {
        return super.getTermes();
    }


    public void Calculervaleur1(int a ) {
        System.out.println(a);

    }
}

