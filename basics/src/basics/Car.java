package basics;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Car {
	private String model; //enum //immutable, only getter
	private String color;
	private float price; //mutable, getter+setter
	private Engine engine;  //Has-A
	private String fuleType; //
	String number;
	boolean insured;
	String transmission;
	List<Seat> seats;// List
	float weight;
	String design;  //Coupe, sedan, XUV
	float mileage;
	String brand;
	boolean ev;
	Date manfacturingDate;
	List<Wheel> wheels = new ArrayList<>();
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String getFuleType() {
		return fuleType;
	}
	public void setFuleType(String fuleType) {
		this.fuleType = fuleType;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public boolean isInsured() {
		return insured;
	}
	public void setInsured(boolean insured) {
		this.insured = insured;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public List<Seat> getSeats() {
		return seats;
	}
	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public float getMileage() {
		return mileage;
	}
	public void setMileage(float mileage) {
		this.mileage = mileage;
	}
	public boolean isEv() {
		return ev;
	}
	public void setEv(boolean ev) {
		this.ev = ev;
	}
	public Date getManfacturingDate() {
		return manfacturingDate;
	}
	public void setManfacturingDate(Date manfacturingDate) {
		this.manfacturingDate = manfacturingDate;
	}
	public List<Wheel> getWheels() {
		return wheels;
	}
	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}
	public String getBrand() {
		return brand;
	}
}
