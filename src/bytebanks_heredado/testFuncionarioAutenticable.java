package bytebanks_heredado;

public class testFuncionarioAutenticable {
public static void main(String[] args) {
	SistemaInterno sistema = new SistemaInterno();
	Gerente gerente1 = new Gerente();
	Administrador administrador1 = new Administrador();
	
	sistema.autentica(gerente1);
	sistema.autentica(administrador1);
}
}
