package com.ifrr.projetosp4.dao;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.ifrr.projetosp4.ProjetoSp4Application;
import com.ifrr.projetosp4.bean.EmpresaBean;

public class EmpresaDaoTesteInserir {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(ProjetoSp4Application.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		EmpresaDao cd = applicationContext.getBean(EmpresaDao.class);
		
		EmpresaBean c = new EmpresaBean();
		c.setNome("Samsung");
		c.setCnpj("00000000007");
		c.setTelefone("(95)00000-0007");
		c.setEndereco("Avenida Teste, 001");
		c.setEmail("email7@email.com");
		
		cd.inserir(c);
	}
}
