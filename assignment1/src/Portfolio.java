import java.text.NumberFormat;
import java.util.ArrayList;

public class Portfolio {
	static ArrayList<Transaction> portfolio = new ArrayList<Transaction>();

	public Portfolio() 
	{

	}
	
	public void addStockToPortfolio(Transaction t)
	{
		portfolio.add(t);
	}
	
	public static void printPortfolio(ArrayList<Investor> list, ArrayList<Stock> index)
	{
		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		for(Investor a : list)
		{
			String x = a.getAgentID();
			System.out.println("Agent ID: " + a.getAgentID());
			for(Transaction t : portfolio)
			{	
				if(t.agentID.equalsIgnoreCase(x))
				{
					
					System.out.println("Stock Symbol: " + t.symbolName() + 
							", Price Per Share: "+ defaultFormat.format(t.stockPrice()) +
							", Amount Purchased: " + t.numberBought());
				}
			}
			System.out.println("");
		}
	}

	public ArrayList<Transaction> getPortfolio() {
		return portfolio;
	}
	
	public void setPortfolio(ArrayList<Transaction> portfolio) {
		this.portfolio = portfolio;
	}
}
