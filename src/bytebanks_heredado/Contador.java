package bytebanks_heredado;

public class Contador extends Funcionario {
	public double getBonificacion() {
		System.out.println("Ejecutado desde contador");
		return 200;
	}
	
}
