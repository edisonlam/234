//import java.io.File;
//import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;

public class Portfolio {
	static ArrayList<Transaction> portfolio = new ArrayList<Transaction>();

	public Portfolio(ArrayList<Investor> list) throws IOException 
	{
//		createPortfolioFiles(list);		//too many files
	}
	
	public static void addStockToPortfolio(Transaction t)
	{
		portfolio.add(t);
	}
	
	public static void printPortfolio(ArrayList<Investor> list)
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
							", Amount Purchased: " + t.numberBought() +
							", Bought From Agent ID: " + t.boughtFrom());
				}
			}
			System.out.println("");
		}
	}
	
//	public static void createPortfolioFiles(ArrayList<Investor> list) throws IOException
//	{
//		File file = new File("C:\\Users\\Edison\\Desktop\\CIS234\\Portfolio\\Portfolio.txt");
//		file.getParentFile().mkdirs();
//		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
//		for(Investor a : list)
//		{
//			FileWriter c = new FileWriter("C:\\Users\\Edison\\Desktop\\CIS234\\Portfolio\\"+a.getAgentID()+".txt");
//			String x = a.getAgentID();
//			for(Transaction t : portfolio)
//			{	
//				if(t.agentID.equalsIgnoreCase(x))
//				{
//					c.write("Stock Symbol: " + t.symbolName() + 
//							", Price Per Share: "+ defaultFormat.format(t.stockPrice()) +
//							", Amount Purchased: " + t.numberBought());
//					c.write(System.getProperty("line.separator"));
//				}
//			}
//			c.close();
//		}
//	}

	public ArrayList<Transaction> getPortfolio() {
		return portfolio;
	}
	
	public void setPortfolio(ArrayList<Transaction> portfolio) {
		Portfolio.portfolio = portfolio;
	}
}
