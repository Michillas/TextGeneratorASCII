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
        
        generateText(text);

    }

    public static void generateText(String text) {
        TextGenerator textGenerator = new TextGenerator();

        for (char letter : text.toCharArray()) {
            System.out.print(textGenerator.line1(letter));
        }
        System.out.println();
        for (char letter : text.toCharArray()) {
            System.out.print(textGenerator.line2(letter));
        }
        System.out.println();
        for (char letter : text.toCharArray()) {
            System.out.print(textGenerator.line3(letter));
        }
        System.out.println();
        for (char letter : text.toCharArray()) {
            System.out.print(textGenerator.line4(letter));
        }
        System.out.println();
        for (char letter : text.toCharArray()) {
            System.out.print(textGenerator.line5(letter));
        }
        System.out.println();
        for (char letter : text.toCharArray()) {
            System.out.print(textGenerator.line6(letter));
        }
        System.out.println();
    }
}