public class Ucgen implements Geometrik {
    private double taban;
    private double yukseklik;
    public Ucgen(double taban, double yukseklik) {
        super();
        this.taban=taban;
        this.yukseklik=yukseklik;
    }
    @Override
    public double hesaplaAlan() {
        return (this.yukseklik*this.taban)/2;
    }
    //
    public double getTaban() {
        return taban;
    }
    public void setTaban(double taban) {
        this.taban = taban;
    }
    public double getYukseklik() {
        return yukseklik;
    }
    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik;
    }

}