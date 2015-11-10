import java.util.ArrayList;
import java.util.Scanner;

public class mainMarket {
	
	public static void main(String[] args) 
	{
		Market m = new Market();
		
		Agent a = new Agent();
		
//		Stock s = searchForStockWithString(m.getIndex());
	}

//	private static Stock searchForStockWithString(ArrayList<Stock> index) 
//	{
//		String b = "";
//		Porfolio p = new Porfolio();
//		do
//		{
//			System.out.println("input the symbol of a stock to research: ");
//			Scanner sc = new Scanner(System.in);
//			String symbolName = sc.next();
//			for(Stock s : index)
//			{
//				if(symbolName.equalsIgnoreCase(s.getSymbol()))
//				{
//					System.out.println("bingo, I just found the stock I need..."); //worked!
//					System.out.println("stock symbol: " +s.getSymbol() +
//							" last sold at price: " +s.getPrice() + 
//							" buy Volume: " + s.getIpoQty() );
//					System.out.println("would you like to buy this stock?");
//					String a = sc.next();
//					if(a.equalsIgnoreCase("yes"))
//					{
//						Transaction t = new Transaction();
//						t.symbolName = s.getSymbol();
//						t.stockPrice = s.getPrice();
//						System.out.println("how many shares do you wish to buy?");
//						t.numberBought = sc.nextInt();
//						if(t.numberBought > 0)
//						{
//							System.out.println("you bought " + t.numberBought +
//									" shares at the price of " +t.stockPrice +
//									" per share for stock symbol " +t.symbolName);
//							p.addStockToPortfolio(t);
//							p.printPortfolio();
//						}
//						else if(t.numberBought <= 0)
//						{
//							System.out.println("sorry you cannot buy that many shares");
//						}
//					}
//					else
//					{
//						System.out.println("thank you for your time");
//					}
//					System.out.println("would you like to buy more stocks?");
//					b = sc.next();
//				}
//			}
//		}
//		while (b.equalsIgnoreCase("yes"));
//		return null;
//	}
}
