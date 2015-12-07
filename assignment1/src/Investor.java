import java.util.Random;

public class Investor {
	private double budget;
	private String agentID = "";
	
	public Investor() 
	{	
		setRandomAgentID();
		
		double x = setUpRandomBudget();
		setBudget(x);
	}

	private void setRandomAgentID() {
		for(int i = 0; i <=5; i++)
		{
			Random r = new Random();
			int l = r.nextInt(10) + 1;
			agentID = agentID + generateLetter(l);
		}
	}

	private double setUpRandomBudget() {
		Random r = new Random();
		double budget = r.nextDouble() * 100000.00;
		return budget;
	}
	
	public static String generateLetter(int n)
	{
		
		String l = "";
		if(n == 1)
		{
			l = "0";
		}
		else if(n == 2)
		{
			l = "1";
		}
		else if(n == 3)
		{
			l = "2";
		}
		else if(n == 4)
		{
			l = "3";
		}
		else if(n == 5)
		{
			l = "4";
		}
		else if(n == 6)
		{
			l = "5";
		}
		else if(n == 7)
		{
			l = "6";
		}
		else if(n == 8)
		{
			l = "7";
		}
		else if(n == 9)
		{
			l = "8";
		}
		else if(n == 10)
		{
			l = "9";
		}
		return l;
	}
	
	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}
	
	public String getAgentID() {
		return agentID;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}
}
