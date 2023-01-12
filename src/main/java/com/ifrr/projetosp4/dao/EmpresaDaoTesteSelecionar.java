package com.ifrr.projetosp4.dao;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.ifrr.projetosp4.ProjetoSp4Application;
import com.ifrr.projetosp4.bean.EmpresaBean;

public class EmpresaDaoTesteSelecionar {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(ProjetoSp4Application.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		EmpresaDao cd = applicationContext.getBean(EmpresaDao.class);
		
		EmpresaBean c = cd.selecionar(4);
		
		
		System.out.println(c.getNome());
	}
}
