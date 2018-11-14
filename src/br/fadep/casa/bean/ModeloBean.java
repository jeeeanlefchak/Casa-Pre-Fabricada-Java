package br.fadep.casa.bean;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.Query;

import br.fadep.casa.model.Modelo;


@Stateless
public class ModeloBean extends AbstractBeanImpl<Modelo> implements ModeloBeanLocal{

	@Override
	public Class<Modelo> getClasses() throws Exception {
		return Modelo.class;
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public List<Modelo> salvarLista(List<Modelo> modelos) throws Exception{
		List<Modelo> listaModelos = null;
		for(Modelo mo : modelos) {
			salvar(mo);
			listaModelos.add(mo);
		}
		return listaModelos;
	}
	
	public List<Modelo> buscarModelos() throws Exception{
		String sql = "select * from modelo where deletado = false";
		Query query = entity.createNativeQuery(sql, Modelo.class);
		return query.getResultList();
	}
	
//	public Modelo insertNativo(Modelo modelo)throws Exception{
//		
//		String sql1 = "select id from modelo order by id desc limit 1";
//		Query query1 = entity.createNativeQuery(sql1);
//		Long ultimoId = (Long) query1.getResultList().get(0);
//
//		query1.executeUpdate();
//		String sql2 = " insert into modelo (id,dataalteracao,datacadastro,deletado, versao, imagem, posicao )  "
//	                + "  values (:id, :dataAlteracao, :dataCadastro, :deletado, :versao, :imagem, :posicao); ";
//		Query query2 = entity.createNativeQuery(sql2);
//		query2.setParameter("id", ultimoId);
//		query2.setParameter("dataAlteracao", modelo.getDataAlteracao());
//		query2.setParameter("dataCadastro", modelo.getDataCadastro());
//		query2.setParameter("deletado", false);
//		query2.setParameter("versao", 0);
//		query2.setParameter("imagem", modelo.getImagem());
//		query2.setParameter("posicao", modelo.getPosicao());
//		return (Modelo) query2.getResultList().get(0);
//	}

}
