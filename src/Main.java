import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Expression unaire=new Expression((2),(4),(3));
        Expression binaire=new Expression(1,4,3);
        List<String> expressions = new ArrayList<>();
        Unaire unaire1=new Unaire(2);

        // Ajouter des expressions à la liste
        expressions.add("2 + 3");
        expressions.add("4 * 5");
        expressions.add("10 / 2");
       unaire.Calculervaleur();
       binaire.Calculervaleur();

       unaire1.Calculervaleur1(unaire1.a);
    }
}