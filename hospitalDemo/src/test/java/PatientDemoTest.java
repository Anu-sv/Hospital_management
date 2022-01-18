


import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;


import org.assertj.core.api.Assertions;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.hospitalDemo.HospitalDemoApplication;
import com.example.hospitalDemo.model.Patients;
import com.example.hospitalDemo.repository.PatientRepository;


@SpringBootTest(classes=HospitalDemoApplication.class)

@AutoConfigureMockMvc
class PatientDemoTest {
	
	@Autowired
	private PatientRepository repo;
	
	
	@Test
	public void getPatients() {
		List<Patients> p= repo.findAll();
		Assertions.assertThat(p.size()).isGreaterThan(0);
		
		
		
	}

	@Test
	public void savePatients() throws Exception {
		String date2="2020-10-23";
	    
	    SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd");
	    
	    Date dd=format.parse(date2);
		Patients p=new Patients("anil","dr.grish",dd);
		repo.save(p);
		Assertions.assertThat(p.getId()).isGreaterThan(0);
		
		
		
	}

	@Test
	public void getPatientsById() {
		Patients p= repo.findById(101L).get();
		Assertions.assertThat(p.getId()).isEqualTo(101L);
		
		
		
	}
	
}
