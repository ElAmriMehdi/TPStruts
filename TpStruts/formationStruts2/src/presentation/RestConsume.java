package presentation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import models.todos;
import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;

public class RestConsume extends ActionSupport{
	private List<todos> todosList  = new ArrayList<todos>();
	public RestConsume(){}
	public List<todos> getTodosList() {
		return todosList;
	}
	public void setTodosList(List<todos> todosList) {
		this.todosList = todosList;
	}

	public String getTodos(){
		todosList.add(new todos("je dois lire mon cours"));
		todosList.add(new todos("je dois pratiquer"));
		todosList.add(new todos("je répète"));
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/todos/");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
					String output;
					System.out.println("Output from Server .... \n");
					String json="";
					while ((output = br.readLine()) != null) {
						json+=output;
					}
			Gson gson = new Gson();		
			todosList = gson.fromJson(json, List.class);
			todosList.add(new todos("je dois lire mon cours"));
			todosList.add(new todos("je dois pratiquer"));
			todosList.add(new todos("je répète"));
			Collections.reverse(todosList);
			System.out.println(todosList);
			conn.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "SUCCESS";
	}
	
	

}
