import javax.swing.JOptionPane;

public class funtion {
	ConvertirMonedas monedas = new ConvertirMonedas();
	
	
	public void ConvertirMonedas (double Minput) {
		String opcion = (JOptionPane.showInputDialog(null, "Elije la moneda", "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[] {
				"Peso a Dolar", "Peso a Euro", "Peso a Yen",
		}, "Seleccion")).toString();
		
		switch (opcion) {
		case "Peso a Dolar": 
			monedas.ConvertirADolar(Minput);
			break;
		case "Peso a Euro": 
			monedas.ConvertirAEuro(Minput);
			break;
		case "Peso a Yen": 
			monedas.ConvertirAYen(Minput);
			break;
			
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcion);
		}
		
		
	}
}
