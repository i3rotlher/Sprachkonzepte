package Aufgabe_1;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringFormatErkenner {
    public static String arg_idx = "([1-9][0-9]*\\$)?";
    public static String conversion = "([bBhHsScCdoxXeEfgGaA%n]{1})";
    public static String datetimeConversion = "((t|T)[HIklMSLNpzZsQBbhAaCYyjmdeRTrDFc]{1})";
    public static String flags = "[-#+ 0,(]*";
    public static String width =  "([1-9][0-9]*)?";
    public static String precision = "(\\.\\d+)?";

    public static String format =
            "(%" + arg_idx + flags + width + precision + "(" + conversion + "|" + datetimeConversion + ")" + ")+";


    public static void main(String[]  args) {
        if (args.length != 1) {
            System.out.println("Aufruf: java FormatFinder 'STRING'\nPS: Die einfachen Anfuehrungszeichen sind wichtig weil Dollar *Thumbs up*");
            System.exit(1);
        }
        String input = args[0];
        Pattern p = Pattern.compile(format);
        Matcher m = p.matcher(input);

        String res = "";
        int textStart = 0;

        while(m.find()) {
            if(m.start() != textStart) {
                res = res + "TEXT(" + input.substring(textStart, m.start()) + ")";
            }
            res = res + "FORMAT(" + m.group() + ")";
            textStart = m.end();

        }

        if (textStart != input.length()) {
            res = res + "TEXT(" + input.substring(textStart) + ")";
        }
        System.out.println(res);

    }
}