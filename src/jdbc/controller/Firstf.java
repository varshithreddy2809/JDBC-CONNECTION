package jdbc.controller;

 

import jdbc.dao.CurdOperations;
import jdbc.model.studentDetails;

public class Firstf extends CurdOperations {

	public static void main(String[] args) {
		
		Firstf f = new Firstf();
		
		studentDetails s = new studentDetails();

		s.setId(7);
		s.setName("Vamshi");
		s.setAge(17);
		s.setGender("Male");
		s.setDepartment("CSE");
		   
//		f.createData(s);
//		f.updateData();
//		f.deleteData();
		f.readData();
	}

}
