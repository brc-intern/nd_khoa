package springboot9.api.output;

import java.util.ArrayList;
import java.util.List;

import springboot9.dto.NewDTO;

public class newoutput {
private List<NewDTO> list = new ArrayList<>();

public List<NewDTO> getList() {
	return list;
}

public void setList(List<NewDTO> list) {
	this.list = list;
} 

}
