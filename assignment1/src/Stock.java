import java.util.Random;
/**
 * @author stefanbund
 *
 */
public class Stock {
	private double lastSalePrice; 
	private double price; 
	private String symbol = ""; //string is a word, or collection of letters/characters
	private int ipoQty; //"buy volume"
	private double lastSaleVolume; 
	private String industry; //the industry the stock is in
	
	/**
	 * set up the symbol, price ipoQty
	 */
	public Stock() 
	{	
		setRandomStockName(); //@TODO define what the stock needs to know when it's created
		//setSymbol(s);
		
		double x = setUpRandomPrice();
		setPrice(x);
		
		int l = setRandomIPOQTY(); //get an integer back
		setIpoQty(l); //use that result to set the IPO QTY
	}

	/**
	 * establish a random number, which will represent the intial stock float
	 * @return
	 */
	private int setRandomIPOQTY() 
	{
		Random r = new Random();
		int l = r.nextInt() / 100;
		if (l < 0)  //correct for negative values
		{
			l = l * -1; //turn it positive
		}
		
		return l;
	}

	/**
	 * first, generate a random number, then assign to the price variable
	 * this will be the initial price for the stock
	 * @return
	 */
	private double setUpRandomPrice() 
	{
		Random r = new Random();
		double price = r.nextDouble() * 10.0; //shoudl resemble a retail stock price
		return price;
	}

/**
 * set the name of the stock symbol
 * @return
 */
	private void setRandomStockName() {
		//String s = "MEME";//not really random
		
		//1. grab a random integer, divide by 100,000,000
		
		//2. if the integer is between a certain set of numbers, return a string
		for(int i = 0; i <=3; i++)
		{
			Random r = new Random();
			int l = r.nextInt(26) + 1;
			symbol = symbol + generateLetter(l);
		}
		//return s;
	}
	
	public static String generateLetter(int n)
	{
		
		String l = "";//empty, or null, to begin
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
		//System.out.println("value of n, random is " + n + ", hence my letter is " + l);
		return l;
	}


	/**
	 * @return the lastSalePrice
	 */
	public double getLastSalePrice() {
		return lastSalePrice;
	}


	/**
	 * @param lastSalePrice the lastSalePrice to set
	 */
	public void setLastSalePrice(double lastSalePrice) {
		this.lastSalePrice = lastSalePrice;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) 
	{
		this.price = price;
	}


	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}


	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}


	/**
	 * @return the ipoQty
	 */
	public int getIpoQty() {
		return ipoQty;
	}


	/**
	 * @param ipoQty the ipoQty to set
	 */
	public void setIpoQty(int ipoQty) {
		this.ipoQty = ipoQty;
	}


	/**
	 * @return the lastSaleVolume
	 */
	public double getLastSaleVolume() {
		return lastSaleVolume;
	}


	/**
	 * @param lastSaleVolume the lastSaleVolume to set
	 */
	public void setLastSaleVolume(double lastSaleVolume) {
		this.lastSaleVolume = lastSaleVolume;
	}

	/**
	 * @return the industry
	 */
	public String getIndustry() {
		return industry;
	}

	/**
	 * @param industry the industry to set
	 */
	public void setIndustry(String industry) {
		this.industry = industry;
	}

}
