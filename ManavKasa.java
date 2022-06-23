import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armut, elma , domates , muz , patlican , toplam, a,e,d,m,p;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        armut = input.nextDouble();
        a = armut * 2.14;
        System.out.println("Armutun Fiyatı : " +a);

        System.out.print("Elma Kaç Kilo ? : ");
        elma = input.nextDouble();
        e = elma * 3.67;
        System.out.println("Elmanın Fiyatı : " +e);

        System.out.print("Domates Kaç Kilo ? : ");
        domates = input.nextDouble();
        d = domates * 1.11;
        System.out.println("Domatesin Fiyatı : "+d);

        System.out.print("Muz Kaç Kilo ? : ");
        muz = input.nextDouble();
        m = muz * 0.95;
        System.out.println("Muzun Fiyatı : " +m);

        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlican = input.nextDouble();
        p = patlican * 5;
        System.out.println("Patlıcanın Fiyatı : " +p);

        toplam = a+e+d+m+p;
        System.out.print("Toplam Tutar : " + toplam);


    }
}
