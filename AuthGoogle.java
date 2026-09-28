package Ejercicio36_proveedoresIdentidad;

public class AuthGoogle extends ProveedorIdentidad {
    public AuthGoogle() {
        super("Google");
    }

    @Override
    public boolean validarToken(String tokenAcceso) {
        return tokenPresente(tokenAcceso) && tokenAcceso.startsWith("ya29.");
    }
}
