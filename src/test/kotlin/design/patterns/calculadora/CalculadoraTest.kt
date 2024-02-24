package design.patterns.calculadora

import design.patterns.design.patterns.calculadora.Calculadora
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class CalculadoraTest {

    private val calculadoraPrueba = Calculadora();

    @Test
    fun `Dado 2 valores numericos debe sumar correctamete`(){
        val valorA = 5;
        val valorB = 2;

        val resultadoFinal = calculadoraPrueba.sumar(valorA,valorB);

        assertNotNull(resultadoFinal);
        assertEquals(7, resultadoFinal);
    }

    @Test
    fun `Dado 2 valores numericos el metodo restar debe realizar la operacion correctamente`(){
        val valorA = 5;
        val valorB = 2;
        val resultadoFinal = calculadoraPrueba.restar(valorA,valorB);

        assertEquals(3, resultadoFinal);
    }

    @Test
    fun `Dado 2 valores numericos el metodo multilplicar debe realizar la operacion correctamente`(){
        val valorA = 5;
        val valorB = 2;
        val resultadoFinal = calculadoraPrueba.multiplicar(valorA,valorB);

        assertEquals(3, resultadoFinal);
    }

    @Test
    fun `Dada una division de 2 valores en el que su divisor sea cero el metodo dividir debe retornar cero`(){
        val dividendo = 10F;
        val divisor = 0F
        val resultadoFinal = calculadoraPrueba.dividir(dividendo,divisor);

        assertEquals(0F, resultadoFinal);
    }
    @Test
    fun `Dada una division de 2 valores en el que sus operadores sean validos  el metodo dividir debe realizar la operacion`(){
        val dividendo = 10F;
        val divisor = 2F
        val resultadoFinal = calculadoraPrueba.dividir(dividendo,divisor);

        assertEquals(5F, resultadoFinal);
    }


}