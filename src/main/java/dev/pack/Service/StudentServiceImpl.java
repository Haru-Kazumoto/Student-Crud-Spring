package dev.pack.Service;

import dev.pack.Entity.Student;
import dev.pack.Repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{
    private final StudentRepository repository;

    @Override
    public Student createRecord(Student body) {
        return repository.save(body);
    }

    @Override
    public List<Student> findAllRecord() {
        return repository.findStudentWithAddress();
    }
}
