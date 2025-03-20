import org.lessons.inheritanceShop.Cuffie;
import org.lessons.inheritanceShop.Prodotto;
import org.lessons.inheritanceShop.Smartphone;
import java.math.BigDecimal;
public class App {
    public static void main(String[] args) throws Exception {
        Smartphone iphone15 = new Smartphone("Iphone 15", "Penultimo smartphone rilasciato da apple", new BigDecimal(870), new BigDecimal(22), "0228462832329372342", 256);


        Cuffie cuffia = new Cuffie("a", "a", new BigDecimal(100), new BigDecimal(20), "Giallo", "wireless");

        System.out.println(cuffia.getWire());
    }
}
