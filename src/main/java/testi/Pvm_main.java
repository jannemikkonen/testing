package testi;

import java.util.Scanner;

public class Pvm_main {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Pvm olio=new Pvm();
		Pvm olio2=new Pvm(31,1,2017);
		System.out.println("anna päiväys");
		String päiväys=input.next();
		Pvm olio3=new Pvm(päiväys);
		/*System.out.println("anna päivä");
		olio.setPäivä(input.nextInt());
		System.out.println("anna kuukausi");
		olio.setKuukausi(input.nextInt());
		System.out.println("anna vuosi");
		olio.setVuosi(input.nextInt());*/
		System.out.println(olio.toString());
		System.out.println(olio2.toString());
		System.out.println(olio.equals(olio2));
		System.out.println(olio3.toString());
		}
	}
