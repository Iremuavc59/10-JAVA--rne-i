package çalışma1;
import java.util.Scanner;
public class gün {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Gün için bir sayı giriniz (1-7):");
		int gün= input.nextInt();
		switch(gün) {
		case 1:System.out.println("Pazartesi");
		break;
		case 2:System.out.println("Salı");
		break;
		case 3:System.out.println("Çarşamba");
		break;
		case 4:System.out.println("Perşembe");
		break;
		case 5:System.out.println("Cuma");
		break;
		case 6:System.out.println("Cumartesi");
		break;
		case 7:System.out.println("Pazar");
		break;
		default:System.out.println("Lütfen geçerli bir sayı giriniz!");
		}

	}

}
