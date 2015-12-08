
public class Transaction {

	public String symbolName;
	
	public double stockPrice;
	
	public int numberBought;

	public String agentID;
	
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
}
