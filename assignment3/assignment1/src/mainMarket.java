import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class mainMarket {

	public static void main(String[] args) throws IOException
	{
		File file = new File("C:\\Users\\Edison\\Desktop\\CIS234\\CIS234.txt");
		file.getParentFile().mkdirs();
		
		Market m = new Market();

		Agent a = new Agent();
		
		Portfolio p = new Portfolio(a.getList());
		
		ForSale f = new ForSale();

		Stock s = initializeAllTransactions(m.getIndex(), a.getList(), p.getPortfolio(), f.getForSale());

//		Stock s = searchForStockWithString(m.getIndex());
	}

	private static Stock initializeAllTransactions(ArrayList<Stock> index, ArrayList<Investor> list, ArrayList<Transaction> portfolio, ArrayList<ForSale> sales) throws IOException 
	{
		Random r = new Random();
		for(Investor a : list)
		{
			Portfolio p = new Portfolio(list);
			do
			{
				Stock x = index.get(r.nextInt(index.size()));
				Transaction t = new Transaction();
				t.symbolName = x.getSymbol();
				t.stockPrice = x.getPrice();
				int n = r.nextInt(10000) + 1;
				t.numberBought = n;
				t.agentID = a.getAgentID();
				t.boughtFrom = "Market";
				double budgetCheck = (a.getBudget() - (n*t.stockPrice));
				int qtyCheck = (x.getIpoQty() - n);
				if(budgetCheck <=0)
				{
					continue;
				}
				else if(qtyCheck <0)
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
		for(Investor a : list)
		{
			String x = a.getAgentID();
			for(Transaction t : portfolio)
			{	
				if(t.agentID.equalsIgnoreCase(x))
				{
					String c = t.symbolName();
					for(Stock s : index)
					{
						if(s.getSymbol().equalsIgnoreCase(c))
						{
							int n = r.nextInt(t.numberBought);
							ForSale f = new ForSale();
							f.symbolName = t.symbolName;
							double m = (s.getPrice() + r.nextDouble());
							f.salePrice = m;
							f.amountForSale = n;
							f.agentID = t.agentID;
							f.addStockToForSale(f);
						}
					}
				}
			}
		}
		for(Investor a : list)
		{
			int i = 0;
			for(i = 0; i <= 100; i++)
			{
				ForSale x = sales.get(r.nextInt(sales.size()));
				Transaction t = new Transaction();
				t.symbolName = x.symbolName();
				t.stockPrice = x.salePrice();
				int n = r.nextInt(1000) + 1;
				t.numberBought = n;
				t.agentID = a.getAgentID();
				t.boughtFrom = x.agentID();
				double budgetCheck = (a.getBudget() - (n*t.stockPrice));
				int qtyCheck = (x.getAmountForSale() - n);
				String dupeCheck = x.agentID;
				if(budgetCheck <=0)
				{
					continue;
				}
				else if(qtyCheck <0)
				{
					continue;
				}
				else if(dupeCheck.equalsIgnoreCase(a.getAgentID()))
				{
					continue;
				}
				else
				{
					History h = new History();
					h.symbolName = x.symbolName();
					h.salePrice = x.salePrice();
					h.lastSaleVolume = n;
					h.agentID = a.getAgentID();
					h.newPrice = x.salePrice();
					x.setAmountForSale(x.getAmountForSale() - n);
					a.setBudget(a.getBudget() - (n*t.stockPrice));
					String v = x.agentID;
					for(Investor b : list)
					{
						if(b.getAgentID().equalsIgnoreCase(v))
						{
							b.setBudget(b.getBudget() + (n*t.stockPrice));
						}
					}
					Portfolio.addStockToPortfolio(t);
					Stock.addPriceHistory(h);
				}
			}
		}
		String b = "";
		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Would you like to print the -Index-, -Agents-, -Portfolio-, -History-, or -ForSale-?");
			String a = sc.next();
			if(a.equalsIgnoreCase("Index"))
			{
				Market.printTheIndex();
			}
			else if(a.equalsIgnoreCase("Agents"))
			{
				Agent.printTheList();
			}
			else if(a.equalsIgnoreCase("Portfolio"))
			{
				Portfolio.printPortfolio(list);
			}
			else if(a.equalsIgnoreCase("History"))
			{
				Stock.printHistory(index);
			}
			else if(a.equalsIgnoreCase("ForSale"))
			{
				ForSale.printForSale(list);
			}
			else
			{
				System.out.println("Goodbye");
			}
			System.out.println("Would you like to go back to the beginning?");
			b = sc.next();
		}
		while (b.equalsIgnoreCase("yes"));
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
