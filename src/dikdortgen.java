public class dikdortgen implements Geometrik {
    public double yukseklik;
    public double taban;


    public dikdortgen(double yukseklik, double taban) {
        this.taban=taban;
        this.yukseklik=yukseklik;
    }

    @Override
    public double alanHesapla() {
        return yukseklik*taban;
    }

}