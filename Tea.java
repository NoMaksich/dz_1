
public class Tea extends HotDrinks{

    private int temp;

    public int getTemp() {
        return temp;
    }

    public Tea(String name, int volume, int temp) {
        this.name = name;
        this.volume = volume;
        this.temp = temp;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Tea {" + name +
                " Temperatura = " + temp +
                " volume = " + volume +
                '}';
    }
}