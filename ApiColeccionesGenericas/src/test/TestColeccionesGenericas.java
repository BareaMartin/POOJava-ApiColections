package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestColeccionesGenericas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
//        String elemento = miLista.get(0);
//        System.out.println("elemento = " + elemento);
//        imprimir(miLista);
        
//        for(Object elemento: miLista){
//            System.out.println("elemento = " + elemento);
//        }
//        
//        miLista.forEach( elemento -> {
//            System.out.println("elemento = " + elemento);
//        });
//        
       
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");
        imprimir(miSet);
        
        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Rosario");
        String elementoMapa = miMapa.get("valor1");
        System.out.println("elemento = " + elementoMapa);
        
        imprimir(miMapa.keySet());
    }
    
    public static void imprimir(Collection<String> coleccion){
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
}
