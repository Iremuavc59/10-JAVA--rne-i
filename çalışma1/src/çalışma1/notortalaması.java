package çalışma1;
import java.util.Scanner;
public class notortalaması {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Vize notunuzu giriniz:");
	int vize=input.nextInt();
	System.out.println("Final notunuzu giriniz:");
	int fınal=input.nextInt();
	double ortalama=(vize*0.4)+(fınal*0.6);
	 System.out.println("Not ortalamanız:"+ortalama);
	 String sonuç=(ortalama>=50)? "Geçtiniz.":"Kaldınız.";
	 System.out.println(sonuç);
	
	}

}
