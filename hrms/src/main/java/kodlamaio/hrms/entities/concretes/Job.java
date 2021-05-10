package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="jobs")
@Data
public class Job {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String jobName;
	
	public Job() {
		
	}

	public Job(int id, String jobName) {
		super();
		this.id = id;
		this.jobName = jobName;
	}

}