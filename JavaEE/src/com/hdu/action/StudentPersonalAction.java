package com.hdu.action;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.hdu.dao.StudentDao;
import com.hdu.model.College;
import com.hdu.model.Major;
import com.hdu.model.Class;
import com.hdu.model.Student;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
@Scope("prototype")
@Component("studentPersonalAction")
public class StudentPersonalAction extends ActionSupport{
	private Map<String, Object> dataMap;
	private StudentDao studentDao;
	private Student student;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Resource
	public void setStudentDao(StudentDao studentDao){
		this.studentDao = studentDao;
	}
	public StudentDao getStudentDao(){
		return studentDao;
	}
	public void setDataMap(Map<String, Object> dataMap){
		this.dataMap = dataMap;
	}
	public Map<String, Object> getDataMap() {
		return dataMap;
	}
	
	public String studentPersonalQuery(){
		System.out.println("studentPersonalQuery");
		Student stu = studentDao.queryStudent(student.getStudentId());
		dataMap = new HashMap<String,Object>();
		dataMap.put("id", stu.studentId);
		dataMap.put("name", stu.getName());
		dataMap.put("tel", stu.getTel());
		dataMap.put("age",stu.getAge());
		dataMap.put("nativePalce", stu.getNativePlace());
		dataMap.put("class", stu.getClassId());
		dataMap.put("major", stu.getMajorName());
		dataMap.put("college", stu.getCollegeName());
		dataMap.put("dom", stu.getD_no());
		dataMap.put("building", stu.getB_no());
		dataMap.put("sex", stu.getSex());
		return "query";
	}
	
	public String studentPersonalUpdate(){
		System.out.println("studentPersonalUpdate");
		studentDao.updateStudent(student);
		dataMap = new HashMap<String,Object>();
		dataMap.put("status", "success");
		return "update";
	}
	public String studentUpdate(){
		System.out.println("studentPersonalUpdate");
		studentDao.updateStudents(student);
		dataMap = new HashMap<String,Object>();
		dataMap.put("status", "success");
		return "updateAdmin";
	}
	
	public String studentsQuery(){
		System.out.println("studentsQuery");
		List<Student> list = studentDao.queryStudents();
		int i;
		dataMap = new HashMap<String,Object>();
		for(i = 0; i < list.size(); i++){
			dataMap.put("student"+i, list.get(i));
		}
		return "queryStudents";
	}
	public String deleteStudent(){
		System.out.println("deleteStudent");
		studentDao.deleteStudent(student);
		dataMap = new HashMap<String,Object>();
		dataMap.put("status", "success");
		return "delete";
	}
	public String queryCollege(){
		System.out.println("queryCollege");
		List<College> list = studentDao.queryCollege();
		int i;
		dataMap = new HashMap<String,Object>();
		for(i = 0; i < list.size(); i++){
			dataMap.put("college"+i, list.get(i));
		}
		return "collegeList";
	}
	public String queryMajor(){
		System.out.println("queryMajor");
		List<Major> list = studentDao.queryMajor(student.getCollegeId());
		int i;
		dataMap = new HashMap<String,Object>();
		for(i = 0; i < list.size(); i++){
			dataMap.put("major"+i, list.get(i));
		}
		return "majorList";
	}
	public String queryClass(){
		System.out.println("queryClass");
		System.out.println(student.getMajorId());
		List<Class> list = studentDao.queryClass(student.getMajorId());
		int i;
		dataMap = new HashMap<String,Object>();
		for(i = 0; i < list.size(); i++){
			dataMap.put("class"+i, list.get(i));
		}
		return "classList";
	}
}