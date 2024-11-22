package com.tka.objexamples;

public class TestObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cctv c1 = new Cctv();
		System.out.println(c1.brand);
		c1.turnOn();
		System.out.println("............");
		
		
		Tower t1 = new Tower();
		System.out.println(t1.cname);
		
		t1.activate(1234);
		
		System.out.println("............");
		
		
		
		Mall m1 = new Mall();
		m1.loc="Baner";
		System.out.println("Location:"+m1.loc);
		String s=m1.getDetails();
		System.out.println("name of mall:"+s);
		System.out.println("............");
		
		
		Vehicle v1 = new Vehicle();
		v1.name="Ertiga";
		System.out.println("name car:"+v1.name);
		v1.start_engine();
		System.out.println("............");
		
		
		Dog d1 = new Dog();
		
		d1.name="Tuffy";
		System.out.println(d1.name);
		d1.makeSound();
		System.out.println("............");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
