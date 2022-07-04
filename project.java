package p1;

import java.util.*;


abstract class hsptl
{
	int id;
	String name;
	int roomno;
	String spec;
	int ph;
	String place;
	
	hsptl()
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter ID :");
		id=sc.nextInt();
		System.out.print("\n Enter name :");
		name=sc.next();
		System.out.print("\n Enter roomno :");
		roomno=sc.nextInt();			
		
	}
	public void display(){
		System.out.println("Doctor Details");
		System.out.println("ID: "+id+ "name: "+name+"roomno: "+roomno+"Specialization: "+spec);
		System.out.println("Patient Details");
		System.out.println("ID: "+id+ "name: "+name+"roomno: "+roomno+"Place: "+place+"Phn no: "+ph);
	}
	
}
class doc extends hsptl
{
	public doc() {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter Specialization : ");
		spec=sc.nextLine();
	
}

class pat extends hsptl
{
	public pat() {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Place : ");
		place=sc.nextLine();
		System.out.print("\n Phn no : ");
		ph=sc.nextInt();
				
	}
	

}



public class project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch1=0, ch2=0 , ch3=0;
		
		LinkedList<hsptl> list = new LinkedList<hsptl>();
		do 
		{
			System.out.println("*******************");
			System.out.println("1. Create");
			System.out.println("2. Display");
			System.out.println("3. Exit");
			System.out.println("*******************");
			System.out.println("Enter your choice: ");
			Scanner sc1=new Scanner(System.in);
			ch1=sc1.nextInt();
			
			if (ch1==1) {
				do {
					System.out.println("*******************");
					System.out.println("1. Doctor details");
					System.out.println("2. Patient details");
					System.out.println("3. Exit");
					System.out.println("*******************");
					System.out.println("Enter your choice: ");
					
					Scanner sc2=new Scanner(System.in);
					ch2=sc2.nextInt();
					
					switch (ch2) 
					{
					case 1: 
						list.add(new doc());
						break;
						
					case 2:
						list.add(new pat());
						break;
					
					}
				}while (ch2!=3);
			}
			if (ch1==2) 
			{			
					hsptl a=new doc();
					a.display();
							
				
			}
					
		}while (ch1!=3);
		

	}
	

}
}
