package Tema_5_1_GetySet;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);

		Person p = new Person("Paco",22, 1.80f, "Cocinero");

		System.out.println("-----Datos actuales------");

		System.out.println("El nombre es: " + p.getName());
		System.out.println("La edad es: " + p.getAge());
		System.out.println("La altura es: " + p.getHeight());
		System.out.println("El trabajo es: " + p.getWork());

		System.out.println("-----Modificar datos-----");

		System.out.print("Introduce el nuevo nombre: ");
		p.setName(teclado.nextLine());

		System.out.print("Introduce la nueva edad: ");
		p.setAge(teclado.nextInt());

		System.out.print("Introduce la nueva altura: ");
		p.setHeight(teclado.nextFloat());
		teclado.nextLine();

		System.out.print("Introduce el nuevo trabajo: ");
		p.setWork(teclado.nextLine());
		
		System.out.println("El nuevo nombre asignado es: " + p.getName());
		System.out.println("La nueva edad asignada es: " + p.getAge());
		System.out.println("La nueva altura asignada es: " + p.getHeight());
		System.out.println("La nueva profesion asignada es: " + p.getWork());

		teclado.close();
		
	}
}
