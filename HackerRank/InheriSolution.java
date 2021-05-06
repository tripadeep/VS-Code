package HackerRank;

import java.util.*;

import javax.lang.model.util.ElementScanner6;

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
    // Write your constructor here
    Student(String firstName,String lastName, int identification,int[] testScores){
        super(firstName, lastName, identification);
        this.testScores=testScores;   
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate(){
        int abg=0,sum=0;
        for(int i=0;i<testScores.length;i++){
           
            sum=sum+testScores[i];
        }
        abg=sum/testScores.length;
        if(abg>=90&& abg<=100) return 'O';
        else if(abg>=80&& abg<90) return 'E';
        else if(abg>=70&& abg<80) return 'A';
        else if(abg>=55&& abg<70) return 'P';
        else if(abg>=40&& abg<55) return 'D';
        else return 'T';

    } 
}

class InheriSolution {
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
        List <Integer>l=new ArrayList<Integer>();
        Integer [] arr=  l.toArray(new Integer[l.size()]);
        


	}
}