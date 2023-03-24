package bytebanks_heredado;

public class TestFuncionario {
public static void main(String[] args) {
	Funcionario diego = new Funcionario();
	diego.setNombre("Diego");
	diego.setDocumento("35645144");
	diego.setSalario(15000);
	diego.setTipo(0);
System.out.println(diego.getSalario());
System.out.println(diego.getBonificacion());
}
}
