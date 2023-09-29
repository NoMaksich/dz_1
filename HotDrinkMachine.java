import java.util.ArrayList;
import java.util.List;


public class HotDrinkMachine implements Authomat<Tea> {
    public List<Tea> list = new ArrayList<>();

    @Override
    public void initProducts(List<Tea> productList) {
        list.addAll(productList);
    }

    @Override
    public void printProduct(String name, int volume, int temperature ) {
        for (Tea product : list) {
            if (product.getName().equals(name) && product.getVolume() == volume && product.getTemp() == temperature) {
                System.out.println(product);
            }
        }
    }
}