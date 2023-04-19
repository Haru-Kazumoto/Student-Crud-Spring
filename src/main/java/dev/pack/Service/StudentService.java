package dev.pack.Service;

import dev.pack.Entity.Student;

import java.util.List;

public interface StudentService {
    Student createRecord(Student body);
    List<Student> findAllRecord();
}
