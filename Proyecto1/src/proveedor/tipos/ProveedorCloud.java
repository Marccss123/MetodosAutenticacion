package proveedor.tipos;

import proveedor.Proveedor;

//Tipo de proveedor: Representa proveedores de infraestructura en la nube
public class ProveedorCloud extends Proveedor {

    public ProveedorCloud(String nombre, String pais) {
        super(nombre, pais, "Cloud");
    }

    @Override
    public void tipoProveedor() {
        System.out.println("El tipo de proveedor es: "+getTipo());
    }
}
