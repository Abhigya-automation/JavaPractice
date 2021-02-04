package predicateassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ResponseList {

	public static void main(String[] args) {

		List<Response> listOfResponse = new ArrayList<Response>();
		listOfResponse.add(new Response("{\"id\": \"101\"}", 200, "json"));
		listOfResponse.add(new Response("{\"id\": \"102\"}", 400, "xml"));
		listOfResponse.add(new Response("{\"id\": \"103\"}", 200, "json"));
		listOfResponse.add(new Response("{\"id\": \"104\"}", 500, "json"));
		listOfResponse.add(new Response("{\"id\": \"105\"}", 200, "xml"));
		listOfResponse.add(new Response("{\"id\": \"106\"}", 400, "xml"));
		listOfResponse.add(new Response("{\"id\": \"107\"}", 200, "json"));
		listOfResponse.add(new Response("{\"id\": \"108\"}", 400, "json"));

		
		
		/*Predicate<Response> p1= response-> response.statusCode==400;
		ResponseList.display(p1, listOfResponse);*/
		
		/*Predicate<Response> p2= response-> response.responseType.equals("json");
		ResponseList.display(p2, listOfResponse);*/
		
		/*Predicate<Response> p3= response-> response.responseType.equals("json") && response.statusCode==400;
		ResponseList.display(p3, listOfResponse);*/
		
		/*Predicate<Response> p4= response-> response.responseType.equals("json") || response.statusCode==400;
		ResponseList.display(p4, listOfResponse);*/
		
		Predicate<Response> p5= response-> response.responseType.equals("json") || response.statusCode!=400;
		ResponseList.display(p5, listOfResponse);
		
		
		
		
		
		

	}
	
	public static void display(Predicate<Response> p, List<Response> list)
	{
		for(Response r:list)
		{
			if(p.test(r))
			{
				System.out.println(r.responseBody);
			}
		}
	}

}
