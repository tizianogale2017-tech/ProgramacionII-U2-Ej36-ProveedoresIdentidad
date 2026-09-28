package Ejercicio36_proveedoresIdentidad;

public class AuthGitHub extends ProveedorIdentidad {
    public AuthGitHub() {
        super("GitHub");
    }

    @Override
    public boolean validarToken(String tokenAcceso) {
        return tokenPresente(tokenAcceso) && tokenAcceso.startsWith("ghp_");
    }
}
