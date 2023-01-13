package com.ifrr.projetosp4.dao;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.ifrr.projetosp4.ProjetoSp4Application;
import com.ifrr.projetosp4.bean.RoboBean;

public class RoboDaoTesteInserir {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(ProjetoSp4Application.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		RoboDao cd = applicationContext.getBean(RoboDao.class);
		
		RoboBean c = new RoboBean();
		c.setNome("Novo");
		c.setUrl("https://www.youtube.com/watch?v=IJzLoJPW1Ls");
		cd.inserir(c);
	}
}
