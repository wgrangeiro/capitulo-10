package Program;

import java.util.Locale;
import java.util.Scanner;

import entities.Rooms;

public class Aplicativo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rooms[] vect = new Rooms[10];
	
		System.out.print("How many rooms will be rented?");
		int n = sc.nextInt();
	
		System.out.println("Rent #1:");
		
			for (int i=0; i<n; i++) {
			
			System.out.print("Name:");
			sc.nextLine();
			String name= sc.nextLine();
			System.out.print("E-mail:");
			String mail= sc.nextLine();
			System.out.print("Room:");
			int q = sc.nextInt();
			vect[q] =  new Rooms(name,mail);	
		}
		
			
			
			System.out.println();
			System.out.println("Busy rooms:");
			for (int i=0; i<10; i++) {
			if (vect[i] != null) {
			System.out.println(i + ": " + vect[i]);
			}
			
			}
		
		

		
	sc.close();
	

	}
}
