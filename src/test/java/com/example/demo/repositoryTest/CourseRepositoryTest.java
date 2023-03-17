package com.example.demo.repositoryTest;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;


@SpringBootTest
public class CourseRepositoryTest {
	@Autowired
	private CourseRepository courseRepository;

	@Test
	public void findAllPagination() {
		
		Pageable firstPageWithThreeRecords = PageRequest.of(0, 3);
		
		Pageable secondPageWithTwoRecords =PageRequest.of(1, 3);
		
		Pageable firstPage = PageRequest.of(0, 1);
		
		List<Course> courses = courseRepository.findAll(firstPageWithThreeRecords).getContent();
		
		long totalElements = courseRepository.findAll(firstPageWithThreeRecords).getTotalElements();
		
		long totalPages = courseRepository.findAll(firstPageWithThreeRecords).getTotalPages();
		
		System.out.println(totalPages);
		
		System.out.println(totalElements);
		
		System.out.println(courses);
	}

	@Test
	public void findAllSorting() {
		Pageable sortByTitle = PageRequest.of(0, 2, Sort.by("title"));
		Pageable sortByCreditDesc = PageRequest.of(0, 2, Sort.by("credit").descending());
		Pageable sortByTitleAndCreditDesc = PageRequest.of(0, 2, Sort.by("title").descending().and(Sort.by("credit")));
		List<Course> courses= courseRepository.findAll(sortByTitle).getContent();
		System.out.println(courses);
		}

	@Test
	public void printfindByTitleContaining() {
		
		Pageable firstPageTenRecords = PageRequest.of(0, 10);
		
		List<Course> courses = courseRepository.findByTitleContaining("D", firstPageTenRecords).getContent();}

}
