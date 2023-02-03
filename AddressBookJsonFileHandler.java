package com.addressbook;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerationException

public class AddressBookJsonFileHandler {

	public void convertToJson() {
		String result="";
		try{

			ObjectMapper mapper = new ObjectMapper();
			result = mapper.writeValueAsString(personList);
			for(Person person : personList) {
				mapper.writeValue(new File("PersonsContactDetails.json"), person);
			}
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JacksonException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(result);
     }
