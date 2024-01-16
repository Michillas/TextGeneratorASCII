package es.michillas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Text:");

        // Texto introducido por el usuario
        String text = reader.readLine();

        TextGenerator textGenerator = new TextGenerator();
        
        textGenerator.generateText(text);

    }
}