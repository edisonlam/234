import java.util.ArrayList;

public class Market {
	
	private static ArrayList<Stock> index = new ArrayList<Stock>();

	public void addAStockToTheIndex(Stock stock)
	{
		index.add(stock);
	}
	
	public static void printTheIndex()
	{
		for(Stock s : index)
		{
			System.out.println("Stock Symbol: " + s.getSymbol() + 
					", Price: "+ s.getPrice() +
					" with IPO Buy Volume " + s.getIpoQty());
		}
	}
	
	public ArrayList<Stock> getIndex() {
		return index;
	}

	public void setIndex(ArrayList<Stock> index) {
		this.index = index;
	}

	public Market() 
	{
		initializeAllStocksInSimulation();
//		printTheIndex();
	}

	private void initializeAllStocksInSimulation() 
	{
		
		for(int i = 0 ; i <= 6000; i++)
		{
			Stock s = new Stock();
			index.add(s);
		}
	}
}
