import javax.swing.JOptionPane;

public class Principal {


	public static void main(String[] args) {
		funtion monedas = new funtion();
		
		boolean flag = true;
		while (flag) {
			String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opcion de convertir", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object [] {"Conversor de moneda", "Conversor de temperatura"},"Seleccion")).toString();
			
			switch (opciones) {
			case "Conversor de moneda": {
				String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero a convertir: ");
				if(ValidarNumero(input)) {
					double Minput = Double.parseDouble(input);
					monedas.ConvertirMonedas(Minput);
					
					int respuesta = JOptionPane.showConfirmDialog(null, "Deseas realizar otra convercion?");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Selecciona opcion afirmativa");
					} else {
						flag = false;
						JOptionPane.showMessageDialog(null, "Programa terminado");
					}
				} else {
					JOptionPane.showMessageDialog(null, "valor invalido");
				}
				break;
			}
			
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + opciones);
			}
		}

	}

	
	public static boolean ValidarNumero(String input) {
		try {
			double x = Double.parseDouble(input);
			if (x>= 0 || x<0);
			return true;
		} catch (NumberFormatException e) {
			return false;
			
		}
		
	}
}

