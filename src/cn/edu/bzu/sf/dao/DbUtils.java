package cn.edu.bzu.sf.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 数据库连接处理类
 * @author Administrator
 *
 */
public class DbUtils {
	public static Connection conn = null;  //数据库连接
	public static PreparedStatement pStmt = null;  //指令集
	public static ResultSet rs = null;    //结果集
	
	private static String CLS = "";
	private static String URL = "";
	private static String USER = "";
	private static String PWD = "";
	
	//打开数据库连接
	public static void getConenction(){
		try {
			Class.forName(CLS);
			conn = DriverManager.getConnection(URL, USER, PWD);   //获取连接
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//关闭数据库操作对象
	public static void closeAll(){
		try{
			if(rs!=null){
				rs.close();
				rs=null;
			}
			if(pStmt!=null){
				pStmt.close();
				pStmt=null;
			}
			if(conn!=null){
				conn.close();
				conn=null;
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
