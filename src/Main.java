public class Main {
    public static void main(String[] args) {
        int balance = 200;
        int bonusEvery = 100;
        int refill = 2850;
        int bonus;
        if (refill >= 1000) {
            bonus = refill / bonusEvery;
        } else {
            bonus = 0;
        }

        int result = balance + refill + bonus;
        System.out.println("Ваш текущий баланс: " + result + " рублей");
        System.out.println("Количество бонусных рублей: " + bonus);


        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}