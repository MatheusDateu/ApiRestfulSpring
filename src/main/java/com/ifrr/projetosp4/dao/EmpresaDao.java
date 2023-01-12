package com.ifrr.projetosp4.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ifrr.projetosp4.bean.EmpresaBean;
import com.ifrr.projetosp4.util.EmpresaRepository;

@Component
public class EmpresaDao implements EmpresaRepository{
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	@Transactional
	public EmpresaBean inserir(EmpresaBean empresa) {
		return manager.merge(empresa);
	}

	@Override
	@Transactional
	public EmpresaBean alterar(EmpresaBean celular) {
		return manager.merge(celular);
	}

	@Override
	@Transactional
	public void deletar(EmpresaBean celular) {
		celular = selecionar(celular.getCodigo());
		manager.remove(celular);
	}

	@Override
	public EmpresaBean selecionar(long codigo) {
		return manager.find(EmpresaBean.class, codigo);
	}

	@Override
	public List<EmpresaBean> listar() {
		return manager.createQuery("from EmpresaBean", EmpresaBean.class).getResultList();
	}
	
}