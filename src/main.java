public class main {
    public static void main(String[] args) {
        int balance = -100, moneyCredited = 1800;
        balance = balance + moneyCredited;

        int bonusMoney = moneyCredited < 1000 ? 0 : moneyCredited / 100;

        System.out.println("Ваш баланс: " + balance + " зачисенно бонусных рублей " + bonusMoney);
    }

}

