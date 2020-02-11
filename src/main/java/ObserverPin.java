import java.util.ArrayList;
import java.util.List;

//https://www.codewars.com/kata/5263c6999e0f40dee200059d/train/java

public class ObserverPin {
    final String[] one = {"1","2","4"};
    final String[] two = {"1","2","3","5"};
    final String[] three = {"2","3","6"};
    final String[] four = {"1","4","5","7"};
    final String[] five = {"2","4","5","6"};
    final String[] six = {"3","5","6","9"};
    final String[] seven = {"4","7","8"};
    final String[] eight = {"5","7","8","9","0"};
    final String[] nine = {"6","8","9"};
    final String[] zero = {"0","8"};

    public static List<String> getPINs(String observed) {

        List<String> result = new ArrayList<String>();

        String[] observedList = observed.split("");

        for(String n : observedList) {
            StringBuffer sb = new StringBuffer();

            switch(Integer.parseInt(n)) {
                case 1:

            }
        }

        return result;
    }
}
