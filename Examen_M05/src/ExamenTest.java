import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AccionsTest {
	
	private int registrarPreu(double d, String string) {
		return 0;
	}
	
	/**
	 * Aquest test comprova el tricker no valid
	 **/
	
    @Test
    void testTickerNoValid() {

        int resultatActual;
        int resultatEsperat;

        AccionsTest test1 = new AccionsTest();
        resultatActual = test1.registrarPreu(100.0, "GOOGL");
        resultatEsperat = -1;
        assertEquals(resultatEsperat, resultatActual);
    }
    
    /**
	 * Aquest test comprova el preu negatiu no valid
	 **/
    
    @Test
    void testPreuNegatiuNoValid() {

        int resultatActual;
        int resultatEsperat;

        AccionsTest test2 = new AccionsTest();
        resultatActual = test2.registrarPreu(-100.0, "GOOGL");
        resultatEsperat = -2;
        assertEquals(resultatEsperat, resultatActual);
    }
    
    /**
	 * Aquest test comprova el preu major
	 **/

    @Test
    void testPreuMajorNoValid() {

        int resultatActual;
        int resultatEsperat;

        AccionsTest test3 = new AccionsTest();
        resultatActual = test3.registrarPreu(800.0, "GOOGL");
        resultatEsperat = -3;
        assertEquals(resultatEsperat, resultatActual);
    }

    /**
	 * Aquest test comprova el test que sigui correcte
	 **/
    
    @Test
    void testCorrecte() {

        int resultatActual;
        int resultatEsperat;

        AccionsTest test4 = new AccionsTest();
        resultatActual = test4.registrarPreu(100.0, "GOOGL");
        resultatEsperat = 0;
        assertEquals(resultatEsperat, resultatActual);
    }
}