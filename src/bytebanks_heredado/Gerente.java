package bytebanks_heredado;

public class Gerente extends Funcionario implements Autenticable{

	@Override
public double getBonificacion() {
	System.out.println("Ejecutado desde gerente.");
	return 2000;
}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
}
