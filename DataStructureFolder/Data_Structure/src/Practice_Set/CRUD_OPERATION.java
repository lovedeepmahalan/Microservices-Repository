package Practice_Set;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CRUD_OPERATION {

	private static final String Insert_Query = "insert into student values(?,?,?,?)";
	private static final String Delete_Query = "delete from student where id=?";
	private static final String Update_Query = "update student set team=? where id=?";
	private static final String Select_Query = "select * from student where id=?";
	private static Connection con=null;
	private static PreparedStatement stmt=null;
	private static ResultSet rs=null;
	private static Scanner sc=null;
	
	static {
		if(con==null) {
			try {
				con=Test.getConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args)  {
		int rowCount=0;
		sc=new Scanner(System.in);
		if(con!=null) {
			try {
				stmt=con.prepareStatement(Select_Query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(stmt!=null && sc!=null) {
			try{
				System.out.println("Enter the id");
				int id=sc.nextInt();
				stmt.setInt(1, id);
				rs=stmt.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(rs!=null) {
			System.out.println("id name age team");
			try {
				while(rs.next()) {
					int id=rs.getInt(1);
					String name=rs.getString(2);
					int age=rs.getInt(3);
					String team=rs.getString(4);
					System.out.println(id+" "+name+" "+age+" "+team);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				Test.CloseConnection(rs, stmt, con);
			}
		}
		
	}
}
