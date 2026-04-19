public class Pattern{
    // print hollow rectangle using function
    public static void hollow_rectangle(int totRow, int totCol){
        //outer loop
        for(int i=1; i<=totRow; i++){
            //inner -column
            for(int j=1; j<=totCol; j++){
                if(i==1 || i==totRow || j==1 || j==totCol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(); //for next line
        }

    }

    //function for print inverted or rotated half pyramid
    public static void inverted_half_pyramid(int n){
        for(int i=1; i<=n; i++){
            //for print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");

            }
            //for print stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    //function for inverted half pyramid with numbers
    public static void inverted_half_pyramid_with_number(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //function for floyds triangle
    public static void floyed_triangle(int n){
        //outer loop
        int counter = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }



    public static void main (String args[]){

        
        // for (int i=1; i<=5; i++){
        //     for ( int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println(); //for next line
        // }

        //Inverted Star print
        // int n = 5;
        // for (int line=1; line<=n; line++){
        //     for (int star=1; star<=n-line+1; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println(); //for next line
        // }

        //half pyramid 1 to 5
        // int n = 6;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //print character pattern
        // int n = 5;
        // char ch = 'A';

        //outer loop
        // for(int line=1; line<=n; line++){
        //     //inner loop
        //     for(int chars=1; chars<=line; chars++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }

        //print hollow rectangle
        // hollow_rectangle(4, 5);

        // print inverted_half_pyramid
        // inverted_half_pyramid(5);

        // inverted_half_pyramid_with_number
        // inverted_half_pyramid_with_number(5);

        // floyed_triangle
        floyed_triangle(5);

    }
}
