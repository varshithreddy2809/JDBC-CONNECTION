package jdbc.dao ;

import jdbc.model.studentDetails;

public interface dboperationsInterface {

	public void createData(studentDetails s);
	public void updateData();
	public void deleteData();
	public void readData();
	
	
}
