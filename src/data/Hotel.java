package data;



public class Hotel {
	
	private Room[] standardSingles = new StandardRoom[2];{
		standardSingles[0] = new StandardRoom("Standard Single",1,1,"39.99",false,"100");
		standardSingles[1] = new StandardRoom("Standard Single",1,1,"39.99",false,"101");
	}
	private Room[] standardDoubles = new StandardRoom[2];{
		standardDoubles[0] = new StandardRoom("Standard Double",2,1,"59.99",false,"102");
		standardDoubles[1] = new StandardRoom("Standard Double",2,1,"59.99",false,"103");
	}
	private Room[] standardTriples = new StandardRoom[2];{
		standardTriples[0] = new StandardRoom("Standard Triple",3,1,"79.99",false,"104");
		standardTriples[1] = new StandardRoom("Standard Triple",3,1,"79.99",false,"105");
	}
	
	private Room[] extendedSingles = new ExtendedRoom[2];{
		extendedSingles[0] = new ExtendedRoom("Extended Single",1, 2, "49.99",false,"200");
		extendedSingles[1] = new ExtendedRoom("Extended Single",1, 2, "49.99",false,"201");
	}
	private Room[] extendedDoubles = new ExtendedRoom[2];{
		extendedDoubles[0] = new ExtendedRoom("Extended Double",2,2,"69.99",false,"202");
		extendedDoubles[1] = new ExtendedRoom("Extended Double",2,2,"69.99",false,"203");
	}
	private Room[] extendedTriples = new ExtendedRoom[2];{
		extendedTriples[0] = new ExtendedRoom("Extended Triple",3,2,"89.99",false,"204");
		extendedTriples[1] = new ExtendedRoom("Extended Triple",3,2,"89.99",false,"205");
	}
		
	private Room[] superiorSingles = new SuperiorRoom[2];{
		superiorSingles[0] = new SuperiorRoom("Superior Single",1,3,"59.99",false,"300");
		superiorSingles[1] = new SuperiorRoom("Superior Single",1,3,"59.99",false,"301");
	}
	private Room[] superiorDoubles = new SuperiorRoom[2];{
		superiorDoubles[0] = new SuperiorRoom("Superior Double",2,3,"79.99",false,"302");
		superiorDoubles[1] = new SuperiorRoom("Superior Double",2,3,"79.99",false,"303");
	}
	private Room[] superiorTriples = new SuperiorRoom[2];{
		superiorTriples[0] = new SuperiorRoom("Superior Triple",3,3,"99.99",false,"304");
		superiorTriples[1] = new SuperiorRoom("Superior Triple",3,3,"99.99",false,"305");
	}
	
	
}
