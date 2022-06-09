package com.bridgelabz.addressbook;


public class Addressbook {

	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	String zip;
	String phoneNumber;
	
	
	public Addressbook(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addressbook aa =new Addressbook("Manju", "Karigar", "Karugri", "City", "Karnatak", "12", "12346789");
		
		
		aa.firstName="Manju";
		aa.lastName="Karigar";
		aa.address="Harugeri";
		aa.city="Belagavi";
		aa.state="Karnatak";
		aa.zip="11";
		aa.phoneNumber="123456789";
		
		
		System.out.println(aa.firstName+" "+aa.lastName +" "+aa.address+" "+aa.city+" "+aa.state+ " "+aa.zip+" "+ aa.phoneNumber);
		
	}

}
