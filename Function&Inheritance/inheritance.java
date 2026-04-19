import java.util.*;
public class inheritance{
    public static void main(String args[]){
        // Fish shark = new Fish();
        // shark.eat();

        //obj of multi-level inheritance
        // Dog shera = new Dog();
        // shera.eat();
        // shera.legs = 4;
        // System.out.println(shera.legs);

        //obj of hybrid inheritance
        // Shark sh = new Shark();
        // sh.weight();

        // Bird bd = new Bird();
        // bd.color = "Black";
        // System.out.println(bd.color);

        //Method overloading
        Calculator cal = new Calculator();
        System.out.println(cal.sum(2,5));
        System.out.println(cal.sum((float)2.5,(float)5.5));
        System.out.println(cal.sum(2,5,6));

        //Method overriding
        // Deer d = new Deer();
        // d.eat();

        //Abstract class
        Horse h = new Horse();
        h.eat();
        h.walk();

        Hen hen = new Hen();
        hen.eat();
        hen.walk();

        //Interfaces
        Queen q = new Queen();
        q.moves();

        //Static keyword
        Student s1 = new Student();
        s1.schoolName = "SGM";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "SSGM";



    }
    //inheritance / single level inheritance
    //Base class
    static class Animal{
        String color;

        void eat(){
            System.out.println("Eating");
        }
        void breathe(){
            System.out.println("Breathing");
        }
    }

    //derived class
//    static class Fish extends Animal{
//         int fins;

//         void swims(){
//             System.out.println("Swimming");
//         }
//     }

//multi- level inheritance
    //   static class Mammel extends Animal{
    //     int legs;
    //   }  
    //   static class Dog extends Mammel{
    //     int breed;
    //   }

    //hybrid inheritance
    static class Fish extends Animal{
        int fins;

        void swim(){
            System.out.println("Fish can Swim");
        }
    }

    static class Bird extends Animal{
        void fly(){
            System.out.println("Bird can fly");
        }
    }

    static class Shark extends Fish{
        void weight(){
            System.out.println("Weight of shark is 20000kg.");
        }
    }

    //Compile time polymorphism (Method/function overloading)

    static class Calculator{
        int sum(int a, int b){
            return a + b;
        }

        float sum(float a, float b){
            return a + b;
        }

        int sum(int a, int b, int c){
            return a + b + c;
        }
    }

    //run time polymorphism (method overriding)
    // static class Animals{
    //     void eat(){
    //         System.out.println("Eat anything");
    //     }
    // }
    // static class Deer extends Animals{
    //     void eat(){
    //         System.out.println("Eat grass");
    //     }
    // }

    //Abstract class
    static abstract class Animals{
        void eat(){
            System.out.println("Animal can eat.");
        }

        abstract void walk();
    }

    static class Horse extends Animals{
        void walk(){
            System.out.println("Horse walk on 4 legs");
        }
    }

    static class Hen extends Animals{
        void walk(){
            System.out.println("Hen walk on 2 legs.");
        }
    }

    //Interfaces

    interface chessPlayer{
        void moves();
    }

    static class Queen implements chessPlayer{
        public void moves(){
            System.out.println("up, down, left, right, moves in 4 diagonal direction");
        }
    }
    static class Rook implements chessPlayer{
        public void moves(){
            System.out.println("up, down, left, right");
        }
    }
    static class king implements chessPlayer{
        public void moves(){
            System.out.println("up, down, left, right, moves in 1 step diagonal direction");
        }
    }

    //static keyword
    static class Student{
        //creating static fn
        static int returnPercentage(int phy, int chem, int bio){
            return (phy + chem + bio) / 3;
        }

        String name;
        int roll;

        static String schoolName;

        void setName(String name){
            this.name = name;
        }

        String getName(){
            return this.name;
        }
    }
    
    

}