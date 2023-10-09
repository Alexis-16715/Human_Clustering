package human_clustering.model;

import java.util.LinkedList;


public class PeopleData_Model {
	LinkedList<PersonObject_Model> allPeopleDataObject;
	LinkedList<String> seeDataOfAllPeople;
	
	public PeopleData_Model () {
		this.allPeopleDataObject = new LinkedList<>();
	}
	
	public void addPerson (String name,int sports,int music,int entertainmentNews,int science) {
		allPeopleDataObject.add(new PersonObject_Model (name, sports, music, entertainmentNews, science));
	}
	
	public boolean checkIfTheListisEmpty() {
		
		return !allPeopleDataObject.isEmpty();
	}

	public LinkedList<PersonObject_Model> getAllPeopledata() {
		return allPeopleDataObject;
	}
	
	public LinkedList<String> toSeeDataOfAllPeople() {
		seeDataOfAllPeople = new LinkedList<>();
		for(int i = 0; i < allPeopleDataObject.size(); i++) {
			seeDataOfAllPeople.add("Name: " +allPeopleDataObject.get(i).getName() + " Interest in Sports: " + allPeopleDataObject.get(i).getSports() + " Interest in Music: " +  allPeopleDataObject.get(i).getMusic()+ " Interestin Entertainment News: " + allPeopleDataObject.get(i).getEntertainmentNews() + " Science: " + allPeopleDataObject.get(i).getScience());
		}
		return seeDataOfAllPeople;
	}
}
