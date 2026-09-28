package Ejercicio36_proveedoresIdentidad;

public class AuthApple extends ProveedorIdentidad {
    public AuthApple() {
        super("Apple");
    }

    @Override
    public boolean validarToken(String tokenAcceso) {
        return tokenPresente(tokenAcceso) && tokenAcceso.length() >= 20;
    }
}
