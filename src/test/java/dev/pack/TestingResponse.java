package dev.pack;

import dev.pack.Entity.Address;
import dev.pack.Entity.Student;
import dev.pack.Repository.AddressRepository;
import dev.pack.Repository.StudentRepository;
import dev.pack.Service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;

import java.time.LocalDate;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestingResponse {

    @Mock private StudentRepository studentRepositoryTest;
    @Mock private AddressRepository addressRepositoryTest;
    @InjectMocks private StudentService serviceTest;

//    @Test
//    public void testCreateRecord() {
//        Address addressRecord = new Address(1L, "TestStreet","TestState", "TestTown", "1234");
//        when(addressRepositoryTest.save(addressRecord)).thenReturn(addressRecord);
//        Student studentRecord = new Student(1L, "Test", 17, LocalDate.of(2006, 04, 04), addressRecord);
//        when(studentRepositoryTest.save(studentRecord)).thenReturn(studentRecord);
//
//        Student savedStudent = serviceTest.createRecord(studentRecord);
//
//
//    }
}
