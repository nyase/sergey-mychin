package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calck {

    private int one;
    private int two;
    private int result;

    public void setOne() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        int x = Integer.parseInt(str);
        this.one = x;
//        System.out.println(one);
    }

    public void setTwo() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        int x = Integer.parseInt(str);
        this.two = x;
//        System.out.println(two);
    }

    public int Calc(int result) {
        result = this.one + this.two;
        System.out.println(result);
        return result;
    }
}
