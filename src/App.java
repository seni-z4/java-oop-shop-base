import org.lessons.java.shop.Prodotto;

public class App {
    public static void main(String[] args) throws Exception {
        Prodotto pt = new Prodotto(11, "seniya", "e solo discpolitr in qiesto negozio", 100, 22);

        int codice = pt.number();

        System.out.println(codice);
        System.out.println(pt.prezzoBase());
        System.out.println(pt.prezzoIva());
        System.out.println(codice + "-" + pt.codiceNome());
    }
}
