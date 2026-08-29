/**
Design Text Formatter Class
easy
Build a text formatting system where different strategies format text in different ways. The TextEditor context should 
allow swapping formatters at runtime, so the same editor can produce uppercase, lowercase, or title case output 
depending on the active strategy.

Requirements:

Strategy interface: TextFormatter with a method format(text) that returns a formatted string
Concrete strategies: UpperCaseFormatter, LowerCaseFormatter, TitleCaseFormatter
Context: TextEditor with setFormatter() to swap strategies and publishText() to format and print text
 */



public class App {
    public static void main(String[] args) {
        TextFormatter upperCaseFormatter = new UpperCaseFormatter();
        TextFormatter lowerCaseFormatter = new LowerCaseFormatter();
        TextFormatter titleCaseFormatter = new TitleCaseFormatter();
        TextEditorContext textEditor = new TextEditorContext(upperCaseFormatter);
        System.out.println(textEditor.publishText("hello world"));

        textEditor.setTextFormatter(lowerCaseFormatter);
        System.out.println(textEditor.publishText("hello world"));
        
        textEditor.setTextFormatter(titleCaseFormatter);
        System.out.println(textEditor.publishText("hello world"));
    }
}
