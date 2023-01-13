package com.ifrr.projetosp4.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ifrr.projetosp4.bean.RoboBean;
import com.ifrr.projetosp4.util.RoboRepository;

@Component
public class RoboDao implements RoboRepository{
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	@Transactional
	public RoboBean inserir(RoboBean robo) {
		return manager.merge(robo);
	}

	@Override
	@Transactional
	public RoboBean alterar(RoboBean robo) {
		return manager.merge(robo);
	}

	@Override
	@Transactional
	public void deletar(RoboBean robo) {
		robo = selecionar(robo.getCodigo());
		manager.remove(robo);
	}

	@Override
	public RoboBean selecionar(long codigo) {
		return manager.find(RoboBean.class, codigo);
	}

	@Override
	public List<RoboBean> listar() {
		return manager.createQuery("from RoboBean", RoboBean.class).getResultList();
	}
	
}