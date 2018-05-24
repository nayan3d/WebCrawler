package com.scalable.webcrawler.main;

import java.util.Scanner;

import com.scalable.webcrawler.entities.WebLink;

public class WebCrawler {
	
	public static final String GOOGLE_SEARCH_URL = "https://www.google.com/search";

	public static void main(String[] args) {
		
		WebLink link = new WebLink();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the search term.");
		String searchTerm = scanner.nextLine();
		System.out.println("Please enter the number of results. Example: 5 10 20");
		int num = scanner.nextInt();
		scanner.close();		
		String searchURL = GOOGLE_SEARCH_URL + "?q="+searchTerm+"&num="+num;		
		link.setUrl(searchURL);
		
		WebpageDownloaderTask task = new WebpageDownloaderTask(true);
	    (new Thread(task)).start();

	    System.out.println("Downloaded");
	}

}
