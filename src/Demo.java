import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Demo {
    public static void main(String[] args) {
        String target="0953566536747647abc gla475763456354763674367";
        Pattern p=Pattern.compile("(0|91)?[0-9]{10}");
        Pattern p1=Pattern.compile("(0|91)?[0-9]{10}");
        Matcher m=p.matcher(target);
        int ctr=0;
        while(m.find())
        {
            ctr++;
            System.out.println(m.start() + "    " + m.end() + "      "  + m.group());

        }
        System.out.println(ctr);

    }
}
