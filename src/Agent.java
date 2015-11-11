import java.util.ArrayList;

public class Agent {

	private ArrayList<Investor> list = new ArrayList<Investor>();
	
	public void addAnInvestorToTheList(Investor investor)
	{
		list.add(investor);
	}
	
	public void printTheList()
	{
		for(Investor a : list)
		{
			System.out.println("Agent ID: " + a.getAgentID() + 
					", Budget: "+ a.getBudget());
		}
	}
	
	public ArrayList<Investor> getList() {
		return list;
	}
	
	public void setList(ArrayList<Investor> list) {
		this.list = list;
	}
	
	public Agent() 
	{
		initializeAllInvestorInSimulation();
		initializeAllTransactions();
		printTheList();
	}
	
	private void initializeAllTransactions() 
	{
		
	}

	private void initializeAllInvestorInSimulation() 
	{
		for(int i = 0 ; i <= 10000; i++)
		{
			Investor a = new Investor();
			list.add(a);
		}
	}
}