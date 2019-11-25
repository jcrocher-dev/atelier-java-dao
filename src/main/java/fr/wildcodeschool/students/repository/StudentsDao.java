package fr.wildcodeschool.students.repository;

import java.util.List;

import fr.wildcodeschool.students.models.Student;


public interface StudentsDao {

    List<Student> findAll();
    
}
