package doritoclicker;

public class AutoCrumncher {

    private DoritoClicker _d;
    private int price = 15;
    private int amount = 0;
    private int dps = 1;

    public AutoCrumncher(DoritoClicker d) {
        _d = d;
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
}
