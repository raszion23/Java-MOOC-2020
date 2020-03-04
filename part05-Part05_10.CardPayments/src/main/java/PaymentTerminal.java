
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        double meal = 2.50;
        // increase the amount of cash by the price of an affordable mean and return the change
        double change;
        if (payment >= meal) {
            this.money += payment;
            change = payment - meal;
            this.money -= change;

            this.affordableMeals++;

            return change;
        }
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        return payment;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        double meal = 4.30;
        // increase the amount of cash by the price of a hearty mean and return the change
        double change;
        if (payment >= meal) {
            this.money += payment;
            change = payment - meal;
            this.money -= change;

            this.heartyMeals++;

            return change;
        }
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        double meal = 2.50;
        if (card.balance() >= meal) {
            card.takeMoney(meal);

            this.affordableMeals++;

            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        double meal = 4.30;
        if (card.balance() >= meal) {
            card.takeMoney(meal);

            this.heartyMeals++;

            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
