package w17oopassignment1;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Digvijay
 */


public class Person{
//instance variable
	private String firstName, lastName, street, city, province, postalCode;
	LocalDate dateOfBirth;
// constructor
	public Person(String firstName, String lastName, String street, String city, String province, String postalCode, LocalDate dateOfBirth)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.street=street;
		this.city=city;
		this.province=province;
		setPostalCode(postalCode);
		this.dateOfBirth=dateOfBirth;
	}
	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}
	public String getStreetAddress() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) throws IllegalArgumentException{
		if(postalCode.length()!=6)
			throw new IllegalArgumentException();
		char postal[]=postalCode.toCharArray();
		postalCode=postalCode.toUpperCase();
		for(int i=0;i<6;i++)
		{
			
			if(i%2==0)
			{	
				if(postal[i]>='A' && postal[i]<='Z')
					continue;
				else
					throw new IllegalArgumentException();
			}
			else
			{
				if(postal[i]>='0' && postal[i]<='9')
					continue;
				else
					throw new IllegalArgumentException();	
			}
		}
		this.postalCode = postalCode;
	}
	public LocalDate getBirthdate() {
		return dateOfBirth;
	}
	public void setBirthdate(LocalDate dob)
        {
            LocalDate today = LocalDate.now();
            int age = Period.between(dob, today).getYears();

            if (age >= 14 && age <= 90)
                dateOfBirth = dob;
            else
                throw new IllegalArgumentException("Student must be between 14-90 ");
        }
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
        public int getYearBorn(){
            return dateOfBirth.getYear();
        }
        
	public int getAge()
	{
		LocalDate today =LocalDate.now();
		Period period = Period.between(dateOfBirth, today);
		return period.getYears();
        
	}
	public void changeAddress(String street, String city, String province, String postalCode)
	{
		this.street=street;
		this.city=city;
		this.province=province;
		setPostalCode(postalCode);
	}
	public String getFullAddress()
	{
		return street+", "+city+", "+province+", "+postalCode;
	}
	public String toString()
	{
		return firstName+" "+lastName;
	}
	
}