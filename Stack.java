public class Stack {
int maxsize=10;
int[] stackarray=new int[maxsize];
int top=-1;

void push(int a)
{
if(top+1>=maxsize)


  (top == maxsize - 1);    //stack is full
{
  System.out.println("stack is full");
}
else
  top = top +1
  
  stackarray[top] = a; //print what is being pushed(stackarray is a variable)
  
 Print(int a);
}
  
  
}
void pop()
{
if(top<0)
{
//stack is empty
}
else
{
  stackarray[top] = null;        //not necessary but helpful
  top--;
  //print what is being popped
  

//Your code goes here
}
void top()
{
  Print(stackarray[top]);
}

//Your code goes here
void print()           //print everything
{
//Your code goes here
}
public static void main(String[] args) {
// TODO Auto-generated method stub
Stack s=new Stack();
s.push(3);
s.push(34);
s.push(33);
s.push(93);
s.push(34);
s.push(33);
s.push(93);
s.push(34);
s.push(33);
s.push(93);
s.push(93);
s.top(); 
s.pop();
s.top();
s.push(67);
s.print();
}

}

