package systematicLearn.Java.homework.Day23;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author lnh
 * @date 2021年07月02日 16:54
 */
public class Test04 {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        transactions.stream()
                .filter(s->s.getYear()==2011)
                .sorted(Comparator.comparingInt(Transaction::getMoney))
                .forEach(System.out::println);

        transactions.stream()
                .map(s->s.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

//        (o1,o2)->o1.getTrader().getName().compareTo(o2.getTrader().getName())
        transactions.stream()
                .filter(s->s.getTrader().getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(o -> o.getTrader().getName()))
                .forEach(System.out::println);

        transactions.stream()
                .map(s->s.getTrader().getName())
                .sorted(String::compareTo)
                .forEach(System.out::println);

        System.out.println(transactions.stream()
                .anyMatch(s -> s.getTrader().getCity().equals("Milan")));

        System.out.println(transactions.stream()
                .filter(s -> s.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getMoney)
                .reduce(Integer::sum));

        System.out.println(transactions.stream()
                .map(Transaction::getMoney)
                .max(Integer::compare));

        System.out.println(transactions.stream()
                .map(Transaction::getMoney)
                .min(Integer::compare));

    }
}
class Trader{
    private String name;
    private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
class Transaction{
    private Trader trader;
    private Integer year;
    private Integer money;

    public Transaction(Trader trader, Integer year, Integer money) {
        this.trader = trader;
        this.year = year;
        this.money = money;
    }

    public Trader getTrader() {
        return trader;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", year=" + year +
                ", money=" + money +
                '}';
    }
}