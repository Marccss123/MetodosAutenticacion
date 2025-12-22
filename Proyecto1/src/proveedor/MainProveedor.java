package proveedor;

import autenticacion.Utilitario;
import jdk.jshell.execution.Util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainProveedor {
    public static void main(String[] args) {
        //Contrato-Atributos
        double precio;
        int duracionEnMeses;
        boolean activo;

        //Proveedor-Atributos
        String nombreProveedor;
        String pais;

        //Cliente-Atributos
        String nombreCliente;

        //Menu
        int opc;
        Scanner sc=new Scanner(System.in);
        Utilitario u=new Utilitario();

        do {
            try{
                u.menu();
                opc=Integer.parseInt(sc.nextLine());

                switch (opc){
                    case 1:{

                    }break;
                }

            }catch (InputMismatchException e){
                System.out.println("Error: Debe ingresar un numero.");
                u.menu();
                sc.nextLine();
                opc = 0;
            }
        }while(opc!=7);


    }

}
