public class Examen {
	
	/**
	 * Aqui creem una variable la qual guardara string i un int per comparar els tricker
	 * 
	 **/
	
	public int registrarPreu(double preu, String ticker) {
	 
		//Si fora real guardaria a la base de dades el nom de l'empresa i el valor de l'acci�
		//per� com es tracta d'una prova nom�s els mostra per pantalla
		
		String tickersValids = "AAPL AMZN FB GOOGL";
			
		int comparacio = tickersValids.indexOf(ticker);
		
		if (comparacio == -1) {
				
			System.out.println("El ticker no �s v�lid");
				
			return -1;
		}
			
		if (preu<0.0) {
				
			System.out.println("El preu �s menor que el valor m�nim perm�s");
				
			return -2;
				
		}
			
		if (preu>500.0) {
				
			System.out.println("El preu �s superior al valor m�xim perm�s");
			return -3;
		}
		
			
		System.out.println("Valors registrats, ticker: " + ticker + ", preu: " + preu);
		return 0;
	}
		
	/**
	 * Aqui ens retornara el preu maxim en aquest cas 455
	 **/
	
	public double preuMax(){
		//Un programa real es connectaria a una base de dades per a mirar el preu m�s alt
		//com �s per a una prova r�pida mostra un valor predeterminat
		return 455.0;
	}
	
	/**
	 * Ens retornara el ticker que te el preu mes alt en aquest cas AAPL
	 **/
		
	public String tickerMax() {
		//Un programa real es connectaria a una base de dades per a mirar l'empresa amb el preu m�s alt
		//com �s per a una prova r�pida mostra un valor predeterminat
		return "AAPL";
	}
		
	/**
	 * Ens retornara el preu minim que sera de 150
	 **/
		
	public double preuMin() {
		//Igual per als valors m�nims
		return 150.0;
	}
		
	/**
	 * Ens retornara el tricker minim que hi tenim en aquest cas FB
	 **/
	
	public String tickerMin() {
		//Igual per als valors m�nims
		return "FB";
	}
		
}