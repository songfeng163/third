package cn.edu.bzu.sf.po;

/**
 * 学生信息实体类
 * @author 宋锋
 * @date 2019-03-27 18:15 
 */
public class Student {
	private int id;   //id
	private String stuNo;   //学号
	private String stuName;  //姓名
	private String gender;   //性别
	
	private String birth;      //生日

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String stuNo, String stuName, String gender, String birth) {
		super();
		this.id = id;
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.gender = gender;
		this.birth = birth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStuNo() {
		return stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
}
