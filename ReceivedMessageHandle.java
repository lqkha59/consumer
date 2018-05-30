package main;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReceivedMessageHandle {
	
	
	
	static void handleMessage (String message) {
		try {
			ExceptionInfo exceptionInfo = new ObjectMapper().readValue(message, ExceptionInfo.class);
			System.out.println(exceptionInfo.getE().getStackTrace().toString());
			System.out.println(exceptionInfo.getHostname());
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
