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
			getConenction();    //父类的打开连接的方法，取得conn
			String sql = "select * from student";
			pStmt = conn.prepareStatement(sql);
			rs = pStmt.executeQuery();
			while(rs.next()){
				Student stu = new Student();
				
				stu.setId(rs.getInt("id"));
				stu.setStuName(rs.getString("stuName"));
				stu.setStuNo(rs.getString("stuNo"));
				//其它的属性设置，与数据表中的字段对应去写即可
				
				list.add(stu);
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			closeAll();   //父类的关闭数据库对象的方法
		}
		return list;
	}
}
