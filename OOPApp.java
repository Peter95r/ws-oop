import java.util.Scanner;

public class OOPApp{


public static void main(String[] args){


	Product p = new Product(); // initailisation
	Product p2;                // declaration
	p2 = new Product();        // assignment


	p.name = "TV";
	Scanner in =  new Scanner(System.in);
	Book first = new Book("Lord of the Rings", true);
	Book second = new Book("Witcher", false);
	//Book third = new Book (in.nextLine(), in.nextBoolean());


	//first.changeFields();
	//System.out.println(first.pages);

	System.out.println(first.getTitle() + " " + first.getPage() + " " + first.getBoolean());
	

	first.setPage((short)23);
	first.setTitle("Lord of the Rings: Two towers");

	System.out.println(first.getTitle() + " " + first.getPage() + " " + first.getBoolean());

	//DICE

Dice d = new Dice();

d.setAmountOfSides(6);
d.setColor("White");
d.setWeight(5);
d.setMaterial("Plastic");
d.setInStock(true);

System.out.println(d.getColor() + " " + d.getMaterial() + " "+d.getWeight() + " " + d.getAmountOfSides() + " "+ d.isInStock());
   }
}

class Book{
	

	public String title;
	private boolean isFinnised;
	public short pages = 0;


	public Book(String t, boolean b){

		this.title = t;
		this.isFinnised =b;
	}

	public void printName(){

		System.out.println("Some text");
	}


	public void changeFields(){

		Scanner in = new Scanner(System.in);
		this.pages =  in.nextShort();
		this.isFinnised = in.nextBoolean();
	}

		//getters

public String getTitle(){

	return this.title;
}


public boolean getBoolean(){

	return this.isFinnised;
}


public short getPage(){

	return this.pages;
}


		//setters

public void setTitle(String aTitle){

	this.title = aTitle;

}

public void setBoolean(boolean aBoolean){

	this.isFinnised = aBoolean;

}

public void setPage(short aPage){

	this.pages = aPage;

}


}

class Dice{

private int amountOfSides;
private String color;
private int weight;
private String material;
private boolean inStock;

//GETTERS

public int getAmountOfSides(){
	return this.amountOfSides;
}

public String getColor(){
return this.color;
}

public String getMaterial(){
	return this.material;
}

public int getWeight(){
	return this.weight;
}

public boolean isInStock(){
	return this.inStock;
}


//SETTERS

public void setAmountOfSides(int amount){
	this.amountOfSides = amount;
}

public void setColor(String color){
	this.color = color;
}

public void setMaterial(String material){
	this.material = material;
}

public void setWeight(int weight){
	this.weight = weight;
}

public void setInStock(boolean inStock){
	this.inStock = inStock;
}

}