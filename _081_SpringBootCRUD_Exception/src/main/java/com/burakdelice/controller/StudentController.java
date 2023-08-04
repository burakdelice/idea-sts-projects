package com.burakdelice.controller;

import com.burakdelice.exception.ResourcesNotFoundException;
import com.burakdelice.model.Student;
import com.burakdelice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    public String getSelamlama() {
        return "Hoşgeldiniz";
    }
    @GetMapping("/hello")
    public String getHello(@RequestParam(value = "studentName",defaultValue = "World")String name){
        return String.format("Hello %s!",name);
    }

    // https://localhost:8080/api/v1/students
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // https://localhost:8080/api/v1/students/1
    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getOneStudent(@PathVariable("id") Long id) throws ResourcesNotFoundException {
        return studentService.getOneStudent(id);
    }

    //POST - https://localhost:8080/api/v1/students
    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

  //UPDATE - https://localhost:8080/api/v1/students/1
    @PutMapping("/students/{id}")
    public ResponseEntity<Student> updateOneStudent(@PathVariable("id") Long id,
                                   @RequestBody Student student) throws ResourcesNotFoundException{

        Student studentInfo = studentService.getOneStudent(id).getBody();
        if(studentInfo!=null){
        studentInfo.setId(id);
        studentInfo.setFirstName(student.getFirstName());
        studentInfo.setLastName(student.getLastName());
        studentInfo.setEmail(student.getEmail());
        return studentService.updateOneStudent(studentInfo);
        }
        return null;
    }

    //DELETE - https://localhost:8080/api/v1/students/1
    @DeleteMapping ("/students/{id}")
    public Map<String,Boolean> deleteOneStudent(@PathVariable("id") Long id) throws ResourcesNotFoundException{
        return studentService.deleteOneStudent(id);
    }
}
