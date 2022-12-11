package çalışma1;
import java.util.Scanner;
public class KDVHesaplama {

	public static void main(String[] args) {
	double kdv=0.18;
	Scanner input= new Scanner (System.in);
	System.out.println("Ürünün tutarını giriniz:");
	double tutar= input.nextDouble();
	double kdvliFiyat= tutar+(tutar*kdv);
	System.out.println("KDV'li Fiyat: "+kdvliFiyat);
	}

}
 