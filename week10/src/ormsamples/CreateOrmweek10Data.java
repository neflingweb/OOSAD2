/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateOrmweek10Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = ormtest.Ormweek10PersistentManager.instance().getSession().beginTransaction();
		try {
			for(int i = 0;i < 40;i++)
				{
				ormtest.Employee lormtestEmployee = ormtest.Employee.createEmployee();
				// Initialize the properties of the persistent object here

				lormtestEmployee.setName("Mr P Smith");
				lormtestEmployee.setAddress("Old bawn Tallaght D24");
				lormtestEmployee.setPps("2131D" + Integer.toString(i*3));
				lormtestEmployee.save();
			}			
		
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateOrmweek10Data createOrmweek10Data = new CreateOrmweek10Data();
			try {
				createOrmweek10Data.createTestData();
			}
			finally {
				ormtest.Ormweek10PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
