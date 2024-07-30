import org.apache.commons.text.WordUtils;

public class Example {
    public static void main(String[] args) {
        String input = "this is a sample text";

        // Capitalize each word
        String capitalized = WordUtils.capitalize(input);
        System.out.println(capitalized); // Output: This Is A Sample Text

        // Wrap the text at a specified width
        String wrappedText = WordUtils.wrap(input, 10);
        System.out.println(wrappedText);
        // Output:
        // this is a
        // sample text
    }
}
