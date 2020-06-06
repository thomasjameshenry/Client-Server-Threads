package lab5project;
import java.net.*;
import java.io.*;
import java.lang.Math;

public class QuoteServer{

		public static void main(String args[]) {
		try {
			
			ServerSocket sock = new ServerSocket(6019);
			// now listen for connections
			while (true) {
				Socket client = sock.accept();
				PrintWriter pout = new PrintWriter(client.getOutputStream(), true);
			// write the Quote to the socket

				pout.println(randomQuoteGenerator());
				// close the socket and resume
				// listening for connections
				client.close();
			}
		}
		catch (IOException ioe) {
			System.err.println(ioe);
		}
		}
		public static String randomQuoteGenerator()
		{
		    String  QUOTES[] = {
		            "Be your brother; everyone elses brothers are already taken.― Oscar Wilde",
		            "A room without books is like a sad library. ― Marcus Tullius Cicero",
		            "Be the person that you wish to meet in the library. ― Mahatma Gandhi",
		            "If you tell the truth, you don't have to remember anything. ― Mark Twain",
		            "If you want to know what a man's like, take a good look at how he treats his inferiors, not his equals.― J.K. Rowling",
		            "To live is the rarest thing in the world. Most people exist, that is all.― Oscar Wilde",
		            "Without music, life would be a mistake. ― Friedrich Nietzsche",
		            "Always forgive your enemies, nothing annoys them so much. ― Oscar Wilde",
		            "Life isn't about getting and having, it's about giving and being. –Kevin Kruse",
		            "Whatever the mind of man can conceive and believe, it can achieve. –Napoleon Hill",
		            "Strive not to be a success, but rather to be of value. –Albert Einstein",                          
		            }; 
		    int randomNum = (int)(Math.random()*11);
		    return QUOTES[randomNum];
		}
}