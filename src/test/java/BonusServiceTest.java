import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        //Входные параметры
        long amount = 1000_60;
        boolean registred = true;
        long expected = 30;

        //Вызываемый целевой метод
        long actual = service.calculate(amount, registred);

        //Проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        //Входные параметры
        long amount = 1000_000_60;
        boolean registred = true;
        long expected = 500;

        //Вызываемый целевой метод
        long actual = service.calculate(amount, registred);

        //Проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNoRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        //Входные параметры
        long amount = 1000_60;
        boolean registred = false;
        long expected = 10;

        //Вызываемый целевой метод
        long actual = service.calculate(amount, registred);

        //Проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNoRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        //Входные параметры
        long amount = 5000_000_60;
        boolean registred = false;
        long expected = 500;

        //Вызываемый целевой метод
        long actual = service.calculate(amount, registred);

        //Проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }
}