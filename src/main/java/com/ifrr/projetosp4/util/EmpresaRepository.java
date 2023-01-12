package com.ifrr.projetosp4.util;

import java.util.List;

import com.ifrr.projetosp4.bean.EmpresaBean;

public interface EmpresaRepository {
	public EmpresaBean inserir(EmpresaBean celular);
	public EmpresaBean alterar(EmpresaBean celular);
	public void deletar(EmpresaBean celular);
	public EmpresaBean selecionar(long codigo);
	public List<EmpresaBean> listar();
}
