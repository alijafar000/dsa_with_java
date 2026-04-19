public class oops{
        public static void main(String args[]){
            // Pen p1 = new Pen(); //created a new Pen object called p1
            // p1.setColor("Green");
            // System.out.println(p1.color);
            // p1.setTip(5);
            // System.out.println(p1.tip);

            //Access modifier
            BankAccount myAcc = new BankAccount();
            myAcc.username = "alijafar";
            System.out.println(myAcc.username);

            //but can't set or print password
            // myAcc.password = "jafarali";

            //but here we can set pass because of creating function in same class but can't access.
            myAcc.setPassword("hello");

            // System.out.println(myAcc.password);

            //constructor
            // Student s1 = new Student();


            Student s2 = new Student("Hello jafar");
            System.out.println(s2.name);

            //using copy constructor
            Student s1 = new Student();
            s1.name = "Jafar";
            s1.roll = 72;
            s1.password = "abcd";
            s1.marks[0] = 88;
            s1.marks[1] = 80;
            s1.marks[2] = 98;

            //creating a another obj that copy of s1 obj
            Student s3 = new Student(s1);
            s2.password = "xyz";
            s1.marks[2] = 100;
            for(int i=0; i<3; i++){
                System.out.println(s1.marks[i]);
            }




        }
}

//how we can create a blueprint
class Pen{
    //properties
    String color;
    int tip;

    //functions
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

//Example of access modifier
class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}

//constructor
class Student{
    String name;
    int roll;
    String password;
    int marks[];

    //copy constructor it is shallow copy constructor because in another obj the first obj of marks we can update but in deep copy constructor we can't.
    Student (Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll; 
        this.password = s1.password;
        this.marks = s1.marks;
    }

    //creating constructor
    //Also it is a non - parameterized constructor
    Student(){ //function 
    marks = new int[3];
        System.out.println("Constructor is called...");
    }
    
    //parameterized constructor
    Student(String name){
        marks = new int[3];
        this.name = name;
    }
}