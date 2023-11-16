package TaskPro;

import java.util.Scanner;

public class TaskMain {
    public static void main(String[] args) {
        Task counter = new Task(0,0,"stop");
        Scanner scanner = new Scanner(System.in);

        String newInput;
        int newLineCount = counter.getLineCount();
        int newCharacterCount = counter.getCharacterCount();


        System.out.println("Write a text for each row and press Enter");
        System.out.println("Close the program by typing the word \"stop\" ");
        while (counter.getIsValid()) {
            newInput = scanner.nextLine();

            if (newInput.equals("stop")) {
                break;
            }
            newLineCount++;
            newCharacterCount += newInput.length();
        }
        System.out.println("You have typed in " + newLineCount + " rows and " + newCharacterCount + " " +
                "characters excluding your word \"stop\" ");
        scanner.close();
    }
}

