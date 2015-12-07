import java.util.ArrayList;

public class Agent {

	private ArrayList<Investor> list = new ArrayList<Investor>();
	
	public void addAnInvestorToTheList(Investor investor)
	{
		list.add(investor);
	}
	
	public Agent() 
	{
		initializeAllInvestorInSimulation();
//		printTheList();
	}
	
//	public void printTheList()
//	{
//		for(Investor a : list)
//		{
//			System.out.println("Agent ID: " + a.getAgentID() + 
//					", Budget: "+ a.getBudget());
//		}
//	}
	
	public ArrayList<Investor> getList() {
		return list;
	}
	
	public void setList(ArrayList<Investor> list) {
		this.list = list;
	}

	private void initializeAllInvestorInSimulation() 
	{
		for(int i = 0 ; i <= 100000; i++)
		{
			Investor a = new Investor();
			list.add(a);
		}
	}
}