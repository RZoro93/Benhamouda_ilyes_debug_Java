package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class Main {
	
	public static void main(String args[]) throws Exception {
		
		ISymptomReader readSymptomDataFromFile  = new ReadSymptomDataFromFile("symptoms.txt");
		ISymptomWriter writeSymptomDataToFile = new WriteSymptomDataToFile("result.out");
		
		
		AnalyticsCounter acounter = new AnalyticsCounter(readSymptomDataFromFile,writeSymptomDataToFile);
		
		
		 List<String> symptoms =  acounter.getSymptoms();
		 
		 Map<String, Long> counts = acounter.countSymptoms(symptoms);
		 
		 Map<String, Long> sortedCounts = acounter.sortSymptoms(counts);
		 
		 acounter.writeSymtoms(sortedCounts);
               
			}
	 }
