package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Jobseeker;

public interface JobSeekerDao extends JpaRepository<Jobseeker, Integer> {

	Jobseeker findJobseekerByNationalId(String nationalId);
}
