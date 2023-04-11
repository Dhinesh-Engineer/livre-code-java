import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        Pattern p =Pattern.compile("Dk",Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("dk means dhineshkumar");
        boolean mf = m.find();
        if(mf){
            System.out.println("found");
        }
        else{
            System.out.println("Not found");
        }
    }   
}
