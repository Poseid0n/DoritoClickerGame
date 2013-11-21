package doritoclicker;

public class Upgrade {

    private DoritoClicker _d;
    private int _price = 0;
    private int _amount = 0;
    private int _dps = 0;
    private String _name = "";
    private int _addPerBuy = 0;

    public Upgrade(DoritoClicker d, String s, int dps, int price, int addPerBuy) {
        _d = d;
        _name = s;
        _dps = dps;
        _price = price;
        _addPerBuy = addPerBuy;
    }

    public void onClick() {
        if (_d.doritos.getDoritos() >= _price) {
            _d.doritos.removeDoritos(_price);
            _amount++;
            _price += _addPerBuy;
            _d.doritos.addDps(_dps);
            _d.refreshDoritoCount();
        }
    }

    public int getPrice() {
        return _price;
    }

    public int getAmount() {
        return _amount;
    }

    public int getDoritosPs() {
        return _dps;
    }

    public int getAddPerBuy() {
        return _addPerBuy;
    }

    public String getName() {
        return _name;
    }
}
