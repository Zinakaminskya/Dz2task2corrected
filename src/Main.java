//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int startingScore = 100; //начальная сумма на счёте
        int replenishment = 1100; //сумма пополнения

        int bonus; //сумма бонуса
        if (replenishment > 1000) {
            bonus = (replenishment / 100);
        } else {
            bonus = 0;
        }

        int finalScore = (startingScore + replenishment + bonus);

        System.out.println(bonus);
        System.out.println(finalScore);
    }
}
