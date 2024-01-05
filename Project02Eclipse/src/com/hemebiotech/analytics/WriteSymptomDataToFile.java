package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptomDataToFile implements ISymptomWriter {
		
		private String filepath;
		
		public WriteSymptomDataToFile (String filepath) {
			this.filepath = filepath;
		}

		@Override
		public void writeSymptoms(Map<String, Long> symptoms) {
			
			FileWriter writer;
			
			try {
				writer = new FileWriter ("result.out");
				for( Map.Entry<String, Long> entry : symptoms.entrySet() ){
				    writer.write( entry.getKey() + " = " + entry.getValue() + "\n" );
				}
				
				writer.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
	}


