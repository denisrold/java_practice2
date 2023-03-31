package bytebanks_heredado;

public interface Autenticable {

	public abstract void setClave  (String clave);

	public abstract boolean iniciarSesion(String clave);

	}

