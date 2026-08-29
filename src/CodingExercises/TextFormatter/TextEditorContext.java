public class TextEditorContext {
    TextFormatter textFormatter;
    TextEditorContext(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    void setTextFormatter(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    String publishText(String text) {
        return textFormatter.format(text);
    }
}
