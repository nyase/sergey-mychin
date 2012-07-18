package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calck {

    private int one;
    private int two;
    private int result;

    private String read() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        return str;
    }

    public void setOne() throws IOException {
        int x = Integer.parseInt(read());
        this.one = x;

    }

    public void setTwo() throws IOException {

        int x = Integer.parseInt(read());
        this.two = x;

    }

    public int Calc(int result) {
        result = this.one + this.two;
        System.out.println(result);
        return result;
    }
}
