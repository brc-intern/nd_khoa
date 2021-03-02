package springboot9.converter;

import org.springframework.stereotype.Component;

import entity.newentity;
import springboot9.dto.NewDTO;

@Component
public class Newconverter {
	public newentity toentity(NewDTO dto) {
		newentity entity = new newentity();
		entity.setPenus(dto.getPenus());
		entity.setSssss(dto.getSsss());
		return entity;
	}

	public NewDTO todto(newentity nnewentity) {
		NewDTO newdto = new NewDTO();
		newdto.setId(nnewentity.getId());
		newdto.setPenus(nnewentity.getPenus());
		newdto.setSsss(nnewentity.getSssss());
		return newdto;
	}

	public newentity toentity(NewDTO dto, newentity entity) {
		entity.setPenus(dto.getPenus());
		entity.setSssss(dto.getSsss());
		return entity;
	}
}
