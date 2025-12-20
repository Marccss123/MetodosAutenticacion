package proveedor;

public class Contrato {
    private double precio;
    private int duracionEnMeses;

    public Contrato(double precio, int duracionEnMeses) {
        this.precio = precio;
        this.duracionEnMeses = duracionEnMeses;
    }

    public double getPrecio() {return precio;}
    public int getDuracionEnMeses() {return duracionEnMeses;}


    /*Se le pregunta al usuario si el contrato esta activo
    respuesta solo de si o no, si es "Si o si" retornara true*/

    public String estaActivo(String activo){
        if ("si".equalsIgnoreCase(activo)){
            return "Contrato activo";
        }
        return "Contrato inactivo";
    }

    @Override
    public String toString() {
        return "Precio: "+getPrecio()+" - Duracion: "+getDuracionEnMeses();
    }
}
