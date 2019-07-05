public class Dikdortgen implements Geometrik {
    public double yukseklik;
    public double taban;


    public Dikdortgen(double yukseklik, double taban) {
        this.taban=taban;
        this.yukseklik=yukseklik;
    }

    @Override
    public double hesaplaAlan() {
        return yukseklik*taban;
    }

}