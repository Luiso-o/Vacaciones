package Vaciones;

import java.awt.Color;

import javax.swing.*;

public class DiagramaFrame extends JFrame {
	
	public static void main(String[] args) {
		
	    // Crear una instancia de la clase 
	    DiagramaFrame Vacaciones = new DiagramaFrame();
	    
	}
  
    public DiagramaFrame() {
    	
        // Crear un panel para mostrar los elementos en la ventana
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        panel.setBackground(Color.GREEN);
        
        // Crear un campo de texto para introducir el nombre del trabajador
        JTextField textoNombre= new JTextField(10);
        panel.add(new JLabel("Nombre"));
        panel.add(textoNombre);
        
        // Crear un cuadro de lista para seleccionar los años de servivio
        String[] tiempoDeServicio = {"0","1", "2", "3", "4", "5", "6", "7"};
        JComboBox<String> tiempo = new JComboBox<>(tiempoDeServicio );
        panel.add(new JLabel("Años de servicio en la empresa"));
        panel.add(tiempo);
              
        // Crear un cuadro de lista para seleccionar la clave del departamento
        String[] departamentos = {"1", "2", "3"};
        JComboBox<String> departamentoBox = new JComboBox<>(departamentos);
        panel.add(new JLabel("Clave del departamento:"));
        panel.add(departamentoBox);
        
        // Crear un botón para calcular las vacaciones del trabajador
        JButton calcularButton = new JButton("Calcular vacaciones");
        panel.add(calcularButton);
        
        // Crear un campo de texto para mostrar el resultado de las vacaciones del trabajador
        JTextField resultadoField = new JTextField(10);
        resultadoField.setEditable(false);
        panel.add(new JLabel("Vacaciones:"));
        panel.add(resultadoField);
        
        // Agregar el panel a la ventana
        add(panel);
        
        // Establecer las propiedades de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Vacaciones de trabajadores");
        setSize(600, 120);
        setLocationRelativeTo(null);
        setVisible(true);
        
        // Agregar un listener al botón de calcular
        calcularButton.addActionListener(e -> {
            // Obtener los valores introducidos por el usuario
            String nombre = textoNombre.getText();
            String antiguedad = (String)tiempo.getSelectedItem();
            String departamento = (String) departamentoBox.getSelectedItem();
            
            // Calcular las vacaciones en base a los parámetros introducidos
            int vacaciones = calcularVacaciones(antiguedad, departamento);
            
            // Mostrar el resultado en el campo de texto correspondiente
            resultadoField.setText(Integer.toString(vacaciones) + " días");
        });
    }
    
    public int calcularVacaciones(String anios, String clave) {
    	
    	int antiguedad=Integer.parseInt(anios);
    	int vacaciones=0;
    	
    	switch(clave) {
    	
    	case "1":
    		
    		if(antiguedad==1) {
    			vacaciones = 6;
    		}else if(antiguedad>=2 && antiguedad<=6) {
    			vacaciones = 14;
    		}else if(antiguedad==7) {
    			vacaciones = 20;
    		}else if(antiguedad==0) {
    			JOptionPane.showMessageDialog(this, "Aun no tiene derecho a vacaciones.");
    		}
    		
    		break;
    		
    	case "2":
    		
    		if(antiguedad==1) {
    			vacaciones = 7;
    		}else if(antiguedad>=2 && antiguedad<=6) {
    			vacaciones = 15;
    		}else if(antiguedad==7) {
    			vacaciones = 22;
    		}else if(antiguedad==0) {
    			JOptionPane.showMessageDialog(this, "Aun no tiene derecho a vacaciones.");
    		}
    		
    		break;
    		
    	case "3":
    		
    		if(antiguedad==1) {
    			vacaciones = 10;
    		}else if(antiguedad>=2 && antiguedad<=6) {
    			vacaciones = 20;
    		}else if(antiguedad==7) {
    			vacaciones = 30;
    		}else if(antiguedad==0) {
    			JOptionPane.showMessageDialog(this, "Aun no tiene derecho a vacaciones.");
    		}
    		
    		break;
    		
    	}
    	
    	return vacaciones;
    	    	
    }
    	
}   
    