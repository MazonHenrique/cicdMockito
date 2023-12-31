package br.com.erudio.business;

import java.util.ArrayList;
import java.util.List;

import br.com.erudio.service.CourseService;

//CourseBusiness  = STU - System (Method) Under Test
public class CourseBusiness {
	
	//CourseService is a dependency
	private CourseService service;

	public CourseBusiness(CourseService service) {
		this.service = service;
	}
	
	public List<String> retrieveCoursesRelatedToString(String student) {
		
		var filteredCourses = new ArrayList<String>();
		if("Foo Bar".equals(student)) return filteredCourses;
		var allCourses = service.retrieveCourses(student);
		
		for (String course : allCourses) {
			if (course.contains("Spring")) {
				filteredCourses.add(course);
			}
		}
		
		return filteredCourses;
		
	}

}
