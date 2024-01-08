package com.hemebiotech.analytics;

import java.util.Map;

public class WriteSymptomDataToConsole implements ISymptomWriter {
	
	private String filepath;
	
	public WriteSymptomDataToConsole (String filepath) {
		this.filepath = filepath;
	}

	@Override
	public void writeSymptoms(Map<String, Long> symptoms) {
		for( Map.Entry<String, Long> entry : symptoms.entrySet() ){
		    System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}

}
