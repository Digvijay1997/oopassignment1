/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w17oopassignment1;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Digvijay
 */
// instance variables
public class Course {
    private DayOfWeek dayOfClass;
    private Instructor instructor;
    private String courseCode;
    private String courseName;
    private String description;
    private String room;
    private int totalTime;
    private int maxNumberOfStudents;
    private LocalTime startTime;
    // array list
    private ArrayList<Student> students = new ArrayList();
       
            
    // constructor
    public Course(String courseCode,String courseName,String description,String room,Instructor instructor,DayOfWeek dayOfClass,
            LocalTime startTime,int totalTime,int maxNumberOfStudents)
    {
        setCourseCode(courseCode);
        setCourseName(courseName);
        setDescription(description);
        setRoom(room);
        setProf(instructor);
        setDayOfClass(dayOfClass);
        setStartTime(startTime);
        setTotalTime(totalTime);
        setMaxNumberOfStudents(maxNumberOfStudents);
        
    }
    public void setTotalTime(int totalTime){
        this.totalTime = totalTime;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRoom(String room) {
        this.room = room;
    }
     
    public void setStartTime(LocalTime startTime)
    {
        
        if(startTime.getHour() >7 && startTime.getHour() <19)
        {
            this.startTime = startTime;
        }
        else
            throw new IllegalArgumentException("Not valid ");
    }
    
    public void setDayOfClass(DayOfWeek dayOfClass)
    {
        this.dayOfClass = dayOfClass;
    }
    public String getCourseCode()
    {
        return courseCode;
    }
    
    public String getCourseName()
    {
        return courseName;
    }
    
    public DayOfWeek getDayOfClass()
    {
        return dayOfClass;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public String toString()
   {
       String string;
       return string = (getCourseName() + " " + getCourseCode());
   }
    
    public int getDuration()
    {
        return totalTime;
    }
    
    public int getMaxNumberOfStudents()
    {
        return maxNumberOfStudents;
    }
       
    public void setProf(Instructor instructor)
    {
        if(instructor.canTeach(courseCode) == true)
        {
            this.instructor = instructor;
        }
        else
            throw new IllegalArgumentException("Not valid");
    }
    
    public int getNumberOfStudentsEnrolled()
    {
        return students.size();
    }
    
    public Instructor getProf()
    {
        return instructor;
    }
    
    public String getRoom()
    {
        return room;
    }
    
        public void setMaxNumberOfStudents(int maxNumberOfStudents)
    {
        if(maxNumberOfStudents > 9 && maxNumberOfStudents < 51)
        {
            this.maxNumberOfStudents = maxNumberOfStudents;
        }
        else
            throw new IllegalArgumentException("Not valid.");
    }
        
    public LocalTime getStartTime()
    {
        return startTime;
    }
    
    public ArrayList<Student> getStudents()
    {
        return students;
    }
    
    public void addStudent(Student student) throws InvalidStudentException
    {
        if(student.inGoodStanding() == true)
        {
           students.add(student);
        }
        else
            throw new InvalidStudentException();
    }

}
