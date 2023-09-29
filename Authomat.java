
//import java.util.ArrayList;
import java.util.List;

public interface  Authomat<T> {
//    public List<HotDrinks> list = new ArrayList<>();

//    public void initProducts (List <HotDrinks> newList) {
//        this.list = newList;
//        System.out.println(newList);
//    }

//    public void printProduct(String name) {
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getName().equals(name)){
//                System.out.println(list.get(i));
//            }
//        }}
    void initProducts (List <T> newList);

    void printProduct(String name, int volume, int temperature );
}