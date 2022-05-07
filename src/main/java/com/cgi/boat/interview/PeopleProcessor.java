package com.cgi.boat.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class PeopleProcessor {
	/**
	 * Returns a {@link Map} where keys are first names and values lists of all last names
	 * of people from the input list who have the first name
	 * equal to the key.
	 *
	 * Example:
	 * For input: ["John Doe", "John Silver", "Peter Doe"]
	 * Expected result would be:
	 * {
	 *  "John" -> ["Doe", "Silver"]
	 *  "Peter" -> ["Doe"]
	 * }
	 */
	PeopleSetup people;
	static Map<String, List<String>> lastnamesByFirstname(List<Person> people){

		Map<String, List<String>> test = new HashMap<String, List<String>>();
		for(Person person: people) {
			String mapKey = ((Person) person).getFirstName();

			if (!test.containsKey(mapKey)) {
				test.put(mapKey,new ArrayList<String>());
			}
			test.get(mapKey).add(((Person) person).getLastName());
		}
		return test;
	}


	/**
	 * Same as {@link PeopleProcessor#lastnamesByFirstname} except that the mapping
	 * returned is lastname -> firstnames
	 *
	 * Example:
	 * For input: ["John Doe", "John Silver", "Peter Doe"]
	 * Expected result would be:
	 * {
	 *  "Doe" -> ["John", "Peter"]
	 *  "Silver" -> ["John"]
	 *
	 */
	static Map<String, List<String>> firstnamesByLastname(List<Person> people){
		Map<String, List<String>> test = new HashMap<String, List<String>>();
		for(Person person: people) {
			String mapKey = ((Person) person).getLastName();

			if (!test.containsKey(mapKey)) {
				test.put(mapKey,new ArrayList<String>());
			}
			test.get(mapKey).add(((Person) person).getFirstName());
		}

		return test;
	}

}
