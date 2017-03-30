package com.test.mtest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Iterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TableSoaTest {
	
	public static void main(String [] args) throws Exception{
		String filepath = "E:\\tablehtml.txt";
		
		File file = new File(filepath);
		FileReader reader = new FileReader(file);
		BufferedReader bufferreader = new BufferedReader(reader);
		
		String line = null;
		StringBuilder content = new StringBuilder();
		while((line=bufferreader.readLine()) !=null){
			content.append(line); 
		}
		bufferreader.close();
//		Document document = new Document(content.toString());
		Document document = Jsoup.parse(content.toString() );
//		Document document = Jsoup.parse(new String(content.toString().getBytes("GBK"),"UTF-8") );
		Elements elements= document.select("tr");
		
		if(!elements.isEmpty()&&elements.size()>1){
			elements.remove(0);
			Iterator<Element> iterator = elements.iterator();
			while(iterator.hasNext()){
				Element element = iterator.next();
				Elements tds = element.select("td");
				System.out.println("	private "+tds.get(1).text()+" "+tds.get(0).text()+"; //"+tds.get(3).text());
				
			}
		}
		
	}

}
