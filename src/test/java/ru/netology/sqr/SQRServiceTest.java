package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
//import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/range.csv")
    public void testMiddleRange(int expected, int down, int up) {
        SQRService service = new SQRService();
        //int expected = 3;
        int actual = service.numberOfSquares(down, up);
        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void testDownBorder() {
//        SQRService service = new SQRService();
//        int expected = 1;
//        int actual = service.numberOfSquares(99, 101);
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testUpBorder() {
//        SQRService service = new SQRService();
//        int expected = 1;
//        int actual = service.numberOfSquares(9800, 9802);
//        Assertions.assertEquals(expected, actual);
//    }
}