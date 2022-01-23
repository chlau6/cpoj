package question;

import java.util.Map;

public class Q1507 {
    public String reformatDate(String date) {
        Map<String, String> month = Map.ofEntries(
                Map.entry("Jan", "01"),
                Map.entry("Feb", "02"),
                Map.entry("Mar", "03"),
                Map.entry("Apr", "04"),
                Map.entry("May", "05"),
                Map.entry("Jun", "06"),
                Map.entry("Jul", "07"),
                Map.entry("Aug", "08"),
                Map.entry("Sep", "09"),
                Map.entry("Oct", "10"),
                Map.entry("Nov", "11"),
                Map.entry("Dec", "12")
        );

        var builder = new StringBuilder();

        if (date.length() == 13) {
            builder.append(date, 9, 13).append('-').append(month.get(date.substring(5, 8))).append('-').append(date, 0, 2);
        } else {
            builder.append(date, 8, 12).append('-').append(month.get(date.substring(4, 7))).append("-0").append(date, 0, 1);
        }

        return builder.toString();
    }
}

/*
1507. Reformat Date
 */
