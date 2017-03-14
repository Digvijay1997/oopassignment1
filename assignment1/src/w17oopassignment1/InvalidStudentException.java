/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package w17oopassignment1;
/**
 *
 * @author Digvijay
 */

public class InvalidStudentException extends Exception
{
        @Override
	public String getMessage()
	{
		return "Invalid Student!";
	}
}