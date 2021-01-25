package com.example.lambda.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Hello implements RequestHandler<Object, String> {

    @Override
    public String handleRequest(Object input, Context context) {
    	context.getLogger().log("Input: " + input);
    	String tempDate = String.valueOf(input).substring(6);
    	String targetDate=tempDate.substring(0,tempDate.length()-1);
    	String output = "Hello, " + targetDate + "!" + " You parking loser!";
    	return output;	
    }

}

