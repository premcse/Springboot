package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Custom;


public interface StudentServiceinterface {
		Custom saveStudent(Custom custom);
		Custom updateStudent(Custom custom);
		List<Custom> ViewStudents();
		Custom showStudent(Integer id);
		boolean deleteStudent(Integer id);
		
}
