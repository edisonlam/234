import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author stefanbund
 *
 */
public class mainMaket {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Market m = new Market();//create the market right away
		
//		Agent a = new Agent(); //buyer/sellers/traders
		
//		String l = provideTUI();
							//this gives us 2 things, the market and a stock to look for
		
		//first, search for a stock by supplying a string (give a string, get a stock)
		Stock s = searchForStockWithString(m.getIndex());
	}
		
		//then, ask if they wish to buy the stock
		
		//if so, make a transaction from that stock:
//		Transaction t = makeTransactionFromStock(s);
		
		//next, add that transaction to a portfolio, which you created in main
		
//		buyAStock();
//	}
	
//	private static Transaction makeTransactionFromStock(Stock s)
//	{
//		return null;
//	}

	private static Stock searchForStockWithString(ArrayList<Stock> index) 
	{
		String b = "";
		Porfolio p = new Porfolio();
		do
		{
			System.out.println("input the symbol of a stock to research: ");
			Scanner sc = new Scanner(System.in);
			String symbolName = sc.next();
			for(Stock s : index)
			{
				if(symbolName.equalsIgnoreCase(s.getSymbol()))
				{
					System.out.println("bingo, I just found the stock I need..."); //worked!
					System.out.println("stock symbol: " +s.getSymbol() +
							" last sold at price: " +s.getPrice() + 
							" buy Volume: " + s.getIpoQty() );
					System.out.println("would you like to buy this stock?");
					String a = sc.next();
					if(a.equalsIgnoreCase("yes"))
					{
						Transaction t = new Transaction();
						t.symbolName = s.getSymbol();
						t.stockPrice = s.getPrice();
						System.out.println("how many shares do you wish to buy?");
						t.numberBought = sc.nextInt();
						if(t.numberBought > 0)
						{
							System.out.println("you bought " + t.numberBought +
									" shares at the price of " +t.stockPrice +
									" per share for stock symbol " +t.symbolName);
							p.addStockToPortfolio(t);
							p.printPortfolio();
						}
						else if(t.numberBought <= 0)
						{
							System.out.println("sorry you cannot buy that many shares");
						}
					}
					else
					{
						System.out.println("thank you for your time");
					}
					System.out.println("would you like to buy more stocks?");
					b = sc.next();
				}
			}
		}
		while (b.equalsIgnoreCase("yes"));
		return null;
	}
}

//	private static void buyAStock() {
//		
//	}

//	private static void searchForStock(String l, ArrayList<Stock> index) 
//	{
//		//get the stock in the index with the same name as the symbol I just typed in
//		for(Stock s : index)
//		{
//			if(l.equalsIgnoreCase(s.getSymbol()))
//			{
//				System.out.println("bingo, I just found the stock I need..."); //worked!
//				System.out.println("stock symbol: " +s.getSymbol() +
//						" last sold at price: " +s.getPrice() + 
//						" buy Volume: " + s.getIpoQty() );
//				Transaction t = new Transaction();
//				t.symbolName = s.getSymbol();
//				t.stockPrice = s.getPrice();
//				Scanner sc = new Scanner(System.in);
//				System.out.println("how many shares you wish to buy? ");
//				t.numberBought = sc.nextInt();
//				
//				Porfolio p = new Porfolio();
//				p.addStockToPortfolio(t);
//				p.printPortfolio(); //do this
//			}
//		}
//	}

//	public static String provideTUI()
//	{ 
//		@SuppressWarnings("resource")
//		Scanner sc = new Scanner(System.in);//get user input from the console
//		//String ui = sc.next(); //refers to what the user types, traps the user input in ui, var
//		//System.out.println("variable ui is now " + ui);
//		
////		System.out.println("input the symbol of a stock to research: ");
////		String symbolName = sc.next();
//											//ONCE I GET USER IN PUT, I CAN LOOK AT EACH STOCK 
//											// IN OUR INDEX, AND STUDY EACH STOCK'S SYMBOL
//											// FOR EQUALITY TO THE USER INPUT
//		//compareInputToStocksInMyIndex(symbolName); //initiate the search for stocks of that name
////		return symbolName; 
//	}
//}
