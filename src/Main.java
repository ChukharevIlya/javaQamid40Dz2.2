import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int balance = 100; // текущий баланс счета
        int refill = 2499; // сумма, на которую пополнили баланс
        int min = 100; // минимальное количество рублей для получения 1 бонуса
        int bonus;
        if (refill >= 1_000) {
            bonus = refill / min;
        } else {
            bonus = 0;
        }
        int finalBalance = balance + refill + bonus; // итоговый баланс с учетом пополнения и бонусов
        System.out.println("Баланс Вашего счета составляет " + finalBalance + " рубля(ей). Из них бонусных рублей " + bonus);
    }
}
