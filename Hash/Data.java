/*
Members: Chaouiki, Michele P, and Eduardo
Procedure:
We started working on the project in class on Thursday: 
1- We planned the code, decided on the Classes, constructors and variables. 
2- We started forming the backbone of the code.
3- We watched some videow about Hashing
4- We read some tutorials like GeeksFor GeeksForGeeks
5- We started coding on Friday
6- On Saturday we started working on the code via Zoom: Mr. H, Michele and Eduardo. At the end we had more bugs than Central Park in a Summer Evening. So we stopped for the weekend and agreed to look at the work independently before the following meeting.
7- Monday we resumed work on the code. The biggest problem was that it was printing Michele's name four times when we added her. 
8- We tried changing the print command, changing to adding/setting, but nothing was working.
9- So Michele, our resources expert, searched the web and found some answers in Stackoverflow,  docsoverflow, and GeeksForGeeks. I looked in some the code that we had done in class dealing with linked lists and arrays.
10- In the end we figured out the problem. 
11- It was late Wednesday morning when we finally had a working code with no bugs, and Mr. H wanted to do the optional Insert, but Michele and I decided that we were done. So we commented out the insert method and left it to a later time.
*/

import java.io.*;
import java.util.*;
import java.lang.*;

public class Data {

  //private data;
  //private List<String> data =new ArrayList<String>();
  List<String>  data; 
  
  //constructor without value
  public Data() {
  data = new ArrayList<String>(3);
  } 
  //constructor with value
  public Data(String lN, String fN,  String pN) {
  data = new ArrayList<String>(3);
    data.add(lN);
    data.add(fN);
    data.add(pN);
  } 

  public void add(String lN, String fN,  String pN) {
    data.add(lN);
    data.add(fN);
    data.add(pN);

  }
// I don't need for now
  public void clear(){
    data.clear();
  }

  public boolean contains (String s){
    if (data.get(0) == s){ 
      return true;
    }
    return false;
  }

  public String get (int index){
    return data.get(index);
  }
  public String toString(){
    String s =String.format("%-25s %-25s",data.get(0),data.get(1))+data.get(2).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)-$2-$3");
    return s;
  }
}