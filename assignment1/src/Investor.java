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
			int l = r.nextInt(26) + 1;
			agentID = agentID + generateLetter(l);
		}
	}

	private double setUpRandomBudget() {
		Random r = new Random();
		double budget = r.nextDouble() * 10000.00;
		return budget;
	}
	
	public static String generateLetter(int n)
	{
		
		String l = "";
		if(n == 1)
		{
			l = "A";
		}
		else if(n == 2)
		{
			l = "B";
		}
		else if(n == 3)
		{
			l = "C";
		}
		else if(n == 4)
		{
			l = "D";
		}
		else if(n == 5)
		{
			l = "E";
		}
		else if(n == 6)
		{
			l = "F";
		}
		else if(n == 7)
		{
			l = "G";
		}
		else if(n == 8)
		{
			l = "H";
		}
		else if(n == 9)
		{
			l = "I";
		}
		else if(n == 10)
		{
			l = "J";
		}
		else if(n == 11)
		{
			l = "K";
		}
		else if(n == 12)
		{
			l = "L";
		}
		else if(n == 13)
		{
			l = "M";
		}
		else if(n == 14)
		{
			l = "N";
		}
		else if(n == 15)
		{
			l = "O";
		}
		else if(n == 16)
		{
			l = "P";
		}
		else if(n == 17)
		{
			l = "Q";
		}
		else if(n == 18)
		{
			l = "R";
		}
		else if(n == 19)
		{
			l = "S";
		}
		else if(n == 20)
		{
			l = "T";
		}
		else if(n == 21)
		{
			l = "U";
		}
		else if(n == 22)
		{
			l = "V";
		}
		else if(n == 23)
		{
			l = "W";
		}
		else if(n == 24)
		{
			l = "X";
		}
		else if(n == 25)
		{
			l = "Y";
		}
		else if(n == 26)
		{
			l = "Z";
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
