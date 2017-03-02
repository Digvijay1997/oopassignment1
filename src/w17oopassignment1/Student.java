/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.date;  
package w17oopassignment1;

/**
 *
 * @author Digvijay Singh
 */

class Student extends Person
{
	int student_number;
	boolean good_standing;
	LocalDate year_enrolled;
        String major;
	
		
	public Student(String first_name, String last_name, String street_address, String city, String province, String postal_code, LocalDate birthdate, 
	                  String major, int student_number, LocalDate year_enrolled)
	{
	
	    super(first_name, last_name, street_address, city, province, postal_code, birthdate);
        
            this.major = major;
            setStudentNumber(student_number);
            this.year_enrolled = year_enrolled;
            this.good_standing = true;
			
	}
	
	
	 public void setStudentNumber(int student_number)
    {
        if(student_number > 0)
        {
            this.student_number = student_number;
        }
        else
            throw new IllegalArgumentException("Student Number must be valid.");
    }
    
    
    
   public int getYearEnrolled()
   {
       return year_enrolled.getYear();
   }
   
  
   public boolean inGoodStanding()
   {
       return good_standing;
   }
   
   public boolean reinstateStudent()
   {
       return good_standing = true;
   }
   
   public boolean suspendStudent()
   {
       return good_standing = false;
   }
   
    
	
}