package com.example.Calculadora;

import org.springframework.http.MediaType;

import java.util.ArrayList;

public class Calculadora {


    private ArrayList<Double>  numeros;
    private double resultado;

    public Calculadora(ArrayList<Double> numeros, double resultado) {
        this.numeros = numeros;
        this.resultado = resultado;
    }

    public ArrayList<Double> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<Double> numeros) {
        this.numeros = numeros;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Calculadora{" +
                "numeros=" + numeros +
                ", resultado=" + resultado +
                '}';
    }

}
