package com.example.Calculadora;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {



    @PostMapping("suma")
    public double suma(@RequestBody Calculadora calculadora){ return  CalculadoraServices.suma(calculadora); }
    @PostMapping("resta")
    public  double  resta(@RequestBody Calculadora calculadora)
    {
        return CalculadoraServices.resta(calculadora);
    }
    @PostMapping("dividir")
    public  double  dividir(@RequestBody Calculadora calculadora)
    {
        return CalculadoraServices.dividir(calculadora);
    }
    @PostMapping("multiplicar")
    public  double  multiplicar(@RequestBody Calculadora calculadora){return CalculadoraServices.multiplicar(calculadora);
    }

}
