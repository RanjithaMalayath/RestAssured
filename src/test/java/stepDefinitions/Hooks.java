package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@DeletePlace")
	public void beforeSenario() throws IOException
	{
		
		
		StepDefinition sd = new StepDefinition();
		if(StepDefinition.place_id==null)
		{	
		sd.add_Place_Payload_with("Rihan", "Ridhvin", "My World");
		sd.user_calls_with_http_request("AddPlaceAPI", "POST");
		sd.verify_place_id_created_maps_to_using("Rihan", "getPlaceAPI");
	}
	}

}
