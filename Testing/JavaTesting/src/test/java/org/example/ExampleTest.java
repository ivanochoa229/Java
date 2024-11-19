package org.example;
import static  org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class ExampleTest {
    //Ejercicio 1
    @Test
    public void testSumar(){
        Example example = new Example();
        int result = example.sumar(5,4); // Valor deseado
        assertEquals(9,result);
    }
    @Test
    //Ejercicio 2
    public void testCheckPositivo(){
        //Given
        Example example = new Example();
        int num = 4;
        //When
        boolean result = example.checkPositivo(num);
        //Then
        assertTrue(result);
    }
    @Test
    public void testCheckPositivoError(){
        //Given
        Example example = new Example();
        int num = -4;
        //Then
        assertThrows(IllegalArgumentException.class, () -> example.checkPositivo(num));
    }

    //Ejercicio 3
    @Test
    public void TestContarLetrasA(){
        Example example = new Example();
        String cadena = "Hola mundo";
        int result = example.contarLetrasA(cadena);
        assertEquals(1, result);
    }

    //Ejercicio 4
    @Test
    public void TestContieneElemento(){
        Example example = new Example();
        List<String> lista = List.of("Hola", "Mundo", "HELLO", "WORLD");
        String Elemento = "Hola";
        boolean result = example.contieneElemento(lista, Elemento);
        assertTrue(result);
    }

    //Ejercicio 5
    @Test
    public void TestRevertirCadena(){
        Example example = new Example();
        String string = "HOLA MUNDO";
        String result = example.revertirCadena(string);
        assertEquals("ODNUM ALOH", result);
    }

    //Ejercicio 6
    @Test
    public void TetsFactorial(){
        Example example = new Example();
        int num = 6;
        long result = example.factorial(num);
        assertEquals(720, result);
    }

    @Test
    public void TetsFactorialNegativo(){
        Example example = new Example();
        int num = -6;
        assertThrows(IllegalArgumentException.class, () -> example.factorial(num));
    }

    //Ejercicio 7
    @Test
    public void TestEsPrimo(){
        Example example = new Example();
        int num = 5;
        assertTrue(example.esPrimo(num));
    }

    @Test
    public void TestEsPrimoMenorIgualAUno(){
        Example example = new Example();
        int num = -1;
        assertFalse(example.esPrimo(num));
    }

    @Test
    public void TestNoEsPrimo(){
        Example example = new Example();
        int num = 4;
        assertFalse(example.esPrimo(num));
    }

    //Ejercicio 8
    @Test public void TestMensajeConRetraso() throws InterruptedException{
        Example example = new Example();
        String result = example.mensajeConRetraso();
        assertEquals("Listo después de retraso", result);
    }

    //Ejercicio 9
    @Test
    public void TestConvertirAString(){
        Example example = new Example();
        List<String> listaEsperada = List.of("1", "2", "3", "4");
        List<Integer> listaInteger = List.of(1, 2, 3 ,4);
        List<String> result = example.convertirAString(listaInteger);
        assertEquals(listaEsperada, result);
     }

     //Ejercicio 10
    @Test
    public void TestCalcularMedia(){
        Example example = new Example();
        List<Integer> listaInteger = List.of(2, 2, 2 ,2);
        Double valorEsperado = 2.0;
        Double result = example.calcularMedia(listaInteger);
        assertEquals(valorEsperado, result);
    }

    @Test
    public void TestCalcularMediaNull(){
        Example example = new Example();
        List<Integer> listaInteger = null;
        assertThrows(IllegalArgumentException.class, () -> example.calcularMedia(listaInteger));
    }

    @Test
    public void TestCalcularMediaEmpty(){
        Example example = new Example();
        List<Integer> listaInteger = Collections.emptyList();
        assertThrows(IllegalArgumentException.class, () -> example.calcularMedia(listaInteger));
    }
    @Test
    //Ejercicio 11
    public void TestConvertirListaAString(){
        Example example = new Example();
        List<String> lista = List.of("H", "O", "L", "A");
        String stringEsperado = "H,O,L,A";
        String result = example.convertirListaAString(lista);
        assertEquals(stringEsperado, result);
    }

}
