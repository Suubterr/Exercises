package ObservedPin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.codewars.com/kata/5263c6999e0f40dee200059d/train/java

public class ObservedPin {
    final static String[][] numpadAdjacents = {
            {"0", "8"},
            {"1", "2", "4"},
            {"1", "2", "3", "5"},
            {"2", "3", "6"},
            {"1", "4", "5", "7"},
            {"2", "4", "5", "6","8"},
            {"3", "5", "6", "9"},
            {"4", "7", "8"},
            {"5", "7", "8", "9", "0"},
            {"6", "8", "9"}
    };

    public static List<String> getPINs(String observed) {

        List<String[]> possibleAdjacent = getPossibleAdjacents(observed);

        List<String> result = Arrays.asList(possibleAdjacent.get(0));

        for(int i = 1; i < possibleAdjacent.size(); i++) {
            result = buildCartProd(result, possibleAdjacent.get(i));
        }

        return result;
    }

    public static List<String[]> getPossibleAdjacents(String observed) {
        List<String[]> possibleAdjacents = new ArrayList<String[]>();

        for(String s : observed.split("")) {
            possibleAdjacents.add(numpadAdjacents[Integer.parseInt(s)]);
        }

        return possibleAdjacents;
    }

    public static List<String> buildCartProd(List<String> product, String[] setToInclude) {

        List<String> newProduct = new ArrayList<String>();

        for(String s : setToInclude) {
            for(String k : product) {
                k += s;
                newProduct.add(k);
            }
        }

        return newProduct;
    }
}
