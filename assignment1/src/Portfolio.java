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
		for(Transaction t : portfolio)
		{
			System.out.println("Stock Symbol: " + t.symbolName() + 
					", Price Per Share: "+ t.stockPrice() +
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
