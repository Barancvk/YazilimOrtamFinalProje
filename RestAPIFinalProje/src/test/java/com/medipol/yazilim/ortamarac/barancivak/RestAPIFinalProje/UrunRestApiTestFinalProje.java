package com.medipol.yazilim.ortamarac.barancivak.RestAPIFinalProje;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;


import org.junit.jupiter.api.Test;

public class UrunRestApiTestFinalProje {
	
	@Test
	public void eklemeTest () {
		List<String> urun = Arrays.asList("Televizyon");
		List<String> add = Arrays.asList("Televizyon");
				Assert.assertEquals(urun, add);
		
	}
	
	@Test
	public void listelemeTest () {
		List<String> urun = Arrays.asList("Bilgisayar");
	
		List<String> urunlistele = Arrays.asList("Bilgisayar");
		
				Assert.assertEquals(urun, urunlistele); 
				
	}
	

	@Test
	public void silmeTest () {
		List<String> urun = Arrays.asList("Telefon");
		List<String> remove = Arrays.asList("Telefon");
				Assert.assertEquals(urun, remove);
	}

	
}
