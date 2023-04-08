package bytebanks_heredado;

public class CuentaCorriente extends Cuenta {
	
	public CuentaCorriente(int agencia, int numero ) {
		super(agencia, numero);
	};
	
	//@Override --> me indica que esta siendo sobreescrito, esta sobreescribiendo el metodo de su clase padre
	public void saca(double valor) throws SaldoInsuficienteException{
		double comision = 0.2;
		super.saca(valor + comision);
	}

	@Override
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
}
