package stepDefinations;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {
	
	
	@Before("@DeletePlace")
	public void beforeScenario() throws IOException
	{
		
		//Execute this code only when place id is Null.
		//Write a code that will give you place id
<<<<<<< HEAD
=======
		System.out.println("Hello Java!!");
		System.out.println("testing - git");
>>>>>>> 4fd33d3b11af282e5c495c35821789c22eeaab32
		StepDefination sd = new StepDefination();
		if(StepDefination.place_id==null)
		{
		sd.add_place_payload_with("Rajput", "French", "India");	
		sd.user_calls_with_http_request("AddPlaceAPI", "POST");
		sd.verify_place_id_created_maps_to_using("Rajput", "GetPlaceAPI");
		}
		
	}
	
	
	public void testMethod()
	{
		System.out.println("Hello world");
	}

}
