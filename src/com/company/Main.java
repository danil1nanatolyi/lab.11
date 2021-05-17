package com.company;
import java.io.*;
public class Main {
//System.out.println("")
    public static void main(String[] args)  throws IOException {
        try (FileWriter writer = new FileWriter("f.txt", false)) {
            BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
            int text = 3;
            for (int i = 1; i <= 9; i++) {
                i*=1.5;
                writer.write(i);
                out.write(i);
            }

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
    }



