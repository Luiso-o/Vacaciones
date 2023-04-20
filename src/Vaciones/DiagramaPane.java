package Vaciones;

import javax.swing.JOptionPane;

public class DiagramaPane {

	public static void main(String[] args) {
		
		String nombre=JOptionPane.showInputDialog("Bienvenido al sistema vacacional\r\n"
				+ "de Coca-Cola Company\n\t Cual es su nombre?");
		
		String textoClave=JOptionPane.showInputDialog("Cuantos años de servicio tiene el trabajador?");
		int clave=Integer.parseInt(textoClave);
		
		String textoAntiguedad=JOptionPane.showInputDialog("Cual es la clave del departamento?");
		int antiguedad=Integer.parseInt(textoAntiguedad);
		
		verificaVacaciones(clave,antiguedad,nombre);
		
	}
	
	static void verificaVacaciones(int clave,int antiguedad,String nombre) {
		
		if (clave==1) {
			
			if(antiguedad==1) {
				JOptionPane.showMessageDialog(null, nombre + ", derecho 6 días");
			}else if(antiguedad>=2 && antiguedad<=6) {
				JOptionPane.showMessageDialog(null, nombre + ", derecho 14 días");
			}else if(antiguedad==7) {
				JOptionPane.showMessageDialog(null, nombre + ", derecho 20 días");
			}else {
				JOptionPane.showMessageDialog(null,"Aun no tiene derecho a vacaciones");
			}
			
		}else if(clave==2) {
			
			if(antiguedad==1) {
				JOptionPane.showMessageDialog(null, nombre + ", derecho 7 días");
			}else if(antiguedad>=2 && antiguedad<=6) {
				JOptionPane.showMessageDialog(null, nombre + ", derecho 15 días");
			}else if(antiguedad==7) {
				JOptionPane.showMessageDialog(null, nombre + ", derecho 22 días");
			}else {
				JOptionPane.showMessageDialog(null,"Aun no tiene derecho a vacaciones");
			}
			
		}else if(clave==3) {
			
			if(antiguedad==1) {
				JOptionPane.showMessageDialog(null, nombre + ", derecho 10 días");
			}else if(antiguedad>=2 && antiguedad<=6) {
				JOptionPane.showMessageDialog(null, nombre + ", derecho 20 días");
			}else if(antiguedad==7) {
				JOptionPane.showMessageDialog(null, nombre + ", derecho 30 días");
			}else {
				JOptionPane.showMessageDialog(null,"Aun no tiene derecho a vacaciones");
			}
			
		}else {
			JOptionPane.showMessageDialog(null,"Error, la clave de departamento no existe");
		}
		
	}

}
