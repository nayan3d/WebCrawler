package com.scalable.webcrawler.main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class PageReader {
	
	public static void main(String[] args)
	{
		List<String> jsList = new ArrayList<>();
		File input = new File("/tmp/input.html");
		Document doc = null;
		try {
			doc = Jsoup.parse(input, "UTF-8", "http://example.com/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Element content = doc.getElementById("content");
		Elements links = content.getElementsByTag("script");
		for (Element link : links) {
		  String linkHref = link.attr("text/javascript");
		  String linkText = link.text();		  
		  jsList.add(linkText);
		}
		
		//Get the count of the JS scripts and the count of it.
		Set<String> uniqueSet = new HashSet<String>(jsList);
		for (String JS : uniqueSet) {
			System.out.println(JS + ": " + Collections.frequency(jsList, JS));
		}
	}

}
