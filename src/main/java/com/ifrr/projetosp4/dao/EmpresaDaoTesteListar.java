package com.ifrr.projetosp4.dao;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.ifrr.projetosp4.ProjetoSp4Application;
import com.ifrr.projetosp4.bean.EmpresaBean;

public class EmpresaDaoTesteListar {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(ProjetoSp4Application.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		EmpresaDao cd = applicationContext.getBean(EmpresaDao.class);
		
		List<EmpresaBean> contas = cd.listar();
		
		for(EmpresaBean c : contas) {
			System.out.println(c.getNome());
		}
		
	}
}
