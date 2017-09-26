package br.edu.univas.si8.ta.calculadora.rest.impl;

import br.edu.univas.si8.ta.calculadora.rest.api.CalculadoraService;
import br.edu.univas.si8.ta.calculadora.rest.api.Result;

public class CalculadoraServiceImpl implements CalculadoraService{


	public Result sum(int first, int second) {
		int result = first + second;
		return new Result().withFirst(first).withSecond(second).withResult(result); 
	}


	public Result subtract(int first, int second) {
		int result = first - second;
		return new Result().withFirst(first).withSecond(second).withResult(result); 
	}

}
