/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bykov;

/**
 *
 * @author Bykov
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class chel {

    public String name;
    public int rost;
    public int ves;

    public void name() throws IOException {
        System.out.println("Представся друк");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        name = input.readLine();
        if (name == null) {
            System.out.println("Наебать решил меня");
        }
        
    }

    }

    public void go() {
        System.out.println("Иду " + name);

    }

    public String govorit() {
        return "Hello";

    }

    public void est() {
        System.out.println("Я ем");
    }

    }
