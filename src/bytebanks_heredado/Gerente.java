package bytebanks_heredado;

public class Gerente extends Funcionario {
	private String clave;
	public void setClave(String clave) {
		this.clave = clave;
	};
	public boolean iniciarSesion(String clave) {
		return clave == "AluraCursosOnline";
	}
//sobre-escritura de metodo; misma firma del metodo, pero sobre la clase hija
public double getBonificacion() {
	System.out.println("Ejecutado desde gerente.");
	return super.getSalario() + (super.getBonificacion()); // gana un 10% mas 
}
}
