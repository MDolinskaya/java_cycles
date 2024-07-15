package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class HolidayServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/holiday.csv")
    public void holidayDuration(int income, int expenses, int threshold, int expected) {
        HolidayService service = new HolidayService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

}
