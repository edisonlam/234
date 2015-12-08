
public class Transaction {

	public String symbolName;
	
	public double stockPrice;
	
	public int numberBought;

	public String agentID;
	
	public String boughtFrom;
	
	public Transaction() 
	{
		
	}

	public String symbolName() {
		return symbolName;
	}

	public double stockPrice() {
		return stockPrice;
	}

	public int numberBought() {
		return numberBought;
	}
	
	public String agentID() {
		return agentID;
	}
	
	public String boughtFrom() {
		return boughtFrom;
	}
}
