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

import com.ifrr.projetosp4.bean.EmpresaBean;
import com.ifrr.projetosp4.dao.EmpresaDao;

@RestController
@RequestMapping ("/empresas")
public class EmpresaController {

	@Autowired
	private EmpresaDao empresaDao;
	
	@GetMapping
	public List<EmpresaBean> listar(){
		return empresaDao.listar();
	}
	
	@GetMapping("/{codigo}")
	public EmpresaBean selecionar(@PathVariable long codigo){
		return empresaDao.selecionar(codigo);
	}
	
	@PostMapping
	public EmpresaBean inserir(@RequestBody EmpresaBean empresa) {
		return empresaDao.inserir(empresa);
	}
	
	@PutMapping("/{codigo}")
	public EmpresaBean alterar(@PathVariable long coidgo, @RequestBody EmpresaBean empresa) {
		empresa.setCodigo(coidgo);
		return empresaDao.alterar(empresa);
	}
	
	@DeleteMapping("/{codigo}")
	public void deletar(@PathVariable long codigo) {
		EmpresaBean empresa = empresaDao.selecionar(codigo);
		empresaDao.deletar(empresa);
	}
}
