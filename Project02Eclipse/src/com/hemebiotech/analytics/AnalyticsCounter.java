package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {
	
	private ISymptomReader readSymptomDataFromFile;
	private ISymptomWriter writeSymptomDataToFile;
	//private ISymptomWriter writeSymptomDataToConsole;
	
	

 
 
	public List<String> getSymptoms(){
		
		List<String> symptoms = this.readSymptomDataFromFile.GetSymptoms();
		return symptoms;
		
	}
	
	public AnalyticsCounter(ISymptomReader readSymptomDataFromFile, ISymptomWriter writeSymptomDataToFile) {
		super();
		this.readSymptomDataFromFile = readSymptomDataFromFile;
		this.writeSymptomDataToFile = writeSymptomDataToFile;
	}

	public Map<String, Long> countSymptoms(List<String>symptoms){
		
		Map<String,Long> count = new HashMap<String, Long>();
		
		
		
		
	    for (String symptom : symptoms) {
	    	
            if (count.containsKey(symptom)){
      
             		Long numbersOfSymptoms = count.get(symptom);
            		count.put(symptom,numbersOfSymptoms + 1);
            	
            }
            else {
            	count.put(symptom, (long) 1);
            }
        }
 
        
        
		return count;
    }
		
		

	
	public Map<String,Long> sortSymptoms(Map<String,Long>symptoms) throws IOException{
		
		Map<String, Long> Sortedsymptoms = new TreeMap<>(symptoms);
		
		return Sortedsymptoms;
		
	}
	
	public void writeSymtoms(Map<String, Long>symptoms) {
		this.writeSymptomDataToFile.writeSymptoms(symptoms);
	 }
	
	}
	