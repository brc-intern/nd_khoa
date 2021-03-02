package entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class newentity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "tisssstleee")
	private String penus;
	@Column(name ="content")
	private String ssss;
	public String getPenus() {	
		return penus;
	}

	public void setPenus(String penus) {
		this.penus = penus;
	}

	public Long getId() {
		return id;
	}

	public String getSssss() {
		return ssss;
	}

	public void setSssss(String sssss) {
		this.ssss = sssss;
	}
	
}