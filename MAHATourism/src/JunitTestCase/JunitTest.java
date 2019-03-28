  package JunitTestCase;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import CustomerEntity.Customer;
import Repository.CustomerDAO;

public class JunitTest {

	Customer c;
	CustomerDAO cc;
	
	@Before
	public void setUp() throws Exception {
		c=new Customer();
		cc=new CustomerDAO();
	}
	

	@Test
	public void saveTest() throws ClassNotFoundException, SQLException, IOException
	{
		c.setFirst_name("Amru");
		c.setLast_name("Khan");
		c.setEmail_id("Bilalkhan@gmail.com");
		c.setMobile_number("9876543210");
		c.setCountry("India");
		c.setState("Maharashtra");
		c.setCity("Mumbai");
		c.setUser_name("Bilal");
		c.setPassword("khan");
		int y=cc.save(c);
		System.out.println("Data inserted");
		assertEquals(1, y);
	}
	@Ignore
	public void deleteTest()
	{
		c.setId(5);
		int y=cc.delete(c.getId());
		System.out.println("Data deleted");
		assertEquals(1, y);
	}
	@Ignore
	public void updateTest() throws ClassNotFoundException, SQLException, IOException
	{
		c.setId(20);
		c.setFirst_name("Bakhteyar");
		c.setLast_name("Khan");
		c.setEmail_id("bakhteyarkhan@gmail.com");
		c.setMobile_number("9876543210");
		c.setCountry("India");
		c.setState("Maharashtra");
		c.setCity("Mumbai");
		c.setUser_name("Bakhteyar");
		c.setPassword("khan");
		int y=cc.update(c);
		System.out.println("Data Updated");
		assertEquals(1, y);		
	}
	
}
