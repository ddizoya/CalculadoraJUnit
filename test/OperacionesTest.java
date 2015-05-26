/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculadora.Operaciones;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class OperacionesTest {

    public OperacionesTest() {
    }
    Operaciones obj = new Operaciones();

    @Test
    public void SumaTest() {
        int a = 5;
        int b = 4;
        int esperado = 9;
        int resultado = obj.suma(a, b);

        assertEquals(esperado, resultado);
    }

    @Test
    public void RestaTest() {
        int a = 9;
        int b = 3;
        int esperado = 6;
        int resultado = obj.resta(a, b);

        assertEquals(esperado, resultado);
    }

    @Test
    public void MultTest() {
        int a = 6;
        int b = 3;
        int esperado = 18;
        int resultado = obj.multiplicacion(a, b);

        assertEquals(esperado, resultado);
    }

    @Test
    public void DivTest() {
        int a = 9;
        int b = 3;
        int esperado = 3;
        int resultado = obj.division(a, b);

        assertEquals(esperado, resultado);
    }

}
