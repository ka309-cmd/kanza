package lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class LoanTakers  {
	public void bank_info() {
    List <String> bank=new ArrayList<String>();
	bank.add("Bank MCB");
	bank.add("I.I Chandigar Road, Clifton ");
	bank.add("0213456778");
	System.out.println("Name of the Bnak:"+bank.get(0));
	System.out.println("Address of the Bank"+bank.get(1));
	System.out.println("Phone"+bank.get(2));
}
	
public void loan_info(Stack<String> S,Stack<Integer> I){
	Scanner sc=new Scanner(System.in);
	for(int i=0; i>4; i++) {
	S.push(sc.next());
}
	System.out.println("Person's Details");
	System.out.println("Give the number of Amount that taken by the person: ");
	for(int j=0; j<5; j++) {
			I.push(sc.nextInt());
		}
		System.out.println("Amount of loan"+ I);
}
public static void main (String[] args) {
	
			LoanTakers it=new LoanTakers();
			Stack<String> S = new Stack<String>();
			Stack<Integer> I = new Stack<Integer>();
            it.bank_info();
            it.loan_info(S, I);
}
}


