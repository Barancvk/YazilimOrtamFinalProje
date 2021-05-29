package com.medipol.yazilim.ortamarac.barancivak.RestAPIFinalProje;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

public class UrunRestApiFinalProje {
	
	@RestController
	@RequestMapping("/urunler")

	public static class RestAPIFinal {

	    public static List<String> urunler = new ArrayList<>();

	    @GetMapping("/urunlistele")
	    public List<String> urunlistele(){
	        return urunler;
	    }

	    @PostMapping("/urunekleme")
	    public String urunekle(String urunismi) {
	    	urunler.add(urunismi);
	        return urunismi;
	    }
	    
	    @PostMapping("/urunsilme")
	    public String urunsilme(String urunismi) {
	    	urunler.remove(urunismi);
	        return urunismi;
	    }
	}

}
