package fr.wildcodeschool.students.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import fr.wildcodeschool.students.models.Student;

@Repository
public class StudentsRepoBdx implements StudentsDao{
	
		public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("toto"));
        students.add(new Student("titi"));
        students.add(new Student("tata"));
        return students;
    }
}
