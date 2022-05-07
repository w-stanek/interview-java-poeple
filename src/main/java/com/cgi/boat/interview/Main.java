package com.cgi.boat.interview;

import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, List<String>> firstByLast = PeopleProcessor.firstnamesByLastname(PeopleSetup.people);
		Map<String, List<String>> lastByFirst = PeopleProcessor.lastnamesByFirstname(PeopleSetup.people);
		int[] maxCount = {0,0,0};
		String[] maxName = {"","",""};

		for(Map.Entry<String, List<String>> entry : lastByFirst.entrySet() ) {
			System.out.println( "Key = "+ entry.getKey()+" value = "+entry.getValue());
			int nameCount = entry.getValue().size();
			if(nameCount>maxCount[0]) {
				maxCount[0] = nameCount;
				maxName[0] = entry.getKey();
			}
			else if (nameCount>maxCount[1]) {
				maxCount[1] = nameCount;
				maxName[1] = entry.getKey();
			}
			else if(nameCount>maxCount[2]) {
				maxCount[2] = nameCount;
				maxName[2] = entry.getKey();
			}

		}
		for(int i = 0;i< maxCount.length;i++) {
			System.out.println(maxName[i]+": "+maxCount[i]);
		}

	}


	// TODO: Print out 3 most common first names along with number of occurrences
	// for example:
	// Homer: 32
	// Bart: 21
	// William: 3
}







