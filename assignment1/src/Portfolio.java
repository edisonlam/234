import java.text.NumberFormat;
import java.util.ArrayList;


public class Portfolio {
	ArrayList<Transaction> portfolio = new ArrayList<Transaction>();

	public Portfolio() 
	{
		printPortfolio();
	}
	
	public void addStockToPortfolio(Transaction t)
	{
		portfolio.add(t);
	}
	
	public void printPortfolio()
	{
		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		for(Transaction t : portfolio)
		{
			System.out.println("Agent ID: " + t.agentID + ", Stock Symbol: " + t.symbolName() + 
					", Price Per Share: "+ defaultFormat.format(t.stockPrice()) +
					", Amount Purchased: " + t.numberBought());
		}
	}

	public ArrayList<Transaction> getPortfolio() {
		return portfolio;
	}
	
	public void setPortfolio(ArrayList<Transaction> portfolio) {
		this.portfolio = portfolio;
	}
}
