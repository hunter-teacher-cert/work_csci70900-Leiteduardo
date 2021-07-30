public class Customer {
    private Customer head; // list head
    private Customer next;

      //empty construtor
    public Customer {
        String lastName = "";
        String firstName = "";
        int phoneNumber = 0;
        next = null;
    }
      //value constructor
    public Customer(String l, String f,  int p) {
          lastName = l;
          firstName = f;
          phoneNumber = p;
          next = null;
        }  //constructor to create a new node
    }

      //instance Customer
   public Customer(String l, String f, int p, next) {
     lastName = l;
     firstName = f;
     phoneNumber = p;
     this.next = next;
  }
//modify the Customer
  public void setCustomer(String l, String f,  int p) {
    lastName = l;
    firstName = f;
    phoneNumber = p;
  }
//set up the next Customer
  public void setNext(Customer n) {
    next = n;
  }

//get the head
  public Customer getCustomer() {
    return head;
  }//end getValue

  //get next Customer
  public Customer getNext() {
    return next;
  }// end getNext

  //public String toString() {
    //return data;
  //}//toString


  public void printCustomerList(){
    Customer s = this;
    while(s != null){
      System.out.println(s);
      s = s.getNext();
    }
  }

}//class Node
}