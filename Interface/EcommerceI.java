package com.tka.interfaces;

public interface EcommerceI {
	
	void mens();
	void mobile();
	void cart();
	void payement();
	void wishlist();
	

}

class Ecommerce implements EcommerceI{
	
	public void mens() {
		System.out.println("Mens");
		
	}
	public void mobile() {
		System.out.println("Mobile");
	}
	public void cart() {
		System.out.println("Cart details");
	}
	public void payement() {
		System.out.println("Payment modes");
	}
	public void wishlist() {
		System.out.println("your wishlists");
		
	}
	
	
}

