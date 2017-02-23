/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w17oopassignment1;
/**
 *
 * @author Digvijay Singh
 */
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    String firstName;
    String lastName;
    String streetAddress;
    String city;
    String province;
    String postalCode;
    LocalDate birthdate;
    String regex = "^[A-Za-z][0-9][A-Za-z][0-9][A-Za-z][0-9]$";
    Pattern pattern = Pattern.compile(regex);

    public Person(String firstName, String lastName, String streetAddress, String city, String province, String postalCode, LocalDate birthdate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.province = province;
        setPostalCode(postalCode);
        this.birthdate = birthdate;
    }

    public void setFirstname(String first_name) {
        this.first_name = first_name;
    }

    public void setLastname(String last_name) {
        this.last_name = last_name;

    }

    public void setStreet(String street_address) {
        this.street_address = street_address;
    }

    public void setCity(String city) {
        this.city = city;

    }

    public void setProvince(String province) {
        this.province = province;

    }

    public void setPostalCode(String postal_code) {
         Matcher matcher = pattern.matcher(postal_code);
        if (postal_code.length() == 6) {
            if(matcher.matches()) {
                this.postal_code = postal_code;
            }else{
                throw new IllegalArgumentException("Invalid postal code");
            }
        } else {
            throw new IllegalArgumentException("Invalid postal code,length must be 6");
        }
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

  
	
	 public String getFirstName()
	 {
		 return first_name;
	 }
	 public String getLastName()
	 {
		 return last_name;
	 }
        
			 
    public String getStreetAddress() {
        return street_address;
    }

    public String getCity() {
        return city;

    }

    public String getProvince() {
        return province;

    }

    public String getPostalcode() {
               return postal_code;
    }
public String getPostalCode() {
               return postal_code;
    }
public LocalDate getBirthdate() {
        return birthdate;
    }
    
}