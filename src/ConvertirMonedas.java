import javax.swing.JOptionPane;

public class ConvertirMonedas {

	public void ConvertirADolar(double valor) {
		double moneda = valor / 18.2;
		moneda = (double) Math.round(moneda * 100d)/100;
		JOptionPane.showMessageDialog(null, "Son $ "+moneda+ " Dolares");
	}
	
	public void ConvertirAEuro(double valor) {
		double moneda = valor / 20.11;
		moneda = (double) Math.round(moneda * 100d)/100;
		JOptionPane.showMessageDialog(null, "Son $ "+moneda+ " Euros");
	}
	
	public void ConvertirAYen(double valor) {
		double moneda = valor / 0.14;
		moneda = (double) Math.round(moneda * 100d)/100;
		JOptionPane.showMessageDialog(null, "Son $ "+moneda+ " Yenes");
	}
}
