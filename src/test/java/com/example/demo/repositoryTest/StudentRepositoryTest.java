package com.example.demo.repositoryTest;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Guardian;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
@SpringBootTest
class StudentRepositoryTest {
	@Autowired
	private StudentRepository studentRepository;

//	@Test
//	public void saveStudent() {
//		 Student student=Student.builder().emailId("Mmkhan92@gmail.com").firstName("Muzaffar").lastName("khan"). build();
//				 //.guardianName("Pathan").guardianEmail("pathan@gmail.com").guardianMobile("7891563297").
//				
//	studentRepository.save(student);
//	}
	
//	@Test
//	public void saveStudentWithGuardian() {
//		Guardian grd=Guardian.builder().email("lap0top87@gmail.com").name("Dell").mobile("7412395146").build();
//		 Student student1=Student.builder().emailId("Hplappy96@gmail.com").firstName("HPbgs").lastName("Company").guardian(grd). build();				
//	studentRepository.save(student1);
//	}
	
	@Test
	public void printAllStudent() {
		List<Student> studentList=studentRepository.findAll();
		System.out.println(studentList);
		
	}
	@Test
	public void printStudentByFirstName() {
		List<Student> student1=studentRepository.findByFirstName("SRK");
		System.out.println(student1);
		
	}
	@Test
	public void printStudentByEmailId() {
		List<Student> student2=studentRepository.findByEmailId("Hplappy96@gmail.com");
		System.out.println(student2);
		
	}
	@Test
	public void printStudentByGuardianName() {
		List<Student> student3=studentRepository.findByGuardianName("irfan");
		System.out.println(student3);
		
	}
//	@Test
//	public  void printGetStudentByEmailIdNative() {
//		Student student = studentRepository.getStudentByEmailIdNative("Hplappy96@gmail.com");
//		System.out.println(student);
//	}
	@Test
	public void updateStudentNameByEmailIdtest() {
		studentRepository.updateStudentNameByEmailId("Abdul Hameed", "Mmkhan92@gmail.com");
		
	}
	
//	public void printStudentByGuardianName() {
//		
//	}
//	
}
