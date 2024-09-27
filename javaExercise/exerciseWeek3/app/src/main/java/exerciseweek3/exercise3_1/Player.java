package exerciseweek3.exercise3_1;

public class Player {
    private String name;
    private Integer points;

    // 1.2. Change the visibility of attributes (name and points) into private and create getters and setters for those attributes.
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getPoints() {
        return points;
    }
    public void setPoints(Integer points) {
        this.points = points;
    }

    //1.1. In your application's main()-method, create one instance of class Player, and print out its member variables into the console.
    public Player (String name, Integer points) {
        this.name = name;
        this.points = points;
    }

    //1.3. Create default constructor for the class, that leaves attributes empty.
    public Player (){
        this.name = "";
        this.points = 0;
    }
    
    //1.4. Add a method play(), which has return value void, no parameters and visibility is public. The method prints out text "Player <name> is now playing". Here <name> means the value of the corresponding member variable. 
    public void play() {
        System.out.println("Player " + name + " is now playing.");
    }

    //1.5
    @Override
    public String toString() {
        return "Player " + name + " has " + points + " points.";
    }
    //void 方法: 执行动作，没有返回值。常用于不需要给调用者返回数据的情况。
    //String 方法: 执行后返回一个字符串。toString() 方法是典型的例子，用于返回对象的字符串表示形式。
    
        
}
    
