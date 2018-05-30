package main;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ExceptionInfo {
	private Exception e;
	private String hostname;
	private String user;
	private Date date;
	
	@JsonCreator
	public ExceptionInfo(@JsonProperty("e") Exception e, @JsonProperty("hostname") String hostname
			, @JsonProperty("user") String user, @JsonProperty("date") Date date) {
		super();
		this.e = e;
		this.hostname = hostname;
		this.user=user;
		this.date = date;
	}

	public Exception getE() {
		return e;
	}

	public String getHostname() {
		return hostname;
	}

	public String getUser() {
		return user;
	}

	public Date getDate() {
		return date;
	}
	
}
