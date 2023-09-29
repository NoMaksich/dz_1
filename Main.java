import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tea tea = new Tea("зелёный", 60, 70);
        Tea tea1 = new Tea("чёрный", 100, 80);
        List<Tea> drinkList = new ArrayList<>();
        drinkList.add(tea);
        drinkList.add(tea1);
        //Authomat authomat = new Authomat();
        //authomat.initProducts(prodList);
        //authomat.printProduct("зелёный");
        HotDrinkMachine drinkMachine = new HotDrinkMachine(); // Создаем объект DrinkMachine
        drinkMachine.initProducts(drinkList);
        drinkMachine.printProduct("зелёный", 60, 70);
        //drinkMachine.printProduct("чёрный");
    }
}