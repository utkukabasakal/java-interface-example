public class Yamuk implements Geometrik{
    public double taban;
    public double yukseklik;
    protected double tavan;

    public Yamuk(double taban, double tavan, double yukseklik) {
        super();
        this.taban=taban;
        this.tavan=tavan;
        this.yukseklik=yukseklik;
    }
    @Override
    public double hesaplaAlan() {
        return this.yukseklik*(taban+tavan)/2;
    }
}
