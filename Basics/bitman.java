public class bitman{
    //check number is odd or even
    public static void oddOrEven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println(n + " is even number");
        }else{
            System.out.println(n + " is odd number");
        }
    }

    //geth ith postion 
    public static int getIthBit(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    //check if a number is power of 2 or not
    public static boolean powerOfTwo(int n){
        return (n&(n-1)) == 0;
    }

    //count no. of set bits
    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){ //Check LSB
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    //calculating fast exponential
    public static int fastExpo(int a, int n){
        int ans = 1;
        while(n > 0){
            if((n & 1) != 0){
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String args[]){
        // //Bit manipulation
        // //Binary AND
        // System.out.println((5&6));
        // //Binary OR
        // System.out.println((5|6));
        // //Binary XOR
        // System.out.println((5^6));
        // //Binary One's/NOT
        // System.out.println((~6));
        // //Binary Left shift
        // System.out.println((5<<2));
        // //Binary Right shift
        // System.out.println((6>>1));

        // oddOrEven(3);
        // oddOrEven(10);

       System.out.println(getIthBit(10, 3));
       System.out.println(powerOfTwo(16));
       System.out.println(countSetBits(10));
       System.out.println(fastExpo(10, 4));



    }
}