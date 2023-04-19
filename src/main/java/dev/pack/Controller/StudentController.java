package dev.pack.Controller;

import dev.pack.Entity.Address;
import dev.pack.Entity.Student;
import dev.pack.Service.AddressService;
import dev.pack.Service.StudentService;
import dev.pack.dto.StudentDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "api/v1")
@CrossOrigin
public class StudentController {

    private final StudentService studentService;
    private final AddressService addressService;
    private final ModelMapper modelMapper;

    @RequestMapping(path = "/student/create", method = RequestMethod.POST)
    public ResponseEntity<?> createRecord(@RequestBody @Valid StudentDTO bodyDto){
        Student response = modelMapper.map(bodyDto, Student.class);
        return ResponseEntity.accepted().body(studentService.createRecord(response));
    }

    @RequestMapping(path = "/student/find-all", method = RequestMethod.GET)
    public ResponseEntity<List<?>> findAllRecord(){
        return ResponseEntity.ok(studentService.findAllRecord());
    }

    @RequestMapping(path = "/address/find-all", method = RequestMethod.GET)
    public ResponseEntity<List<Address>> findAllAddressRecord(){
        return ResponseEntity.ok(addressService.findAllRecordAddress());
    }
}
