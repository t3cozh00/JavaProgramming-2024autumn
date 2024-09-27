package exerciseweek3.exercise3_3;


/*  3.3. Create class C that inherits class A. Class C has:
- attribute c that is integer, visibility private
- Default constructor that calls the default constructor of A by call method super() and then assigns c=0
- Constructor that takes an integer parameter and assigns that value to attribute c
- Override method "public int sum()" from class A, so that it returns a+b+c in Class C. 

You notice that you get error "Field A.a is not visible". Again, you need to change the visibility of an inherited attribute. So change a in Class A to type protected from private. 
*/

public class C extends A {
    private int c;

    public C(){
        super();
        c = 0;
    }

    public C (int c){
        // this is where you send the parameter c 
        // value to the superclass A
        super(c);
        // and also set the value of attribute c
        this.c = c;
    }

    @Override
    public int sum(){
        return a+b+c;
    }
}
