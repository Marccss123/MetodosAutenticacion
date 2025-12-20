package proveedor.tipos;

//Representa proveedores de servicios de pago digital

import proveedor.Proveedor;

public class ProveedorPasarelasPago extends Proveedor {
    public ProveedorPasarelasPago(String nombre, String pais) {
        super(nombre, pais, "Pasarelas Pago");
    }

    @Override
    public void tipoProveedor(){
        System.out.println("El tipo de proveedor es: "+getTipo());
    }
}
