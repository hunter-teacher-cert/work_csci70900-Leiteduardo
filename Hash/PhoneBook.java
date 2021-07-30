
import java.io.*;
import java.util.*;

/*
Setup:
Project: Hash*/


public class PhoneBook{

  /* Instance Variables */
  private ArrayList<Integer><customer> data;  // to store the data


  public PhoneBook(){
    data = new ArrayList<Integer><customer>(); //create a 2D ArrayList

    for (int i = 0; i < 99; i++){
      data.add(0.null);
    }

  }

  public PhoneBook(int size){ //test cases
    data = new ArrayList<Integer>();
    for (int i=0;i<size;i++){
      data.add(0, null);
    }

  }

  //public int get(int index){
    //return this.data.get(index);
  //}
  //method to insert data
  public void insert(String lastName, String firstName, int phoneNumber){
    int index = hash(lastName);
    //look for an empty space: if it's empty in the hashtable we add;
    //if not empty we go to the end of link table until the next is null
    //add in the link list table
    if (data.get(index)== 0) {
        Customer(Martinez, Jose, 2121234567, null);
        data.add(index, Customer);
    }




  }
}//end class PhoneBook