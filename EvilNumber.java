 import java.io.*;

public class EvilNumber
{
    public static void main(String args[])throws IOException
    {
        int num, a, count , c, i;
        int binNum[] = new int[20];
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("Enter a number:");
        num = Integer.parseInt(br.readLine());
        count = 0;  // count the number of 1's
        c = 0;      // for index of array
        while(num!=0)
        {
            a = num % 2;
            binNum[c] = a;
            if(a == 1)
             count++;
            num = num / 2;
            c++;
        }
        System.out.println("Total number of 1 is = " + count);
        // Print the binary number
        for(i=c-1; i>=0 ; i--)
        {
            System.out.print(binNum[i]+" ");
        }
        // Checking the number is Evil or Not
        if(count % 2 == 0)
        {
            System.out.println("\nEntered number is Evil an Number");
        }
        else
        {
            System.out.println("\nEntered number is not an Evil Number");
        }
    }   
}
