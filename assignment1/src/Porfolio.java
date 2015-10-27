import java.util.ArrayList;


public class Porfolio {
	ArrayList<Transaction> portfolio = new ArrayList<Transaction>();
	
	/**
	 * 
	 * RECORD OF PURCHASES OF STOCK
	 */
	public Porfolio() {

	
	
	}
	
	public void addStockToPortfolio(Transaction t)
	{
		portfolio.add(t);
	}
	
	/**
	 * 
	 * print the portfolio
	 */
	public void printPortfolio()
	{
		for(Transaction t : portfolio)//exemplifies how to iterate an array of objects successfully
		{
			System.out.println("stock symbol: " + t.symbolName() + 
					", price per share: "+ t.stockPrice() +
					", amount: " + t.numberBought());
		}
	}

}
