package çalışma1;
import java.util.Scanner;
public class Faktöriyel {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int faktöriyel=1;
		System.out.print("Lütfen bir sayı giriniz:");
		int sayı=input.nextInt();
		for (int i=1; i<=sayı;i++) {
			faktöriyel=faktöriyel*i;
		}
		System.out.println(sayı+"!="+ faktöriyel);

	}

}
