package com.example.lambda.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Hello implements RequestHandler<Object, String> {

    @Override
    public String handleRequest(Object input, Context context) {
    	context.getLogger().log("Input: " + input);
    	String output = "Hello, " + input + "!" + " You parking loser!";
    	return output;	
    }

}

