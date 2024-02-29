package com.linkcxo.utils;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonReadData {
	
	public static void main(String[] args) throws IOException, ParseException, org.json.simple.parser.ParseException {
	
		
		String email1=JsonReadData.getTestdata("EMAIL");
		  String otp1=JsonReadData.getTestdata("OTP");
		  System.out.println("Email id"+ email1  +  "OTP is"+ otp1);
	}      
	
	public static JSONObject getJsonData() throws IOException, ParseException, org.json.simple.parser.ParseException  {
	       
        //pass the path of the testdata.json file
        File filename = new File("C:\\Users\\rahul\\git\\repository\\LinkCxo_Android_App_Framework\\CoreData\\Data.json");
        //convert json file into string
        String json = FileUtils.readFileToString(filename, "UTF-8");
        //parse the string into object
        Object obj = new JSONParser().parse(json);
        //give jsonobject o that I can return it to the function everytime it get called
        JSONObject jsonObject = (JSONObject) obj;
        return jsonObject;
}

public static String getTestdata(String key) throws IOException, ParseException, org.json.simple.parser.ParseException {
	String testDataValue;
	return testDataValue=(String) getJsonData().get(key);
	
	
	
       
      
       
    }
}
