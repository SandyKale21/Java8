package com.citi.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaGroupingBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Adddress  add1 = new Adddress("pune1");
		Adddress  add2 = new Adddress("pune1");

		Adddress  add3 = new Adddress("pune2");
		Adddress  add4 = new Adddress("pune3");

		Perso p1 = new Perso("P1",add1);
		Perso p2 = new Perso("P2",add2);

		Perso p3 = new Perso("P3",add3);
		Perso p4 = new Perso("P4",add4);

		List<Perso> list = new ArrayList<Perso>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		
	list.stream().map(x -> new AbstractMap.SimpleEntry<>(x, x.)));

	//System.out.print(	 list.stream().collect(Collectors.groupingBy(x -> x.)));
	
	}

	@Override
	public String toString() {
		return "JavaGroupingBy []";
	}

}


class Perso{
	
	@Override
	public String toString() {
		return "Perso [name=" + name + ", add=" + add + "]";
	}

	String name;
	Adddress add;
	
	Perso(String name, Adddress add){
		this.name = name;
		this.add=add;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Adddress getAdd() {
		return add;
	}

	public void setAdd(Adddress add) {
		this.add = add;
	}
}

class Adddress{
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
	
	Adddress(String city){
		this.city=city;
	}
}