/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w17oopassignment1;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

/**
 *@author Digvijay
 */
public class Instructor extends Person
{
    
    // Instance variables
    private int employeeNumber;
    private LocalDate hireDate;
    private ArrayList<String> teachableCourses  = new ArrayList<>();
    // constructor
    public Instructor(String firstName, String lastName, String streetAddress, String city, String province, String postalCode, LocalDate birthdate, int employeeNumber, LocalDate hireDate) 
    {
        super(firstName, lastName, streetAddress, city, province, postalCode, birthdate);
        
        setEmployeeNumber(employeeNumber);
        setHireDate(hireDate);
        
    }
    
    public void setHireDate(LocalDate hireDate)
    {
        LocalDate today = LocalDate.now();
        int years = Period.between(hireDate, today).getYears();
        int now = LocalDate.now().getYear();
        if(years < 81 && hireDate.isBefore(today) == true )
        {
            this.hireDate = hireDate;
        }
        else
            throw new IllegalArgumentException("Hire Date not valid");
        
    }
    
    public void setEmployeeNumber(int employeeNumber)
    {
        if(employeeNumber > 0)
        {
            this.employeeNumber = employeeNumber;
        }
        else
            throw new IllegalArgumentException("Not valid");
    }
    
    public void setBirthday(LocalDate dob)
    {
        LocalDate today = LocalDate.now();
        int age = Period.between(dob, today).getYears();
        
        if (age >= 18 && age <= 100)
            super.setBirthdate(dob);
        else
            throw new IllegalArgumentException("Age not valid");
    }
    
    public boolean canTeach(String courseCode)
    {
        if(teachableCourses.contains(courseCode.toUpperCase()) == true)
        {
            return true;
        }
        
        else{
            return false;
        }
            
    }

    public void addTeachableCourse(String courseCode)
    {
        teachableCourses.add(courseCode.toUpperCase());
    }
    
    public int getYearsAtCollege()
    {
        LocalDate now = LocalDate.now();
        int years = Period.between(hireDate, now).getYears();
        return years;
    }
    
    public String listOfSubjectsCertifiedToTeach()
    {
        return teachableCourses.toString();
    }

    public int getEmployeeNum()
    {
        return employeeNumber;
    }

    public LocalDate getHireDate()
    {
        return hireDate;
    }

    public ArrayList<String> getTeachableCourses()
    {
        return teachableCourses;
    }
}
    
    
    