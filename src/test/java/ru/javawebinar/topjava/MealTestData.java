package ru.javawebinar.topjava;

import ru.javawebinar.topjava.model.AbstractBaseEntity;
import ru.javawebinar.topjava.model.Meal;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.javawebinar.topjava.model.AbstractBaseEntity.START_SEQ;

public class MealTestData {

    public static final int MEAL_ID_1 = 100002;
    public static final int MEAL_ID_2 = 100003;
    public static final int MEAL_ID_3 = 100004;
    public static final int MEAL_ID_4 = 100005;
    public static final int MEAL_ID_5 = 100006;
    public static final int MEAL_ID_6 = 100007;
    public static final int MEAL_ID_7 = 100008;
    public static final int MEAL_ID_8 = 100009;
    public static final int MEAL_ID_9 = 100010;
    public static final int MEAL_ID_10 = 100011;
    public static final int NOT_FOUND = 15;

    public static final Meal meal1 = new Meal (MEAL_ID_1, LocalDateTime.of(2020, Month.DECEMBER, 19, 10, 0), "Breakfast", 416);
    public static final Meal meal2 = new Meal (MEAL_ID_2, LocalDateTime.of(2021, Month.JULY, 11, 6, 50), "Breakfast", 2128);
    public static final Meal meal3 = new Meal (MEAL_ID_3, LocalDateTime.of(2020, Month.NOVEMBER, 12, 5, 31), "Afternoon snack", 1084);
    public static final Meal meal4 = new Meal (MEAL_ID_4, LocalDateTime.of(2021, Month.APRIL, 15, 7, 37), "Afternoon snack", 1907);
    public static final Meal meal5 = new Meal (MEAL_ID_5, LocalDateTime.of(2021, Month.MARCH, 12, 10, 28), "Breakfast", 637);
    public static final Meal meal6 = new Meal (MEAL_ID_6, LocalDateTime.of(2021, Month.APRIL, 27, 17, 25), "Lunch", 1021);
    public static final Meal meal7 = new Meal (MEAL_ID_7, LocalDateTime.of(2020, Month.NOVEMBER, 6, 20, 52), "Afternoon snack", 1016);
    public static final Meal meal8 = new Meal (MEAL_ID_8, LocalDateTime.of(2021, Month.MARCH, 23, 13, 29), "Lunch", 1488);
    public static final Meal meal9 = new Meal (MEAL_ID_9, LocalDateTime.of(2021, Month.MARCH, 24, 18, 5), "Breakfast", 1885);
    public static final Meal meal10 = new Meal (MEAL_ID_10, LocalDateTime.of(2021, Month.JULY, 31, 5, 1), "Dinner", 1806);



    public static Meal getNew () {
        return new Meal(null, LocalDateTime.of(2021, Month.JUNE, 6, 15, 12, 10), "Dinner", 1553);
    }

    public static Meal getUpdated () {
        Meal updated = new Meal(meal1);
        updated.setDateTime(LocalDateTime.of(2021, Month.APRIL, 10, 15, 1));
        updated.setDescription("Lunch");
        updated.setCalories(420);
        return updated;
    }

    public static void assertMatch(Meal actual, Meal expected) {
        assertThat(actual).usingRecursiveComparison().isEqualTo(expected);
    }

    public static void assertMatch(Iterable<Meal> actual, Meal... expected) {
        assertMatch(actual, Arrays.asList(expected));
    }

    public static void assertMatch(Iterable<Meal> actual, Iterable<Meal> expected) {
        assertThat(actual).usingRecursiveFieldByFieldElementComparator().isEqualTo(expected);
    }
}
