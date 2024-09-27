package exerciseweek3.exercise3_3;

/* 3.2. Create classes A and B in a way that A inherits (extends) B.
Class B has:
- attribute b that is integer, visibility private
- Default constructor that assings b=0
- Constructor that takes an integer parameter and assigns that value to attribute b

Class A has:
- attribute a that is integer, visibility private
- Method public int sum() that returns a+b
- Default constructor that calls the default constructor of B by call method super() and then assigns a=0
- Constructor that takes an integer parameter and assigns that value to attribute a

When you write the code, you get error in Class A "Field B.b is not visible". Fix it by changing the visibility of attribute b to protected. Remember: private values are only visible in that particular class. Then, protected members can be inherited and thus are available also at subclass.  */

public class B {
    //private int b;
    protected int b;

    //Default constructor that assings b=0
    public B () {
        b = 0;
    }

    //Constructor that takes an integer parameter and assigns that value to attribute b
    public B (int b){
        this.b = b; 
    }
}
