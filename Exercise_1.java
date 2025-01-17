class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top < 0)
        return true;
        else
        return false;
    } 

    Stack() 
    { 
       
        
    } 
  
    boolean push(int x) 
    { 
       // add element at the top
        a[++top] = x;
        return true;
    } 
  
    int pop() 
    { 
        
        if(isEmpty()){
        System.err.println("Stack underflow");
        return 0;}
        else{
            // decrement top
            return a[top--];
        }
          

    } 
  
    int peek() 
    { 
         if(isEmpty()){
        System.err.println("Stack underflow");
        return 0;}
        else{
            //print top element
            return a[top];
        }
          
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
