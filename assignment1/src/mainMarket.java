import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class mainMarket {

	public static void main(String[] args) 
	{
		Market m = new Market();

		Agent a = new Agent();

		Stock s = initializeAllTransactions(m.getIndex(), a.getList());

//		Stock s = searchForStockWithString(m.getIndex());
	}

	private static Stock initializeAllTransactions(ArrayList<Stock> index, ArrayList<Investor> list) 
	{
		Random r = new Random();
		for(Investor a : list)
		{
			Portfolio p = new Portfolio();
			do
			{
				Stock x = index.get(r.nextInt(index.size()));
				Transaction t = new Transaction();
				t.symbolName = x.getSymbol();
				t.stockPrice = x.getPrice();
				int n = r.nextInt(10000) + 1;
				t.numberBought = n;
				t.agentID = a.getAgentID();
				double budgetCheck = (a.getBudget() - (n*t.stockPrice));
				int qtyCheck = (x.getIpoQty() - n);
				if(budgetCheck <=0)
				{
					continue;
				}
				else if(qtyCheck <=0)
				{
					continue;
				}
				else
				{
					History h = new History();
					h.symbolName = x.getSymbol();
					h.salePrice = x.getPrice();
					h.lastSaleVolume = n;
					h.agentID = a.getAgentID();
					x.setIpoQty(x.getIpoQty() - n);
					x.setPrice(x.getPrice() + (r.nextDouble()));
					h.newPrice = x.getPrice();
					a.setBudget(a.getBudget() - (n*t.stockPrice));
					p.addStockToPortfolio(t);
					x.addPriceHistory(h);
				}
			}
			while(a.getBudget() >= 5000);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to print the -Portfolio- or the -History-?");
		String a = sc.next();
		if(a.equalsIgnoreCase("Portfolio"))
		{
			Portfolio.printPortfolio(list);
		}
		else if(a.equalsIgnoreCase("History"))
		{
			Stock.printHistory(index);
		}
		else
		{
			System.out.println("Goodbye");
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
