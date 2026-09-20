package domain.Hero;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Name {
    private String value;

    public Name(String value) {
        // Create the patterns and conditions
        String pattern_spaces_first_char = "^\\s";
        String pattern_spaces_last_char = "\\s$";
        String pattern_number = "\\d";
        String pattern_special_char = "[^A-Z,a-z]";
        boolean min_length_respected = value.length() >= 2;
        boolean max_length_respected = value.length() <= 30;
        boolean length_respected = min_length_respected && max_length_respected;

        Pattern pattern = Pattern.compile(value, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(
                pattern_number +
                        pattern_spaces_first_char +
                        pattern_spaces_last_char +
                        pattern_special_char
                // TODO: Make something to be sure the name is unique in the system
        );

        if (!matcher.find() && length_respected) {
            this.value = value;
        }
    }

    public String getValue() {
        return value;
    }
}