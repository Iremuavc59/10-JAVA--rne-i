package çalışma1;
import java.util.Scanner;
public class SayıSıralama {

	public static void main(String[] args) {
	Scanner input= new Scanner (System.in);
	System.out.println("3 tane sayı değeri giriniz:");
	System.out.print("a:");
	double a=input.nextDouble();
	System.out.print("b:");
	double b=input.nextDouble();
	System.out.print("c:");
	double c=input.nextDouble();
	if(a>b && a>c) {
		if(b>c) {
			System.out.println("a>b>c");
		}
		else if(b==c) {
			System.out.println("a>b=c");
		}
		else {
			System.out.println("a>c>b");
		}
	}
	else if (b>a && b>c) {
		if (a>c) {
			System.out.println("b>a>c");
		}
		else if (a==c) {
			System.out.println("b>a=c");
		}
		else {
			System.out.println("b>c>a");
		}
	}
	else if(a==b) {
		if(b>c) {
			System.out.println("a=b>c");
		}
		else if(c>a) {
			System.out.println("c>a=b");
		}
		else {
			System.out.println("a=b=c");
		}
		}
	else if(b==c) {
		if(a>b) {
			System.out.println("a>b=c");
		}
		else if (b>a) {
			System.out.println("b=c>a");
		}
		else {
			System.out.println("a=b=c");
		}
	}
	else {
		if(a>b) {
		System.out.println("c>a>b");
	}
	else if (a==b) {
		System.out.println("c>a=b");
	}
	else {
		System.out.println("c>b>a");
	
	}
	}
	}
	}


