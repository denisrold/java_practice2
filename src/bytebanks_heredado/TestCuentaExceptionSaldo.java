package bytebanks_heredado;

public class TestCuentaExceptionSaldo {
public static void main(String[] args) {
	Cuenta cuenta = new CuentaAhorro(123,456);
	cuenta.deposita(100);
	try {
		cuenta.saca(200);
	} catch (SaldoInsuficienteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
