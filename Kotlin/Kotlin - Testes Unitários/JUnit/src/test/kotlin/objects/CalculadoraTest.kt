package objects

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CalculadoraTest {

    @Test
    fun soma() {
        assertEquals(2, Calculadora.soma(1,1))
    }

    @Test
    fun sub() {
        assertEquals(1, Calculadora.sub(2,1))
    }

    @Test
    fun multi() {
        assertEquals(2, Calculadora.multi(2,1))
    }

    @Test
    fun div() {
        assertEquals(2, Calculadora.div(4,2))
    }

    @Test
    fun pot() {
        assertEquals(4.0, Calculadora.pot(2.0,2.0))
    }

    @Test
    fun rad() {
        assertEquals(3.0, Calculadora.rad(9.0))
    }
}