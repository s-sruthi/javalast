package com.training;
import com.training.MediaType;
public class Books extends MediaType {

	private String author;
	private int isbnNumber;
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Books(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
	public Books(String title,String author, int isbnNumber) {
		super();
		this.author = author;
		this.isbnNumber = isbnNumber;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getIsbnNumber() {
		return isbnNumber;
	}
	public void setIsbnNumber(int isbnNumber) {
		this.isbnNumber = isbnNumber;
	}
	
	public void display()
	{
		super.display();
		System.out.println(getAuthor());
		System.out.println(getIsbnNumber());
	}
	
	}

