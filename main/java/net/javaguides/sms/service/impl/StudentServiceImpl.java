package net.javaguides.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;
import net.javaguides.sms.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
    
	

	
	private StudentRepository studentRepository;
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}

	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}

}
