import java.util.*;
public class local extends smallCity
{
	private String Local;
	private int id;
	Scanner input = new Scanner (System.in);

	public local()
	{
		this.setLocal("Null");
		this.id = 0;
	}

	public local(int id ,String Local,String Name,long phone , String address, String gender)
	{
		super();
		
		this.setLocal(Local);
		this.setId(id);
		

	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public void setLocal(String Local)
	{
		this.Local = Local;
	}
	public String getLocal()
	{
		return Local;
	}

	public void display()
	{
		System.out.print("\t :"+ getId());
		System.out.println(" \t" + getLocal());
		
	}


	public void info()
	{
		System.out.println("\tFAcilities FOr Local Persons "+"\n"+ "Select One Of The Following Options"+ "\n" +"\t\tOptions : "
			+"\n" +"\t1) House Service"+ "\n"+"\t2) Job Facilities");
		System.out.println(" Eneter The Package");
		int opt = input.nextInt();
		if (opt == 1) {
			System.out.println("\t"+">House Services : ");
			System.out.println("\t"+">Reduce 15% Taxes");
			System.out.println("\t"+">Free Scurity ");
			System.out.println("\t"+">24 Hours Medical Treatments ");
			
			
		} else if (opt == 2) {
		System.out.println("Job FAcilities");	
		System.out.println("\t\t"+">\tHigh Pay All Around The World ");
		System.out.println("\t\t"+">\tfree Car + Free Home Facilities");
		System.out.println("\t\t"+">\tfamily Ficilites + 15% Extra Family Support");
			
		}


	
	}
	
}