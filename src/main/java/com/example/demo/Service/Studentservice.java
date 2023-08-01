package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.Studentinterface;
import com.example.demo.Entity.Custom;



@Service
public class Studentservice implements StudentServiceinterface {

	@Autowired
	Studentinterface studentinterface;
	
	@Override
	public Custom saveStudent(Custom custom) {
		// TODO Auto-generated method stub
		return studentinterface.save(custom);
	}


	@Override
	public List<Custom> ViewStudents() {
		// TODO Auto-generated method stub
		return studentinterface.findAll();
	}

	@Override
	public Custom showStudent(Integer id) {
		// TODO Auto-generated method stub
		return studentinterface.findById(id).get();
	}

	@Override
	public boolean deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		studentinterface.deleteById(id);
		return true;
	}


	@Override
	public Custom updateStudent(Custom custom) {
		Custom existingstudent = studentinterface.findById(custom.getId()).orElse(null);
		existingstudent.setName(custom.getName());
		existingstudent.setRollno(custom.getRollno());
		existingstudent.setGender(custom.getGender());
		// TODO Auto-generated method stub
		return studentinterface.save(existingstudent);
	}



}
