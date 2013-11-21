package doritoclicker;

public class Upgrade {

    private DoritoClicker _d;
    private int price = 15;
    private int amount = 0;
    private int dps = 1;
    private String name = "";

    public Upgrade(DoritoClicker d, String s) {
        _d = d;
        name = s;
    }

    public void onClick() {
        if (_d.doritos.getDoritos() >= price) {
            _d.doritos.removeDoritos(price);
            amount++;
            price += 3;
            _d.doritos.addDps(this.dps);
            _d.refreshDoritoCount();
        }
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public int getDoritosPs() {
        return dps;
    }

    public String getName() {
        return name;
    }
}
