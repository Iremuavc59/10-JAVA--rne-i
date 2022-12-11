package çalışma1;

import java.util.Scanner;

public class OrtalamaHız {

	public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.print("Ortalama hız hesabı"+ "\nToplam alınan yol miktarını giriniz(km): ");
    double yol=input.nextDouble();
    System.out.print("Toplam süreyi giriniz(sa): ");
    double süre=input.nextDouble();
    System.out.println("Ortalama Hız: "+ (yol/süre)+"km/sa");

	}

}
