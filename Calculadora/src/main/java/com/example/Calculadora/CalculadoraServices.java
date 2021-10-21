package com.example.Calculadora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraServices {

    public static int suma(Calculadora calculadora) {
        calculadora.setResultado(0);
        int suma = 0;
        for (Double numero : calculadora.getNumeros()) {
            suma += numero;
        }
        calculadora.setResultado(suma);
        return suma;
    }

    public static double resta(Calculadora calculadora) {
        calculadora.setResultado(0);
        double resta = 0;
        for (Double numero : calculadora.getNumeros()) {
            resta -= numero;
        }
        calculadora.setResultado(resta);
        return resta;
    }

    public static double dividir(Calculadora calculadora) {
        calculadora.setResultado(0);
        double dividir = 1;
        for (Double numero : calculadora.getNumeros()) {
            dividir = numero / dividir;
        }
        calculadora.setResultado(dividir);
        return dividir;
    }

    public static double multiplicar(Calculadora calculadora) {
        calculadora.setResultado(0);
        double multiplica = 1;
        for (Double numero : calculadora.getNumeros()) {
            multiplica = numero * multiplica;
        }
        calculadora.setResultado(multiplica);
        return multiplica;
    }
}

