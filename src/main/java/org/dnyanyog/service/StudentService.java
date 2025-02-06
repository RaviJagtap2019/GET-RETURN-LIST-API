package org.dnyanyog.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.dnyanyog.common.DBUtils;

public class StudentService {
	
	
	  public List<String> getStudentName( ) throws SQLException{
			
			List<String> studentName=new ArrayList<>();
			
			try {
				ResultSet rs=DBUtils.executeSelectQuery("Select * from student");
			while(rs.next()) {
					for(int i=1;i<6;i++) {
						studentName.add(rs.getString(i));
					}
		  }
			return studentName;		
		}catch (SQLException e) {
			e.printStackTrace();
			return studentName;
		
		}
	  }
}
