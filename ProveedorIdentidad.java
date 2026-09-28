package Ejercicio36_proveedoresIdentidad;

public abstract class ProveedorIdentidad {
    protected String nombreProveedor;

    public ProveedorIdentidad(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public abstract boolean validarToken(String tokenAcceso);

    protected boolean tokenPresente(String tokenAcceso) {
        return tokenAcceso != null && !tokenAcceso.trim().isEmpty();
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }
}
