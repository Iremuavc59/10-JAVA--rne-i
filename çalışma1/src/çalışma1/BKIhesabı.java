package çalışma1;
import java.util.Scanner;
public class BKIhesabı {

	public static void main(String[] args) {
    Scanner input= new Scanner (System.in);
    System.out.print("Boyunuzu giriniz(m): ");
    double boy= input.nextDouble();
    System.out.print("Kilonuzu giriniz(kg): ");
    double kilo= input.nextDouble();
    double BKİ=kilo/(boy*boy);
    System.out.println("BKİ: "+BKİ);
    if(BKİ<18.5) {
    	 System.out.println("İdeal kilonun altındasınız.");
    }
    else if (BKİ>=18.5 && BKİ<=24.9) {
    	System.out.println("İdeal kilodasınız.");
    }
    else if (BKİ>=25 && BKİ<=29.9) {
    	System.out.println("İdeal kilonun üstündesiniz.");
    }
    else if (BKİ>=30 && BKİ>=39.9){
    	System.out.println("İdeal kilonun çok üstündesiniz.(obez)");
    }
    else {
    	System.out.println("İdeal kilonun çok üstündesiniz.(morbid obez)");
    }
	}

}
