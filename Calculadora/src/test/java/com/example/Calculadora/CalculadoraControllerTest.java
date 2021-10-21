package com.example.Calculadora;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(value = CalculadoraController.class)
class CalculadoraControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Mock
    private CalculadoraController calculadoraControllermock;
    private CalculadoraServices calculadoraServicesmock;

    @Test
    void suma(){
        double[] numbers= new double[]{3,4,5};
        Object calculadora = new Object();

    }


    @Test
    void resta() {
    }

    @Test
    void dividir() {
    }

    @Test
    void multiplicar() {
    }

}