package TaskPro;

public class Task {
    private final int lineCount;
    private final int characterCount;
    private final String input;
    private final boolean isValid;

    public Task(int myLineCount, int myCharacterCount, String myInput) {
        lineCount = myLineCount;
        characterCount = myCharacterCount;
        input = myInput;
        isValid = true;
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getCharacterCount() {
        return characterCount;
    }
    public String getInput() {
        return input;
    }
    public boolean getIsValid() {
        return isValid;
    }
}


