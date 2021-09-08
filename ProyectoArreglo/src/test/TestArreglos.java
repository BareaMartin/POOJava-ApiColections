package test;

public class TestArreglos {

    public static void main(String[] args) {
        nuevoArreglo(25);
        nuevoArreglo(5);
    }
    
    public static void nuevoArreglo(int numero1){
        int numeros[] = new int[numero1];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Arreglo de: " + numero1 + " numeros, Iterando: " + (i+1) );
        }
     
    }
}
