package com.scalable.webcrawler.dao;

import java.util.ArrayList;
import java.util.List;

import com.scalable.webcrawler.entities.WebLink;
import com.scalable.webcrawler.util.IOUtil;

public class CrawlerDAO {
	
		
	/**
	 * This method returns the URL's of the searched element.
	 * @return
	 */
	 public List<WebLink> getAllWebLinks() {
	        List<WebLink> result = new ArrayList<>();
	        //hardcoding few URL's
	        WebLink web = new WebLink();
	        web.setUrl("https://stackoverflow.com/");
	        result.add(web);
	        

	        return result;
	    }

	    public List<WebLink> getWebLinks(WebLink.DownloadStatus downloadStatus) {
	        List<WebLink> result = new ArrayList<>();
	        List<WebLink> allWebLinks = getAllWebLinks();

	        for (WebLink webLink : allWebLinks) {
	            if (webLink.getDownloadStatus().equals(downloadStatus)) {
	                result.add(webLink);
	            }
	        }

	        return result;
	    }
	    
	    public List<WebLink> setWeblinks(List<WebLink> linksList) {
	    	
	    	List<WebLink> list = new ArrayList<>();
	    	list.addAll(linksList);
			return list;
	    	
	    }
	    
	    
}
