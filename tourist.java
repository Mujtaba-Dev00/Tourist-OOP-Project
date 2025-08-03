public class tourist extends smallCity
{
	private String Tourist;
	private String Country;
	private int passport;

	public tourist()
	{
		this.setTourist("Null");
		this.setCountry("Null");
		this.passport = 0;
	}

	public tourist(String Tourist,String Country,int passport)
	{
		this.Tourist  = Tourist;
		this.Country = Country;
		this.passport = passport;
	}

	
	public void setTourist(String Tourist)
	{
		this.Tourist = Tourist;
	}
	public void setCountry(String Country)
	{
		this.Country = Country;
	}
	public void setpassport(int passport)
	{
		this.passport = passport;
	}

	public String getTourist()
	{
		return Tourist;
	}
	public String getCountry()
	{
		return Country;
	}
	public int getpassport()
	{
		return passport;
	}
	public void display()
	{
		System.out.println("\t\t I Am Tourist " + getTourist());
		System.out.println("\t\t I Lived In :"+getCountry());
		System.out.println("\t\t My Passport Number Is :"+getpassport());
		System.out.println("\t\t\n                          Confirm Verification :");
	}
}