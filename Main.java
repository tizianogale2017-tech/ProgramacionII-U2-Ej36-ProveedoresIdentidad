package Ejercicio36_proveedoresIdentidad;

public class Main {
    public static void main(String[] args) {
        ProveedorIdentidad[] proveedores = {new AuthGoogle(), new AuthGitHub(), new AuthApple(), new AuthGoogle()};
        String[] tokens = {"ya29.a0AfH6SMB", "ghp_16C7e42F292c69", "eyJraWQiOiJXNldjT0tCIiwiYWxn", null};

        for (int i = 0; i < proveedores.length; i++) {
            boolean ok = proveedores[i].validarToken(tokens[i]);
            System.out.println(proveedores[i].getNombreProveedor() + " -> " + (ok ? "acceso concedido" : "acceso denegado (token inválido o vacío)"));
        }
    }
}
