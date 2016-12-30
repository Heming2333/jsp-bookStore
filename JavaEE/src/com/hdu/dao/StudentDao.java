package com.hdu.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.hdu.model.Class;
import com.hdu.model.College;
import com.hdu.model.Major;
import com.hdu.model.Student;

public interface StudentDao {
	public List<Student> queryStudents();
	public List<College> queryCollege();
	public List<Major> queryMajor(int collegeId);
	public List<Class> queryClass(int majorId);
	public Student queryStudent(String studentId);
	public void updateStudent(Student student);
	public void updateStudents(Student student);
	public HibernateTemplate getHibernateTemplate();
	public void deleteStudent(Student student);
}
