package çalışma1;

import java.util.Scanner;

public class girilensayıyakadartoplama {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int toplam=0;
	System.out.print("Bir sayı giriniz: ");
	int sayı=input.nextInt();
	for(int i=1;i<sayı;i++) {
		toplam=toplam+i;
	}
	System.out.println(sayı+" sayısına kadar olan sayıların toplamı= "+toplam);
	}

}
