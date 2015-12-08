import java.text.NumberFormat;
import java.util.ArrayList;

public class ForSale {
	
	static ArrayList<ForSale> sales = new ArrayList<ForSale>();
	
	public void addStockToForSale(ForSale f)
	{
		sales.add(f);
	}
	
	public ArrayList<ForSale> getForSale() {
		return sales;
	}
	
	public void setPortfolio(ArrayList<ForSale> sales) {
		ForSale.sales = sales;
	}
	
	public String symbolName;
	
	public double salePrice;
	
	public int amountForSale;

	public String agentID;
	
	public ForSale() 
	{
		
	}
	
	public static void printForSale(ArrayList<Investor> list)
	{
		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		for(Investor a : list)
		{
			String x = a.getAgentID();
			System.out.println("Agent ID: " + a.getAgentID());
			for(ForSale f : sales)
			{	
				if(f.agentID.equalsIgnoreCase(x))
				{
					System.out.println("Stock Symbol: " + f.symbolName() + 
							", Price Per Share: "+ defaultFormat.format(f.salePrice()) +
							", Amount For Sale: " + f.getAmountForSale());
				}
			}
			System.out.println("");
		}
	}
	
	public String symbolName() {
		return symbolName;
	}

	public double salePrice() {
		return salePrice;
	}

	public int getAmountForSale() {
		return amountForSale;
	}

	public void setAmountForSale(int amountForSale) {
		this.amountForSale = amountForSale;
	}
	
	public String agentID() {
		return agentID;
	}

}
