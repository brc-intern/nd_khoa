package springboot9.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import springboot9.api.output.newoutput;
import springboot9.dto.NewDTO;
import springboot9.service.INewService;

@RestController
public class NewAPI {
	@Autowired
	private INewService newservice;

	@PostMapping(value = "/new")
	public NewDTO createNew(@RequestBody NewDTO model) {
		return newservice.save(model);
	}
	@GetMapping(value="/new")
	public newoutput getitem() {
	newoutput resoult = new newoutput();
	resoult.setList(newservice.findall());
	return resoult;
	}
	@PutMapping(value="new/{id}")
	public NewDTO update(@RequestBody NewDTO model, @PathVariable("id") long id) {
		model.setId(id);
		return newservice.save(model);
	}
	@DeleteMapping(value="/new")
	public void delete(@RequestBody long[] ids) {
		newservice.del(ids);
	}
}
