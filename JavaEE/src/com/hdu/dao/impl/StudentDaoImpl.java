package com.hdu.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.hdu.model.College;
import com.hdu.model.Student;
import com.hdu.model.Major;
import com.hdu.model.Class;
import com.hdu.dao.StudentDao;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao{
	private HibernateTemplate hibernateTemplate;
	
	@SuppressWarnings("unchecked")
	public List<Student> queryStudents(){
		List<Student> list = new ArrayList<Student>();
		try{
			 list = hibernateTemplate.find("from Student");
			 for(int i = 0; i < list.size(); i++){
				list.get(i).setMajorName(((Major)hibernateTemplate.get(Major.class, list.get(i).getMajorId())).getName());
				list.get(i).setCollegeName(((College)hibernateTemplate.get(College.class, list.get(i).getCollegeId())).getName());
			 }
			 return list;
		}catch(Exception e){
			System.out.println("error"+e.getMessage());
			e.printStackTrace();
		}
		return list;
	}
	@SuppressWarnings("unchecked")
	public List<College> queryCollege(){
		List<College> list = new ArrayList<College>();
		try{
			 list = hibernateTemplate.find("from College");
			 return list;
		}catch(Exception e){
			System.out.println("error"+e.getMessage());
			e.printStackTrace();
		}
		return list;
	}
	@SuppressWarnings("unchecked")
	public List<Major> queryMajor(int collegeId){
		List<Major> list = new ArrayList<Major>();
		try{
			 list = hibernateTemplate.find("from Major m where m.collegeId = ?",collegeId);
			 return list;
		}catch(Exception e){
			System.out.println("error"+e.getMessage());
			e.printStackTrace();
		}
		return list;
	}
	@SuppressWarnings("unchecked")
	public List<Class> queryClass(int majorId){
		List<Class> list = new ArrayList<Class>();
		try{
			 list = hibernateTemplate.find("from Class c where c.majorId = ?",majorId);
			 return list;
		}catch(Exception e){
			System.out.println("error"+e.getMessage());
			e.printStackTrace();
		}
		return list;
	}
	public Student queryStudent(String id){
		System.out.println(id);
		Student student = new Student();
		try{
			student = (Student)hibernateTemplate.get(Student.class, id);
		}catch(Exception e){
			System.out.println("error"+e.getMessage());
			e.printStackTrace();
		}
		student.setMajorName(((Major)hibernateTemplate.get(Major.class, student.getMajorId())).getName());
		student.setCollegeName(((College)hibernateTemplate.get(College.class, student.getCollegeId())).getName());
		return student;
	}
	public void updateStudent(Student student){
		try{
			student.setMajorId(((Major)(hibernateTemplate.find("from Major m where m.name = ?", student.getMajorName())).get(0)).getMajorId());
			student.setCollegeId(((College)(hibernateTemplate.find("from College c where c.name = ?", student.getCollegeName())).get(0)).getCollegeId());
			hibernateTemplate.update(student);
			System.out.println(student.getAge());
		}catch(Exception e){
			System.out.println("error"+e.getMessage());
			e.printStackTrace();
		}
	}
	public void updateStudents(Student student){
		try{
			Student stu = (Student)hibernateTemplate.get(Student.class, student.getStudentId());
			student.setAge(stu.getAge());
			student.setB_no(stu.getB_no());
			student.setD_no(stu.getD_no());
			student.setNativePlace(stu.getNativePlace());
			student.setSex(stu.getSex());
			student.setTel(stu.getTel());
			hibernateTemplate.update(student);
		}catch(Exception e){
			System.out.println("error"+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void deleteStudent(Student student){
		hibernateTemplate.delete(student);
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
