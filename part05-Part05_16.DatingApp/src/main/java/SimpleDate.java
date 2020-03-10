
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void advance() {
        if (this.day < 30) {
            this.day++;
        } else if (this.day == 30) {
            this.day = 1;
            if (this.month < 12) {
                this.month++;
            } else if (this.month == 12) {
                this.month = 1;
                this.year++;
            }
        }
    }

    public void advance(int howManyDays) {
        int totalDays = this.day + howManyDays;
        int remainingDays = totalDays - 30;

        if (this.day <= 30) {
            this.day += howManyDays;
            if (this.day >= 30) {
                this.day = 1;
                this.day += remainingDays - 1;
                if (this.month < 12) {
                    this.month++;
                } else if (this.month == 12) {
                    this.month = 1;
                    this.year++;
                }
            }
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(day, month, year);
        int totalDays = newDate.day + days;
        int remainingDays = totalDays - 30;

        if (newDate.day <= 30) {
            newDate.day += days;
            if (newDate.day >= 30) {
                newDate.day = 1;
                newDate.day += remainingDays - 1;
                if (newDate.month < 12) {
                    newDate.month++;
                } else if (newDate.month == 12) {
                    newDate.month = 1;
                    newDate.year++;
                }
            }
        }

        return newDate;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
