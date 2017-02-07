
/*
Cinema.java
@ author Yo
7 Feb 2017
create an application called Cinema
you can buy the following tickets:

student 12
oap 10
child 7
adult 15
*/

import java.util.*;
public class Cinema{
	public static void main(String args[]){

	int student=12;
	int oldAgePensioner=10;
	int child=7;
	int adult=15;
	int numOfStudent=0;
	int numOfoldAgePensioner=0;
	int numOfChild=0;
	int numOfAdult=0;
	int sum=0;

	Scanner keyboard;
	keyboard=new Scanner(System.in);

	System.out.println("How many students?");
	numOfStudent=keyboard.nextInt();
	System.out.println("How many Pensioner?");
	numOfoldAgePensioner=keyboard.nextInt();
	System.out.println("How many child?");
	numOfChild=keyboard.nextInt();
	System.out.println("How many adult?");
	numOfAdult=keyboard.nextInt();

	sum=(student*numOfStudent)+(oldAgePensioner*numOfoldAgePensioner)+(child*numOfChild)+(adult*numOfAdult);

	System.out.println("The total price is "+ sum);








}
}