/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

package exercise5;

/**
 * @author martde01
 * @assignment exercise5
 */
public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("Exercise 5");
}

public class Room {
    private String building;
    private int number;

public Room(String building, int number) {
    this.building = building;
    this.number = number;
}

public String getBuilding() {
    return building;
}
public int getNumber() {
    return number;
}

public String toString() {
    return "Hello";
}
}

/**
 * Class Book
 * Task 2: Create a class Book with the following private data members: String title, String author, double price
 */
public class Book {
    private String title;
    private String author;
    private double price;

    
public Book(String title, String author, Double price) {
    this.title = title;
    this.author = author;
    this.price = price;
}
public String getTitle() {
    return title;
}

public String getAuthor() {
    return author;
}

public Double getPrice() {
    return price;
}
public String toString() {
    
}
}
/**
 * Class Employee
 * Task 3: Create a class Employee with the following private data members: String firstName, String lastName, double salary, boolean fullTime. The string representation of an object of this class depends on the value of the isFullTime member. If an employee is full time, their salary is reported as annual, otherwise it's hourly.
 */
public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private boolean fullTime;
    
public Employee(String firstName, String lastName, Double salary, Boolean fullTime) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
    this.fullTime = fullTime;  
}

public String getFirstName() {
    return firstName;
}
public String getLastName() {
    return lastName;
}
public Double getSalary() {
    return salary;
}
public Boolean getFullTime() {
    return fullTime;
}

}
/**
 * Class Company
 * Task 4: Create a class Company with the following private data members: String name, double stockPrice. Implement a setter method for the stockPrice.
 */
public class Company {
    private String name;
    private Double stockPrice;
    
public Company(String name, Double stockPrice) {
    this.name =  name;
    this.stockPrice = stockPrice;
}

public String getName() {
    return name;
}
public Double getStockPrice() {
    return stockPrice;
}
public void setStockPrice(Double newStockPrice) {
    stockPrice = newStockPrice;
}
}
/**
 * Class College
 * Task 5: Create a class College with the following private data members: String name, int rank. Implement setter method for the rank.
 */
public class College {
    private String name;
    private int rank;
    
public College(String name, int rank) {
    this.name = name;
    this.rank = rank;
}

public String getName() {
    return name;
}
public int getRank() {
    return rank;
}
public void setRank(int newRank) {
    rank = newRank;
}
}
/**
 * Class Laptop
 * Task 6: Create a class Laptop with the following private data members: String manufacturer, double price, String color. Implement setters for color and price.
 */
public class Laptop {
    private String manufacturer;
    private Double price;
    private String color;
    
public Laptop(String manufacturer, Double price, String color) {
    this.manufacturer = manufacturer;
    this.price = price;
    this.color = color;
}

public String getManufacturer() {
    return manufacturer;
}
public Double getPrice() {
    return price;
}
public String getColor() {
    return color;
}
public void setPrice(Double newPrice) {
    price = newPrice;
}
public void setColor(String newColor) {
    color = newColor;
}
}
/**
 * Class Song
 * Task 7: Create a class Song with the following private data members: String title, String artist.
 * Implement method equals. Two objects of type Song are equal if their titles and artists are equal.
 * Implement method hashCode. Hash code of an object is calculated as follows: numeric value of each letter in the title of a song is multiplied by that letter's position in the title and added to the accumulator (integer). Numeric value of each letter in the artist of a song is multiplied by that letter's position in the artist and added to the accumulator.
 */
public class Song {
    private String title;
    private String artist;
    
public Song(String title, String artist) {
    this.title = title;
    this.artist = artist;
}

public String getTitle() {
    return title;
}
public String getArtist() {
    return artist;
}
}
/**
 * Class Chart
 * Task 8: Create a class Chart that contains a private data member HashMap<Integer, Song> (reuse class Song from task 7). Its constructor must take file name as a parameter, read data from the file (sample top40pop.csv is provided), create a new Song object from each line, and put that object into a HashMap using a song position as a key. Implement method getSong that takes an integer position as a parameter and returns a Song at that position. 
 */
public class Chart {
    private HashMap<Integer, Song>;
    
public Chart(HashMap<Integer, Song>) {
    this.integer = Integer;
    this.song = Song;
}
}
public int getSong() {
    if (song == integer);
        return song;
}
}
/**
 * Class Student
 * Task 9: Create a class Student with the following private data members: String name, String major, double gpa.
 * Implement setters for major and gpa
 */
public class Student {
    private String name;
    private String major;
    private Double gpa;
    
public Student(String name, String major, Double gpa) {
    this.name = name;
    this.major = major;
    this.gpa = gpa;
}

public String getName() {
    return name;
}
public String getMajor() {
    return major;
}
public Double getGpa() {
    return gpa;
}
}
/**
 * Class Roster
 * Task 10: Create a class Roster that contains a private member ArrayList<Student> studentList (reuse class Student from task 9). Its constructor must take the name of a file as a parameter, read data from the file (sample roster.csv is provided, another file of a similar structure may be used for grading), create an object of type Student based on the content of a line, and add that object to the ArrayList studentList.
 * Implement method printRoster that prints all the elements of the studentList.
 * @author yasiro01
 */
public class Roster {
    private ArrayList<Student> studentList;
    
public Roster(ArrayList studentlist) {
    this.studentList = studentList;
}

public ArrayList getStudentList() {
    return studentList;
}
}

}

