package jdbc.dao;

import jdbc.model.studentDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import jdbc.utility.dbConnection;

public class CurdOperations implements dboperationsInterface{
	Connection con = null;

	public void readData() {
		try {
			con= dbConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from student" );
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getInt(3) + " : "
						+ rs.getString(4) + " : " + rs.getString(5));
			}
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createData(studentDetails s) {
		try {
			con= dbConnection.getConnection();;
		    PreparedStatement st = con.prepareStatement("insert into student values (?,?,?,?,?)");
		    st.setInt(1,s.getId());
		    st.setString(2,s.getName());
		    st.setInt(3,s.getAge());
		    st.setString(4,s.getGender());
		    st.setString(5, s.getDepartment() );
			int n = st.executeUpdate( );
			if (n > 0) {
				System.out.println(n + " row affected");
			} else {
				System.out.println("something went wrong");
			}
			st.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

	public void updateData() {
		try {
			con= dbConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(" update student set Gender=? where StudentID=?");
			ps.setString(1, "");
			ps.setInt(2, 2);
			int n = ps.executeUpdate();
			if (n > 0) {
				System.out.println(n + " row(s) affected");
			} else {
				System.out.println("somrthing went worng");
			}
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Okay");

	}

	public void deleteData() {
		try {
			con= dbConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from student where StudentID = ?");
			ps.setInt(1, 1);
			int n = ps.executeUpdate();
			if (n > 0) {
				System.out.println(n + " row(s) affected");
			} else {
				System.out.println("Something went wrong");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
