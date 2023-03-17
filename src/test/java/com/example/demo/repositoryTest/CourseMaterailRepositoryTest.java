package com.example.demo.repositoryTest;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Course;
import com.example.demo.entity.CourseMaterial;
import com.example.demo.repository.CourseMaterailRepository;

@SpringBootTest
public class CourseMaterailRepositoryTest {
	@Autowired
	private CourseMaterailRepository courseMaterailRepository ;
	@Test
	public void SaveCourseMaterail() {
		Course course=Course.builder().title("DATa").credits(19).build();
	
		CourseMaterial courseMaterial= CourseMaterial.builder().url("www.gfg.com")
				.course(course)
				.build();
		courseMaterailRepository.save(courseMaterial);
	}
	@Test
	public void printAllCourseMaterials() {
		List<CourseMaterial> courseMaterials=courseMaterailRepository.findAll();
		System.out.println(courseMaterials);
		
	}

}
