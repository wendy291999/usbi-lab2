import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Physicist 
{
    public static void main(String[] args)
    throws IOException
    {
        Physicist physicist = new Physicist();

        System.out.println(physicist.inEquilibrium());
    }

    public String inEquilibrium()
    throws IOException
    {
        int n = 0;
        int x = 0, y = 0, z = 0;
        String[] input = new String[3];

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("n: ");
        n = Integer.parseInt(in.readLine());

        for(; n != 0; n--)
        {
            System.out.print("Vector: ");
            input = in.readLine().split(" ");
            x += Integer.parseInt(input[0]);
            y += Integer.parseInt(input[1]);
            z += Integer.parseInt(input[2]);
        }

        if(x + y + z != 0)
        {
            return "NO";
        }

        return "YES";
    }
}