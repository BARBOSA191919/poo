
package poo;

public class ejemplo2 {

    public static void main(String[] args) {

        int h = 0X5002; // hexadecimal
        System.out.println("hexa:" + h);
        int w = 067; // octal
        System.out.println("octal:" + w);
        int bin = 0b1001001; //binary literal, java se 7 and above
        System.out.println("bin" + bin);

        //ARRAY
        int[] myArray = new int[4];
        myArray[0] = 300;
        myArray[1] = 400;
        myArray[2] = 500;
        myArray[3] = 600;
        System.out.println("Element 0 is: " + myArray[0]);
        System.out.println("Element 3 is: " + myArray[10 - 7]);

        int j = 10;
        int b = ++j; // j increment to ll.
// b is set to ll
        System.out.println("b: " + b + " j: " + j);
        int p = 10;
        int g = p++;
        System.out.println("g: " + g + " p " + p);
        p++; // p=p+1;

    }
}

           
        
    
            
        
