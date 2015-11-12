import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Random;

public class Stock {
	private double price; 
	private String symbol = "";
	private int ipoQty; 
	
	private ArrayList<History> history = new ArrayList<History>();
	
	public Stock() 
	{	
		setRandomStockName();
		
		double x = setUpRandomPrice();
		setPrice(x);
		
		int l = setRandomIPOQTY();
		setIpoQty(l);
		
		printHistory();
	}
	
	public void addPriceHistory(History h)
	{
		history.add(h);
	}
	
	public void printHistory()
	{
		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		for(History h : history)
		{
			System.out.println("Stock Symbol: " + h.symbolName() + 
					", Price Per Share: "+ defaultFormat.format(h.salePrice()) +
					", Amount Sold: " + h.lastSaleVolume() +
					", Price Increased By: " + defaultFormat.format((h.salePrice() - h.newPrice()) * -1));
		}
	}
	
	public ArrayList<History> getHistory() {
		return history;
	}
	
	public void setHistory(ArrayList<History> history) {
		this.history = history;
	}

	private int setRandomIPOQTY() 
	{
		Random r = new Random();
		int l = r.nextInt() / 100;
		if (l < 0)
		{
			l = l * -1;
		}
		
		return l;
	}

	private double setUpRandomPrice() 
	{
		Random r = new Random();
		double price = r.nextDouble() * 10.00 + 0.01;
		return price;
	}

	private void setRandomStockName() {
		for(int i = 0; i <=3; i++)
		{
			Random r = new Random();
			int l = r.nextInt(26) + 1;
			symbol = symbol + generateLetter(l);
		}
	}
	
	public static String generateLetter(int n)
	{
		
		String l = "";
		if(n == 1)
		{
			l = "A";
		}
		else if(n == 2)
		{
			l = "B";
		}
		else if(n == 3)
		{
			l = "C";
		}
		else if(n == 4)
		{
			l = "D";
		}
		else if(n == 5)
		{
			l = "E";
		}
		else if(n == 6)
		{
			l = "F";
		}
		else if(n == 7)
		{
			l = "G";
		}
		else if(n == 8)
		{
			l = "H";
		}
		else if(n == 9)
		{
			l = "I";
		}
		else if(n == 10)
		{
			l = "J";
		}
		else if(n == 11)
		{
			l = "K";
		}
		else if(n == 12)
		{
			l = "L";
		}
		else if(n == 13)
		{
			l = "M";
		}
		else if(n == 14)
		{
			l = "N";
		}
		else if(n == 15)
		{
			l = "O";
		}
		else if(n == 16)
		{
			l = "P";
		}
		else if(n == 17)
		{
			l = "Q";
		}
		else if(n == 18)
		{
			l = "R";
		}
		else if(n == 19)
		{
			l = "S";
		}
		else if(n == 20)
		{
			l = "T";
		}
		else if(n == 21)
		{
			l = "U";
		}
		else if(n == 22)
		{
			l = "V";
		}
		else if(n == 23)
		{
			l = "W";
		}
		else if(n == 24)
		{
			l = "X";
		}
		else if(n == 25)
		{
			l = "Y";
		}
		else if(n == 26)
		{
			l = "Z";
		}
		return l;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public int getIpoQty() {
		return ipoQty;
	}

	public void setIpoQty(int ipoQty) {
		this.ipoQty = ipoQty;
	}
}
