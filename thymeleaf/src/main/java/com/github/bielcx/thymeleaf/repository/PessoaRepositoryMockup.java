package com.github.bielcx.thymeleaf.repository;

import java.util.ArrayList;
import java.util.List;

import com.github.bielcx.thymeleaf.model.Pessoa;

public class PessoaRepositoryMockup {
	
	public List<Pessoa> list(){
		List<Pessoa> result = new ArrayList<>();
		
		Pessoa pessoa = new Pessoa(1L,"Pele","M");
		result.add(pessoa);
		
		pessoa = new Pessoa(2L,"Rainha Elis","F");
		result.add(pessoa);
		
		result.add(new Pessoa(3L, "Madona", "F"));
		
		return result;
	}

}
