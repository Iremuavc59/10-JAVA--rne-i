package çalışma1;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
	Scanner input= new Scanner (System.in);
	System.out.print("İlk sayısı giriniz: ");
	double sayı1= input.nextDouble();
	System.out.print("İkinci sayısı giriniz: ");
	double sayı2=input.nextDouble();
	System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
	System.out.println("1.Toplama \n2.Çıkarma \n3.Çarpma \n4.Bölme");
	System.out.println("Seçiminiz: ");
	int seçim=input.nextInt();
	if (seçim==1) {
		System.out.println("Toplama: "+ (sayı1+sayı2));		
	}
	else if (seçim==2) {
		System.out.println("Çıkarma: "+ (sayı1-sayı2));
	}
	else if (seçim==3) {
		System.out.println("Çarpma: "+ (sayı1*sayı2));
	}
	else if (seçim==4) {
		if (sayı2==0) {
			System.out.println("İkinci sayı sıfıra eşittir bu yüzden sonuç belirsizidr.");
		}
		
		else {
		System.out.println("Bölme: "+ (sayı1/sayı2));
		}
		}
	else {
		System.out.println("Geçersiz bir işlem girdiniz.Tekrar deneyiniz.");
	}
	}

}
