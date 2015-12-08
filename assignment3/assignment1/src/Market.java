import java.io.IOException;
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
		Market.index = index;
	}

	public Market() throws IOException 
	{
		initializeAllStocksInSimulation(index);
//		printTheIndex();
	}

	private void initializeAllStocksInSimulation(ArrayList<Stock> index) throws IOException 
	{
		
		for(int i = 0 ; i <= 6000; i++)
		{
			Stock s = new Stock(index);
			index.add(s);
		}
	}
}
