/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w17oopassignment1;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Digvijay Singh
 */


public class Instructor extends Person
{
	int employee_number;
	LocalDate hire_date;
    private ArrayList<String> teachableCourses  = new ArrayList<>();	
   
	
	
	public Instructor(String first_name, String last_name, String street_address, String city, String province, String postal_code, String birthdate, 
					int employee_number, LocalDate hire_date
	                  )
	{
	
            super( first_name,  last_name,  street_address,  city,  province,  postal_code,  birthdate);
            setEmployeeNumber(employee_number);
            setHireDate(hire_date);
            
		
			
	}
	
	
	public void addTeachableCourse(String[] teachable_course_code)
	{
		
	}
	
        public void setEmployeeNumber(int employee_number)
        {
            this.employee_number = employee_number;
        }
	public void canTeach()
	{
		
	}
	
	public void getYearCollege()
	{
		
	}
	
	public void listofSubjecttoTech()
	{
		
	}
	
	public void addCoursetoability()
	{
		
	}
	
	public void setBirthday()
	{
		
	}
	
	public void setHireDate(LocalDate hire_date)
	{
            this.hire_date = hire_date;
	}
}
