import java.io.*;
import java.util.*;
class Author
{
private String name;
private String email;
private String gender;
Author(String n,String e,String g)
{
name=n;
email=e;
gender=g;
}
public String getName()
{
return name;
}
public String getEmail()
{
return email;
}
public String getGender()
{
return gender;
}
}
class Book
{
private String name1;
String author;
private double price;
private int qtyInStock;
Book(String n1,String a,double p,int q)
{
name1=n1;
author=a;
price=p;
qtyInStock=q;
}
public String getName()
{
return name1;
}
public String getAuthor()
{
return author;
}
public double getPrice()
{
return price;
}
public void setPrice(double p)
{
price=p;
}
public int getqtyInStock()
{
return qtyInStock;
}
public void setQtyInStock(int q)
{
qtyInStock=q;
}
}
class M
{
public static void main(String args[])
{
Book z = new Book("lost","Alen",92.50,4);
Author y = new Author("g","gaya@","f");
System.out.println("book name:"+z.getName());
System.out.println("price:"+z.getPrice());
System.out.println("inStock:"+z.getqtyInStock());
System.out.println("author name:"+y.getName());
System.out.println("mail:"+y.getEmail());
System.out.println("gender:"+y.getGender());
}
}

