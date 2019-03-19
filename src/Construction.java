/**
 * 
 */

/**
 * @author Kushaal
 * Calculates cost for construction
 */
public class Construction {
	
	/**
	 * Checks type of home required and calculates cost
	 * @param type - type of home
	 * @param area - area of home in square feet
	 * @return cost of construction in INR
	 */
	int findCost(String type,int area)
	{
		if(type.equalsIgnoreCase("standard"))
			return 1200*area;
		
		if(type.equalsIgnoreCase("above standard"))
			return 1500*area;
		
		if(type.equalsIgnoreCase("high standard"))
			return 1800*area;
		
		if(type.equalsIgnoreCase("high standard with automation"))
			return 2500*area;
		
		else
			return -1;
		
	}

}
