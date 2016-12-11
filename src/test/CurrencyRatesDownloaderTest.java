package test;

import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import model.Currency;
import service.CurrencyRatesDownloader;

public class CurrencyRatesDownloaderTest {
	// test integracyjny/funkcjonalny

	private CurrencyRatesDownloader classUnderTest;

	@Before
	public void setUp() {
		classUnderTest = new CurrencyRatesDownloader();
		}
	
	@Test 
	public void loadingTest() throws Exception {
		BigDecimal rate = classUnderTest.downloadRate(Currency.USD, Currency.PLN);
		
		assertNotNull(rate); //kursy siê pobra³y 
	}
	
	
}
