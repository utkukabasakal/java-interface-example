public class yamuk implements Geometrik{
    public double taban;
    public double yukseklik;
    protected double tavan;

    public yamuk(double taban, double tavan, double yukseklik) {
        super();
        this.taban=taban;
        this.tavan=tavan;
        this.yukseklik=yukseklik;
    }
    @Override
    public double alanHesapla() {
        return this.yukseklik*(taban+tavan)/2;
    }
}
