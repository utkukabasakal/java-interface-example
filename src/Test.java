public class Test {
    public static void main(String[] args) {
        Dikdortgen dikdortgen =new Dikdortgen(3, 5);
        System.out.println("Dikdortgen alani: "+ dikdortgen.hesaplaAlan());
        //
        Kare kare = new Kare(4);
        System.out.println("karenin alani: "+ kare.hesaplaAlan());
        //
        Ucgen ucgen = new Ucgen(8,6);
        System.out.println("ucgenin alani: "+ ucgen.hesaplaAlan());
        //
        Yamuk yamuk= new Yamuk(10,5,8);
        System.out.println("yamuk alani: "+ yamuk.hesaplaAlan());

    }
}
