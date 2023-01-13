package com.ifrr.projetosp4.util;

import java.util.List;

import com.ifrr.projetosp4.bean.RoboBean;

public interface RoboRepository {
	public RoboBean inserir(RoboBean robo);
	public RoboBean alterar(RoboBean robo);
	public void deletar(RoboBean robo);
	public RoboBean selecionar(long codigo);
	public List<RoboBean> listar();
}
