package com.qusalsdn.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController // RestAPI를 이용하기 위한 선언
public class CourseController {
    @RequestMapping("/courses") // URL을 매핑해준다.
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(new Course(1, "Learn AWS", "qusalsdn"), new Course(1, "Learn AWS", "qusalsdn"), new Course(1, "Learn AWS", "qusalsdn"));
    }
}
