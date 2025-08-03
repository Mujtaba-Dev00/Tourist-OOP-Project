public class smallCity
{
	private String Name;
	private long phone;
	private String address;
	private String gender;


	public smallCity()
	{
		this.setName("Null");
		this.setaddress ("Null");
		this.setgender("Null");
		this.phone = 0;
	} // Default Constructor


	public smallCity(String Name,long phone , String address, String gender)
	{
		this.Name = Name;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
	} // Overloded Constructor

	//Setter Start
   public void setName(String Name)
	{
		this.Name = Name;
	}
	public void setPhone(long phone)
	{
		this.phone = phone;
	}
	public void setaddress ( String address)
	{
		this.address = address;
	}
	public void setgender (String gender)
	{
		this.gender = gender;
	} //Setter ENd
	//Getter Start

	public String getName()
	{
		return Name;
	}
	public long getphone()
	{
		return phone;
	}
	public String getaddress()
	{
		return address;
	}
	public String getgender()
	{
		return gender;
	}
	//Getter End
	public void  display()
	{
		System.out.println("My Name Is  :\n\t>"+ getName());
		System.out.println("My gender Is :\n\t>"+ getgender());
		System.out.println("My Address Is :\n\t>"+getaddress());
		System.out.println("My Phone Number Is :\n\t>"+ getphone());

	}




}