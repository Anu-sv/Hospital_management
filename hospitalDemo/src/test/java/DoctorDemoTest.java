
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import org.springframework.boot.test.context.SpringBootTest;

import com.example.hospitalDemo.HospitalDemoApplication;

import com.example.hospitalDemo.model.Doctors;

import com.example.hospitalDemo.repository.DoctorRepository;

@SpringBootTest(classes=HospitalDemoApplication.class)
@AutoConfigureMockMvc
class DoctorDemoTest {
	

	@Autowired
	private DoctorRepository repo;
	
	
	@Test
	public void getPatients() {
		List<Doctors> p= repo.findAll();
		Assertions.assertThat(p.size()).isGreaterThan(0);
		
		
		
	}

	@Test
	public void savePatients() throws Exception {
		
	    Doctors p=new Doctors("Dr.shami",30,'F',"Dentist");
		repo.save(p);
		Assertions.assertThat(p.getId()).isGreaterThan(0);
		
		
		
	}


    
}
