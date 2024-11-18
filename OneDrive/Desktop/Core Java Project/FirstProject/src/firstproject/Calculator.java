package firstproject;

public class Calculator {
	
	int mrp;
	String cname;
	
	 //Task 1
	  int add(int no1,int no2)
	  {
		  int res=no1+no2;
		  System.out.println("The addition is :"+res);
		  
		  return res;
	  }
	  
	  //Task 2
	  
	  int avg(int no1,int no2)
	  {
		  
		  Calculator c1=new Calculator();
		 int res= c1.add(no1,no2)/2;
		  System.out.println("the avg is :"+res);
		  return res;
	  }
	  
	  
	  //Task 3
	  
	  void discount(int no1,int no2)
	  {
		  Calculator c1=new Calculator();
			 int dis= (c1.avg(no1,no2))*10/100;
			  System.out.println("the discount is :"+dis);
	  }
	  
	  
	  public static void main(String[] args) {
		Calculator c1=new Calculator();
		c1.avg(100,100);
		c1.discount(50, 50);
		
		
		
	}	
	
	

}


