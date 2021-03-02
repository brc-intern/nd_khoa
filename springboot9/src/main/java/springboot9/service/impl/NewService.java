package springboot9.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.newentity;
import springboot9.Repository.NewRepository;
import springboot9.converter.Newconverter;
import springboot9.dto.NewDTO;
import springboot9.service.INewService;

@Service
public class NewService implements INewService {
	@Autowired
	private NewRepository newRepository;
	@Autowired
	private Newconverter newconverter;

	@Override
	public NewDTO save(NewDTO newdto) {
		newentity nnewentity = new newentity();
		if (newdto.getId() != null) {
			newentity oldnewentity = newRepository.findOne(newdto.getId());
			nnewentity = newconverter.toentity(newdto, oldnewentity);
		}
		else
		{
			nnewentity = newconverter.toentity(newdto);
		}
		
		nnewentity = newRepository.save(nnewentity);
		return newconverter.todto(nnewentity);
	}

	@Override
	public List<NewDTO> findall() {
		List<NewDTO> results = new ArrayList<>();
		List<newentity> entity = newRepository.findAll();
		for (newentity enntity : entity) {
			NewDTO dto = newconverter.todto(enntity);
			results.add(dto);
		}
		return results;
	}

	@Override
	public void del(long[] ids) {
		for(long item : ids) {
			newRepository.delete(item);
		}
		
	}
}
