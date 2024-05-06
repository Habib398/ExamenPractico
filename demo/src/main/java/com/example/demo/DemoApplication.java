package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("===Menu tablas de multiplicar===");
		System.out.println("1.- Mostrar tabla");
		System.out.println("2.- Mostrar tablas del 2 al 5");
		System.out.println("3.- Salir");
		System.out.println("Ingrese una opcion: ");
		Scanner in = new Scanner(System.in);
		int opcion = in.nextInt();

		switch (opcion){
			case 1:
				MostrarTabla();
				break;
			case 2:
				MostarTabla2al5();
				break;
			default:
				System.out.println("Bye bye");
				break;
		}
	}
	

}
