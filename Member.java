public class Member{
	
	private String name;
	private String address;
	private float balance;
	private char gender;
	
	public Member () {
		this.name ="Unknown";
		this.address ="somewhere";
		this.balance = 0;
		this.gender = 'n';
	}	
	public Member(String name){
		
		this.name=name;
		this.address="somewhere";
		this.balance=0;
		this.gender='n';
	}
	
	public Member(String name, String address, float balance, char gender){
		
		this.name=name;
		this.address=address;
		this.balance=balance;
		this.gender=gender;
		
	}
	
	public String getName(){
		
		return name;
	}
	
	public String getAddress(){
		
		return address;
	}
	
	public float getBalance(){
		
		return balance;
	}
	
	public char getGender(){
		
		return gender;
	}
	
	public void setName(String name){
		
		this.name=name;
	}
	
	public void setAddress(String address){
		
		this.address=address;
	}
	
	public void setBalance(float balance){
		
		this.balance=balance;
	}
	
	public void setGender(char gender){
		
		this.gender=gender;
	}
	
	public String toString(){
		
		return String.format("Name: %s\nAddress: %s\nBalance: %d\nGender: %c\n"
			,name,address,balance,gender);
	}
	
	
		
		
		
	}
	
	