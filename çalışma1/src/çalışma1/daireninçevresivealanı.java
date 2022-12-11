package çalışma1;

import java.util.Scanner;

public class daireninçevresivealanı {

	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	System.out.println("Dairenin yarıçapını giriniz:");
	double yarıçap= input.nextInt();
	final double pi=3.14;
	double çevre=2*pi*yarıçap;
	System.out.println("Dairenin çevresi: "+çevre);
	double alan=pi*yarıçap*yarıçap;
	System.out.println("Dairenin alanı: "+alan);
	}

}
