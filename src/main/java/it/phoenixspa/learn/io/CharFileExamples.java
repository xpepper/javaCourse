package it.phoenixspa.learn.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharFileExamples {
    public static void main(String args[]) {
        try {
            FileWriter fileWriter = new FileWriter(args[1]);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            FileReader fileReader = new FileReader(args[0]);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                bufferedWriter.write(line, 0, line.length());
                bufferedWriter.newLine();
                line = bufferedReader.readLine();
            }
            bufferedReader.close(); // si può fare di meglio... come?
            bufferedWriter.close(); // si può fare di meglio... come?

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
