package br.com.erudio.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.erudio.service.CourseService;
import br.com.erudio.service.stubs.CourseServiceStub;

class CourseBusinessStubTest {
	
	@Test
	void testCoursesRelatedToString_When_Using_AStub() {
		
		//Given
		CourseService stubService = new CourseServiceStub();
		CourseBusiness business = new CourseBusiness(stubService);
		
		//When
		var filteredCourses = business.retrieveCoursesRelatedToString("Leandro");
		
		//Then
		assertEquals(4, filteredCourses.size());
	}

	@Test
	void testCoursesRelatedToString_When_Using_AFooBarStudent() {
		
		//Given
		CourseService stubService = new CourseServiceStub();
		CourseBusiness business = new CourseBusiness(stubService);
		
		//When
		var filteredCourses = business.retrieveCoursesRelatedToString("Foo Bar");
		
		//Then
		assertEquals(0, filteredCourses.size());
	}	
}
