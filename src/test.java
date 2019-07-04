public class test {
    public static void main(String[] args) {
        dikdortgen dd =new dikdortgen (3, 5);
        System.out.println("Dikdortgen alani: "+ dd.alanHesapla());
        //
        kare kr = new kare(4);
        System.out.println("karenin alani: "+ kr.alanHesapla());
        //
        ucgen uc = new ucgen(8,6);
        System.out.println("ucgenin alani: "+ uc.alanHesapla());
        //
        yamuk yk= new yamuk(10,5,8);
        System.out.println("yamuk alani: "+ yk.alanHesapla());

    }
}
