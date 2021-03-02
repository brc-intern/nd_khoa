package springboot9.service;

import java.util.List;

import springboot9.dto.NewDTO;

public interface INewService {
	NewDTO save(NewDTO newdto);
	List<NewDTO> findall();
	void del(long[] ids);
}
