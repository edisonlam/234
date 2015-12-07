import java.util.ArrayList;
import java.util.Random;

public class mainMarket {

	public static void main(String[] args) 
	{
		Market m = new Market();
		
		Agent a = new Agent();
		
		Portfolio p = new Portfolio();

		Stock s = initializeAllTransactions(m.getIndex(), a.getList(), p.getPortfolio());
		
//		Stock s = searchForStockWithString(m.getIndex());
	}
	
	private static Stock initializeAllTransactions(ArrayList<Stock> index, ArrayList<Investor> list, ArrayList<Transaction> portfolio) 
	{
		Random r = new Random();
		for(Investor a : list)
		{
			Portfolio p = new Portfolio();
			do
			{
				Stock x = index.get(r.nextInt(index.size()));
				Transaction t = new Transaction();
				History h = new History();
				t.symbolName = x.getSymbol();
				h.symbolName = x.getSymbol();
				t.stockPrice = x.getPrice();
				h.salePrice = x.getPrice();
				int n = r.nextInt(1000) + 1;
				t.numberBought = n;
				h.lastSaleVolume = n;
				t.agentID = a.getAgentID();
				double budgetCheck = (a.getBudget() - (n*t.stockPrice));
				if(budgetCheck <=0)
				{
					continue;
				}
				else
				{
					x.setIpoQty(x.getIpoQty() - n);
					x.setPrice(x.getPrice() + (r.nextDouble()));
					h.newPrice = x.getPrice();
					a.setBudget(a.getBudget() - (n*t.stockPrice));
					p.addStockToPortfolio(t);
					x.addPriceHistory(h);
				}
//				x.printHistory();
			}
			while(a.getBudget() >= 1000);
			p.printPortfolio(list, portfolio);
		}
		return null;
	}
}

//	private static Stock searchForStockWithString(ArrayList<Stock> index) 
//	{
//		String b = "";
//		Portfolio p = new Portfolio();
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
