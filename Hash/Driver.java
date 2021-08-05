//Introduction to the code and comments on planning and procedure are located in the Data.java File.

import java.io.*;
import java.util.*;
import java.lang.*;

public class Driver{
  public static void main(String[] args) {
  PhoneBook s = new PhoneBook();
  Customer c = new Customer();

  Data d = new Data();
  Data d1 = new Data();
  Data d2 = new Data();

  // testing adding object to linked list customer 
  d.add("Flanagan","Elen","9174780750");
  c.add(d);
  //Data d1 = new Data();
  //Data d2 = new Data();

  //System.out.println(c);
  //c.printCustomer();

  // ad another customer
  //d.clear();
  d1.add("Hadjahmed", "Chaouiki", "9174780756");
  c.add(d1);
  // print customer with two linked element
  //System.out.println(c);

  //c.printCustomer();
  // add to PhoneBook
  s.add(0,c);


  // testing printing PhoneBook list
  System.out.println();
  System.out.println("Print linked customer of two element added without hashCode");

  //heaading
  System.out.println("----------------------------------------------------------------");
  System.out.printf("%-25s %-25s %-18s \n","Last Name","First Name","Phone Number");
  System.out.println("----------------------------------------------------------------");
  // phonebook list
   s.printPhoneBookList();


  // testing hashcode method
  System.out.println();
  System.out.println("Print hashCode of two element customer");
  System.out.println("hashcode Flanagan: "+ c.hashCode("Flanagan"));
  System.out.println("hashcode Haadjahmed: "+ c.hashCode("Hadjahmed"));

  // remove Flanagan from linked list
  //c=s.get(0);
  c.removeCustomer("Flanagan");

  // testing printing PhoneBook list
  System.out.println();
  System.out.println("Print linked customer  after remove Flanagan ");
  System.out.println("----------------------------------------------------------------");
  System.out.printf("%-25s %-25s %-18s \n","Last Name","First Name","Phone Number");
  System.out.println("----------------------------------------------------------------");

  s.printPhoneBookList();

  // remove Hadjahmed from linked list
  //c=s.get(0);
  c.removeCustomer("Hadjahmed");

  // testing printing PhoneBook list
  System.out.println();
  System.out.println("Print linked customer  after remove Hadjahmed empty customer");

  System.out.println("----------------------------------------------------------------");
  System.out.printf("%-25s %-25s %-18s \n","Last Name","First Name","Phone Number");
  System.out.println("----------------------------------------------------------------");
  //if (c.peekLast() == null) 
  //c = new Customer();


  s.printPhoneBookList();

  // add Customer with hashcode
  Customer c1 = new Customer();
  c1.add(d);
  if (s.get(c.hashCode("Flanagan")) == null) {
    s.add(c.hashCode("Flanagan"),c1);
  }
  //s.printPhoneBookList();
  // add Customer with hashcode
  Customer c2 = new Customer();

  c1.add(d1);
  if (s.get(c2.hashCode("Hadjahmed")) == null) {
    s.set(c.hashCode("Hadjahmed"),c2);
  }
  // add Customer with hashcode
  Customer c3 = new Customer();

  d2.add("Persaud","Michele","2121234567");
  c3.add(d2);
  if (s.get(c3.hashCode("Persaud")) == null) {
   s.set(c.hashCode("Persaud"),c3);
  }
  
  // printing PhoneBook list
    System.out.println();
  System.out.println("Print linked customer  after adding 3 customer with hashcode");
  System.out.println();
  System.out.println("----------------------------------------------------------------");
  System.out.printf("%-25s %-25s %-18s \n","Last Name","First Name","Phone Number");
  System.out.println("----------------------------------------------------------------");
  s.printPhoneBookList();
/*
  //remove Flanagan
  s.set(c.hashCode("Hadjahmed"),null);
  // printing PhoneBook lisSystem.out.println();
  System.out.println("Print linked customer  after removing Flanagan");
  System.out.println();
  System.out.println("----------------------------------------------------------------");
  System.out.printf("%-25s %-25s %-18s \n","Last Name","First Name","Phone Number");
  System.out.println("----------------------------------------------------------------");
  s.printPhoneBookList();*/
  }
}