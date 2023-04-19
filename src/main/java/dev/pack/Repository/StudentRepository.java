package dev.pack.Repository;

import dev.pack.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("Select s FROM Student s LEFT JOIN FETCH s.address")
    List<Student> findStudentWithAddress();
}
