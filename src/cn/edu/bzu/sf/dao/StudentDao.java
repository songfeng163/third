package cn.edu.bzu.sf.dao;

import java.util.ArrayList;
import java.util.List;

import cn.edu.bzu.sf.po.Student;

/**
 * @author Administrator
 *
 */
public class StudentDao extends DbUtils {
	public List<Student> getAllStudentList(){
		List<Student> list = new ArrayList<Student>();
		try{
			getConenction();    //����Ĵ����ӵķ�����ȡ��conn
			String sql = "select * from student";
			pStmt = conn.prepareStatement(sql);
			rs = pStmt.executeQuery();
			while(rs.next()){
				Student stu = new Student();
				
				stu.setId(rs.getInt("id"));
				stu.setStuName(rs.getString("stuName"));
				stu.setStuNo(rs.getString("stuNo"));
				//�������������ã������ݱ��е��ֶζ�Ӧȥд����
				
				list.add(stu);
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			closeAll();   //����Ĺر����ݿ����ķ���
		}
		return list;
	}
}
