package com.citi.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Map<String,List<P> > personsByGenderAndDobMonth//
        = P.persons()//
            .stream()//
            .collect(Collectors.groupingBy(
                p1 -> p1.getAdd().getCity(),Collectors.toList()));

    System.out.println(personsByGenderAndDobMonth);

  }//  w w w .  jav  a  2s.c om

@Override
public String toString() {
	return "Main []";
}
}

class P {
  // An enum to represent the gender of a person
  public static enum Gender {
    MALE, FEMALE
  }

  private long id;
  private String name;
  private Gender gender;
  private LocalDate dob;
  private double income;
  private Address add;

  public P(long id, String name, Gender gender, LocalDate dob, double income,Address add) {
    this.id = id;
    this.name = name;
    this.gender = gender;
    this.dob = dob;
    this.income = income;
    this.add =add;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Gender getGender() {
    return gender;
  }

  public boolean isMale() {
    return this.gender == Gender.MALE;
  }

  public boolean isFemale() {
    return this.gender == Gender.FEMALE;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public LocalDate getDob() {
    return dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public double getIncome() {
    return income;
  }

  public void setIncome(double income) {
    this.income = income;
  }

  public static List<P> persons() {
	  
	  Address  add1 = new Address("pune1");
		Address  add2 = new Address("pune1");

		Address  add3 = new Address("pune2");
		Address  add4 = new Address("pune3");

    P ken = new P(1, "Java", Gender.MALE, LocalDate.of(1970, Month.MAY, 4), 6020.0,add1);
    P jeff = new P(2, "Jack", Gender.MALE, LocalDate.of(1970, Month.JULY, 15), 7320.0,add2);
    P donna = new P(3, "Javascript", Gender.FEMALE, LocalDate.of(1972, Month.JULY, 29), 8720.0,add1);
    P chris = new P(4, "XML", Gender.MALE, LocalDate.of(1993, Month.DECEMBER, 16), 5800.0,add3);
    P laynie = new P(5, "Json", Gender.FEMALE, LocalDate.of(2002, Month.DECEMBER, 13), 0.0,add3);
    P lee = new P(6, "Database", Gender.MALE, LocalDate.of(2011, Month.MAY, 9), 2400.0,add2);

    // Create a list of persons
    List<P> persons = Arrays.asList(ken, jeff, donna, chris, laynie, lee);

    return persons;
  }

public Address getAdd() {
	return add;
}

public void setAdd(Address add) {
	this.add = add;
}
  
  

}


class Address{
	@Override
	public String toString() {
		return "Adddress [city=" + city + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	String city;
	
	Address(String city){
		this.city=city;
	}
}