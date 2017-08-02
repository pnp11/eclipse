package com.horstmann.corejava;

//Klasy znajdujace sie w tym pliku naleza do powyzszego pakietu

import java.util.*;

//Instrukcje import nastepuja po instrukcji package

/**
 * 
 * @author epiotno
 *
 */
public class Employee {
	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee(String n, double s, int year, int month, int day)
	{
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		//W klasie GregorianCalendar styczen ma numer 0
		hireDay = calendar.getTime();
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public Date getHireDay()
	{
		return hireDay;
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}
