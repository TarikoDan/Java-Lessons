package date;

public enum ZodiacSigns {
    CAPRICORN(21),      /* Козеріг*/
    AQUARIUS(20),       /* Водолій*/
    PISCES(20)     ,    /* Риби*/
    ARIES(20),          /* Овен*/
    TAURUS(20),         /* Тілець*/
    GEMINI(20),         /* Близнюки*/
    CANCER(21),         /* Рак*/
    LEO(22),            /* Лев*/
    VIRGO(23),          /* Діви*/
    LIBRA(23),          /* Терези*/
    SCORPIO(23),        /* Скорпіон*/
    SAGITTARIUS(23)     /* Стрілець*/;

    public int changeDate;

    ZodiacSigns() {
    }
    ZodiacSigns(int changeDate) {
        this.changeDate = changeDate;
    }

}
