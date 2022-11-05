package Pojo;

public class PojoTdd {
String name;
int no_of_rooms;
 int rent_per_day;
 String swimming_pool;
 int id;
public PojoTdd(String name, int no_of_rooms, int rent_per_day, String swimming_pool, int id) {
	super();
	this.name = name;
	this.no_of_rooms = no_of_rooms;
	this.rent_per_day = rent_per_day;
	this.swimming_pool = swimming_pool;
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNo_of_rooms() {
	return no_of_rooms;
}
public void setNo_of_rooms(int no_of_rooms) {
	this.no_of_rooms = no_of_rooms;
}
public int getRent_per_day() {
	return rent_per_day;
}
public void setRent_per_day(int rent_per_day) {
	this.rent_per_day = rent_per_day;
}
public String getSwimming_pool() {
	return swimming_pool;
}
public void setSwimming_pool(String swimming_pool) {
	this.swimming_pool = swimming_pool;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
 

}
