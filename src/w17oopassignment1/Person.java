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
    String first_name;
    String last_name;
    String street_address;
    String city;
    String province;
    String postal_code;
    LocalDate birthdate;
    String regex = "^[A-Za-z][0-9][A-Za-z][0-9][A-Za-z][0-9]$";
    Pattern pattern = Pattern.compile(regex);

    public Person(String first_name, String last_name, String street_address, String city, String province, String postal_code, LocalDate birthdate) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.street_address = street_address;
        this.city = city;
        this.province = province;
        isValidPostalCode(postal_code);
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

    public void setPostalcode(String postal_code) {
        isValidPostalCode(postal_code);
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    private void isValidPostalCode(String postal_code) {
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