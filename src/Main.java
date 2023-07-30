public class Main {
    public static void main(String[] args) {
        int startAmount = 159; // начальный баланс
        int rechargeAmount = 1600; // сумма пополнения
        int totalAmount = startAmount + rechargeAmount; // итоговый баланс
        int bonus;
        if (totalAmount >= 1000) {
            bonus = totalAmount / 100;
        } else {
            bonus = 0;
        }
        System.out.println((totalAmount) + " Баланс");
        System.out.println((bonus) + " Бонусы");

    }
}