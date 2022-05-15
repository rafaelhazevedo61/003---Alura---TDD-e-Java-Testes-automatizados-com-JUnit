package br.com.alura.tdd.outro;


import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void deveriaSomarDoisNumerosPositivos(){
        Calculadora calc = new Calculadora();
        int soma = calc.somar(3, 7);

        Assert.assertEquals(12, soma);
    }
}
