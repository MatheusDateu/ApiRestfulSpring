package com.ifrr.projetosp4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifrr.projetosp4.bean.RoboBean;
import com.ifrr.projetosp4.dao.RoboDao;

@RestController
@RequestMapping ("/robos")
public class RoboController {

	@Autowired
	private RoboDao roboDao;
	
	@GetMapping
	public List<RoboBean> listar(){
		return roboDao.listar();
	}
	
	@GetMapping("/{codigo}")
	public RoboBean selecionar(@PathVariable long codigo){
		return roboDao.selecionar(codigo);
	}
	
	@PostMapping
	public RoboBean inserir(@RequestBody RoboBean robo) {
		return roboDao.inserir(robo);
	}
	
	@PutMapping("/{codigo}")
	public RoboBean alterar(@PathVariable long coidgo, @RequestBody RoboBean robo) {
		robo.setCodigo(coidgo);
		return roboDao.alterar(robo);
	}
	
	@DeleteMapping("/{codigo}")
	public void deletar(@PathVariable long codigo) {
		RoboBean robo = roboDao.selecionar(codigo);
		roboDao.deletar(robo);
	}
}
