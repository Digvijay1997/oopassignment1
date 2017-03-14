package w17oopassignment1;

import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author Digvijay
 */

public class Student extends Person{
 // instance varaible
	private String major;
	private LocalDate enrollmentDate;
	private int studentNumber;
	private boolean goodStanding;
	//constructor
	public Student(String firstName, String lastName, String streetAddress, String city, String province, String postalCode, LocalDate birthday, String major, int studentNumber, LocalDate enrollmentDate)
	{
		super(firstName, lastName, streetAddress, city, province, postalCode, birthday);
		this.major=major;
		setStudentNumber(studentNumber);
		this.enrollmentDate=enrollmentDate;
                goodStanding = true;
	}

        @Override
        public void setBirthdate(LocalDate dob)
        {
            LocalDate today = LocalDate.now();
            int age = Period.between(dob, today).getYears();

            if (age >= 14 && age <= 90)
                super.setBirthdate(dob);
            else
                throw new IllegalArgumentException("Student must be between 14-90 ");
        }
	@Override
	public String toString()
	{
		return super.toString()+", student number is "+studentNumber;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public LocalDate getEnrollmentDate() {
		return enrollmentDate;
	}
	public void setEnrollmentDate(LocalDate enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) throws IllegalArgumentException {
		if(studentNumber<=0)
			throw new IllegalArgumentException();
		this.studentNumber = studentNumber;
	}
	public boolean inGoodStanding() {
		return goodStanding;
	}
	public void reinstateStudent() {
		this.goodStanding= true;
	}

	public void suspendStudent() {
		this.goodStanding= false;
	}

	public int getYearEnrolled()
	{
		return enrollmentDate.getYear();
	}
	public int getYearsAtCollege()
	{
		return LocalDate.now().getYear()-enrollmentDate.getYear();
	}
}