package test;

import genericos.ClaseGenerica;

public class TestGenerics {

    public static void main(String[] args) {
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        objetoInt.obtenerTipo();
        
        // Podemos usar tipos compatibles 
        // es decir clases hijas y clases que implementen interfaces
        ClaseGenerica<String> objetoString = new ClaseGenerica("String1");
        objetoString.obtenerTipo();
    }

}
