package firstproject;

public class Calculator1 {

	 //Task 1
	  int add(int no1,int no2)
	  {
		  int res=no1+no2;
		  
		  return res;
	  }
	  
	  //Task 2

	  
	  void avg(int no1,int no2)
	  {
		  //int res=(no1+no2)/2;
		  
		  Calculator1 c1=new Calculator1();
		             int  sum =c1.add(no1, no2);
		             int avg=sum/2;
		  System.out.println("the avg is :"+avg);
	  }
	  
	  
	  public static void main(String[] args) {
		Calculator1 c1=new Calculator1();
		
		c1.add(10, 12);
		
		c1.avg(10, 20);
	}
}
