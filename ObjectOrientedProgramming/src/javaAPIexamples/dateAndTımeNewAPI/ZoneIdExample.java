package dateAndTımeNewAPI;

import java.time.ZoneId;
import java.util.Set;
public class ZoneIdExample {

	public static void main(String[] args) {
		listZoneIds();
		
		System.out.println();
		
		ZoneId defaultZoneId = ZoneId.systemDefault();
		System.out.println("Default Zone Id: " + defaultZoneId);

	}
	public static void listZoneIds() {
		Set<String> zoneIds = ZoneId.getAvailableZoneIds();
		for(String zoneId: zoneIds) {
			System.out.println("Zone Id: " + zoneId);
		}
	}

}
