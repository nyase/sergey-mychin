package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calck {

    private int one;
    private int two;
    private int result;
    private String znak;

    private String read() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        return str;
    }

    public void setOne() throws IOException {
        System.out.println("Введите первое число");
        int x = Integer.parseInt(read());
        this.one = x;
    }

    public void setTwo() throws IOException {
        System.out.println("Введите второе число");
        int x = Integer.parseInt(read());
        this.two = x;
    }

    public int Calc(int result) {

        if ("+".equals(znak)) {
            result = this.one + this.two;
        } else if ("-".equals(znak)) {
            result = this.one - this.two;
        } else if ("*".equals(znak)) {
            result = this.one * this.two;
        } else if ("/".equals(znak)) {
            result = this.one / this.two;
        }

        System.out.println(result);
        return result;
    }

    public void setZnak() throws IOException {
        boolean i = true;
        while (i == true) {
            System.out.println("Введите необходимый оператор");
            String z = read();
            if (!"-".equals(z) || !"+".equals(z) || !"*".equals(z) || !"/".equals(z)) {
                System.out.println("Это не оператор!!!");
            } else {
                this.znak = z;
                i = false;
            }
        }

    }
}
