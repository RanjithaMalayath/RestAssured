package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;

public class TestDataBuild {
	
	public AddPlace addPlacePayload(String name, String language, String address)
	{
		AddPlace ap = new AddPlace();
		ap.setAccuracy(50);
		ap.setName(name);
		ap.setPhone_number("(+91) 983 893 3937");
		ap.setAddress(address);
		ap.setWebsite("http://google.com");
		ap.setLanguage(language);
		Location l = new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		List<String> type = new ArrayList<String>();
		type.add("shoe park");
		type.add("shop");
		ap.setTypes(type);
		ap.setLocation(l);
		return ap;
	}
	public String deletePlacePayload(String placeId)
	{
		return "{\"place_id\":\""+placeId+"\"}";
	}

}
