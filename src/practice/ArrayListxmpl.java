package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayListxmpl {

	private static Person person = null;
	private static String name;
	private static String address;
	private static int age;
	private static int contact;
	private static int num;
	static ArrayList<Person> arrList;
	
	public static void insert(Person person) {
		arrList.add(person);
	}
	
	public static void update(ArrayList<Person> list) {
		Person per = new Person();
		for(int i=0; i<list.size();i++)
		{
			if(list.get(i).getName().equals("Hassam")) {
				list.set(i, per);
			}
		}
		ArrayList<Person> temp = new ArrayList<>();
		temp = list;
		list.clear();
		temp.addAll(list);
	}
	
	public static void remove() {
		
		
	}
	
	public static void display() {
		Iterator<Person> itr = arrList.iterator();
		System.out.println("ArrayList Size: "+arrList.size());
		while (itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of persons you want to input: ");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
		arrList = new ArrayList<Person>();
		for(int i = 0; i < num; i++)
		{
			Person per = new Person();
			System.out.println("Enter name of person: ");	
			name = scan.next();
			per.setName(name);
			
			System.out.println("Enter address of person: ");
			String address = scan.next();
			per.setAddress(address);
			
			System.out.println("Enter age of person: ");
			age = scan.nextInt();
			per.setAge(age);
			
			System.out.println("Enter contact of person: ");
			contact = scan.nextInt();
			per.setContact(contact);
			
			insert(per);
		}
		display();
	}

}

class Person{
	private int age;
	private String name;
	private String address;
	private int contact;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	
	@Override
	public String toString() {
		return ("Name: " + this.getName() + ", Age: " + this.getAge() + ", Address: " + this.getAddress() + ", Contact: " + this.getContact());
		
	}
}
