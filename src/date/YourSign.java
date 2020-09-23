package date;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class YourSign {
    List<ZodiacSigns> signs = new ArrayList<>(Arrays.asList(
        ZodiacSigns.CAPRICORN,
        ZodiacSigns.AQUARIUS,
        ZodiacSigns.PISCES,
        ZodiacSigns.ARIES,
        ZodiacSigns.TAURUS,
        ZodiacSigns.GEMINI,
        ZodiacSigns.CANCER,
        ZodiacSigns.LEO,
        ZodiacSigns.VIRGO,
        ZodiacSigns.LIBRA,
        ZodiacSigns.SCORPIO,
        ZodiacSigns.SAGITTARIUS
    ));

    int[] dates = {
            ZodiacSigns.CAPRICORN.changeDate,
            ZodiacSigns.AQUARIUS.changeDate,
            ZodiacSigns.PISCES.changeDate,
            ZodiacSigns.ARIES.changeDate,
            ZodiacSigns.TAURUS.changeDate,
            ZodiacSigns.GEMINI.changeDate,
            ZodiacSigns.CANCER.changeDate,
            ZodiacSigns.LEO.changeDate,
            ZodiacSigns.VIRGO.changeDate,
            ZodiacSigns.LIBRA.changeDate,
            ZodiacSigns.SCORPIO.changeDate,
            ZodiacSigns.SAGITTARIUS.changeDate
    };
    public ZodiacSigns getSign(int month, int day) {
        ZodiacSigns sign;
        if (day < dates[month - 1]) {
            sign = signs.get(month - 1);
        }else {
            if (month == 12) {month = 0;}
            sign = signs.get(month);
        }
        return sign;
    }
}
