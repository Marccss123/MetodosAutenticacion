package proveedor.tipos;

//Representa proveedores de software como servicio

import proveedor.Proveedor;

public class ProveedorSaaS extends Proveedor {
    public ProveedorSaaS(String nombre, String pais) {
        super(nombre, pais, "SaaS");
    }

    @Override
    public void tipoProveedor() {
        System.out.println("El tipo de proveedor es: "+getTipo());
    }
}
