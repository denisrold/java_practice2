package bytebanks_heredado;

public class TestReferencias {
public static void main(String[] args) {
	Funcionario funcionario = new Gerente();
	funcionario.setNombre("Diego");
//todos los gerentes son funcionario 
//pero no todos los funcionarios son gerentes. 
	Gerente gerente = new Gerente();
	gerente.setNombre("Jimena");
	
	funcionario.setSalario(2000);
	gerente.setSalario(10000);
}
}
