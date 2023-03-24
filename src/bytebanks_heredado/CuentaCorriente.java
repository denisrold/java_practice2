package bytebanks_heredado;

public class CuentaCorriente extends Cuenta {
	
	public CuentaCorriente(int agencia, int numero ) {
		super(agencia, numero);
	};
	
	//@Override --> me indica que esta siendo sobreescrito, esta sobreescribiendo el metodo de su clase padre
	public boolean saca(double valor) {
		double comision = 0.2;
		return super.saca(valor + comision);
	}
}