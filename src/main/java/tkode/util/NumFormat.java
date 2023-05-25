package tkode.util;

import java.text.NumberFormat;
import java.util.Locale;

public class NumFormat {
    public static String priceFormat(double price) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        return formatter.format(price);
    }
}
