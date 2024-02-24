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

        val resultadoFinal = calculadoraPrueba.sumar(5,2);

        assertNotNull(resultadoFinal);
        assertEquals(7, resultadoFinal);
    }

}