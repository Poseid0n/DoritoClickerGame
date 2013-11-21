package doritoclicker;

public class Doritos {

    private int doritoIncrement = 1;
    private int doritos = 0;
    private int doritoPs = 0;

    public void addDoritos(int i) {
        doritos += i;
    }

    public int getDoritos() {
        return doritos;
    }

    public void addDoritoIncrement(int i) {
        doritoIncrement = i;
    }

    public int getDoritoIncrement() {
        return doritoIncrement;
    }

    public void removeDoritos(int i) {
        doritos -= i;
    }

    public void addDps(int i) {
        doritoPs += i;
    }

    public int getDps() {
        return doritoPs;
    }
}