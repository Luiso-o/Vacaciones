package Vaciones;

import java.util.Scanner;

public class DiagramaScanner {

	public static void main(String[] args) {
		
		String nombre;
		int clave;
		int antiguedad;
		
		System.out.println("Bienvenido al sistema vacacional\r\n"
				+ "de Coca-Cola Company");
		
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		
		System.out.println("Cual es su nombre?");
		nombre=input.nextLine();
	
		System.out.println("Cuantos años de servicio tiene el trabajador?");
		antiguedad=input.nextInt();
		
		System.out.println("Cual es la clave del departamento?");
		clave=input.nextInt();
		
		verificaVacaciones(clave,antiguedad,nombre);
		
	}
	
	static void verificaVacaciones(int clave,int antiguedad,String nombre) {
		
		if (clave==1) {
			
			if(antiguedad==1) {
				System.out.println(nombre+ ", derecho 6 días");
			}else if(antiguedad>=2 && antiguedad<=6) {
				System.out.println(nombre+ ", derecho 14 días");
			}else if(antiguedad==7) {
				System.out.println(nombre+ ", derecho 20 días");
			}else {
				System.out.println("Aun no tiene derecho a vacaciones");
			}
			
		}else if(clave==2) {
			
			if(antiguedad==1) {
				System.out.println(nombre+ ", derecho 7 días");
			}else if(antiguedad>=2 && antiguedad<=6) {
				System.out.println(nombre+ ", derecho 15 días");
			}else if(antiguedad==7) {
				System.out.println(nombre+ ", derecho 22 días");
			}else {
				System.out.println("Aun no tiene derecho a vacaciones");
			}
			
		}else if(clave==3) {
			
			if(antiguedad==1) {
				System.out.println(nombre+ ", derecho 10 días");
			}else if(antiguedad>=2 && antiguedad<=6) {
				System.out.println(nombre+ ", derecho 20 días");
			}else if(antiguedad==7) {
				System.out.println(nombre+ ", derecho 30 días");
			}else {
				System.out.println("Aun no tiene derecho a vacaciones");
			}
			
		}else {
			System.out.println("Error, la clave de departamento no existe");
		}
		
	}

}
