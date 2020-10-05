package com.hackthon;

import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

	 /*	
	    *   Class Constructor
	    *   
	    *   @param firstName - A string denoting the Person's first name.
	    *   @param lastName - A string denoting the Person's last name.
	    *   @param id - An integer denoting the Person's ID number.
	    *   @param scores - An array of integers denoting the Person's test scores.
	    */
	public Student(String firstName, String lastName, int identification,int [] testScores) {
		super(firstName, lastName, identification);
		this.testScores=testScores;
	}

	 /*	
	    *   Method Name: calculate
	    *   @return A character denoting the grade.
	    */
	public char calculate() {
		char grade='F';
		int percentage = 0;
		for(int i=0;i<testScores.length;i++) {
			percentage+=testScores[i];
		}
		percentage/=testScores.length;
		if(percentage>=90 && percentage<=100)
			grade = 'O';
		else if(percentage>=80 && percentage<90)
			grade = 'E';
		else if(percentage>=70 && percentage<80)
			grade = 'A';
		else if(percentage>=55 && percentage<70)
			grade = 'P';
		else if(percentage>=40 && percentage<55)
			grade = 'D';
		else if(percentage<40)
			grade = 'T';
			
		
		return grade;
	}
	
}

class Day_12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}