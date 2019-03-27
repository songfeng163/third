package cn.edu.bzu.sf.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * ���ݿ����Ӵ�����
 * @author Administrator
 *
 */
public class DbUtils {
	public static Connection conn = null;  //���ݿ�����
	public static PreparedStatement pStmt = null;  //ָ�
	public static ResultSet rs = null;    //�����
	
	private static String CLS = "";
	private static String URL = "";
	private static String USER = "";
	private static String PWD = "";
	
	//�����ݿ�����
	public static void getConenction(){
		try {
			Class.forName(CLS);
			conn = DriverManager.getConnection(URL, USER, PWD);   //��ȡ����
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//�ر����ݿ��������
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
