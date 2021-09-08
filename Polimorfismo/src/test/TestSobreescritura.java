package test;

import domain.*;

public class TestSobreescritura {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
       // System.out.println("empleado = " + empleado.obtenerDetalles());
        imprimir(empleado);
        Gerente gerente = new Gerente("Karla", 10000, "Contabilidad");
        //System.out.println("gerente = " + gerente.obtenerDetalles());
        imprimir(gerente);
        Empleado gerente2 = new Gerente("Karla", 5004, "Contabilidad");
        imprimir(gerente2);
        
    }
    
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
