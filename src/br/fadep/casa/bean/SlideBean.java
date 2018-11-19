package br.fadep.casa.bean;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import com.sun.mail.util.QEncoderStream;

import br.fadep.casa.model.Slide;

@Stateless
public class SlideBean extends AbstractBeanImpl<Slide> implements SlideBeanLocal{

	@Override
	public Class<Slide> getClasses() throws Exception {
		// TODO Auto-generated method stub
		return Slide.class;
	}

	public List<Slide> buscaSlides()throws Exception{
		String sql = "select * from slide where deletado = false";
		Query query = entity.createNativeQuery(sql, Slide.class);
		return query.getResultList();
	}
}
