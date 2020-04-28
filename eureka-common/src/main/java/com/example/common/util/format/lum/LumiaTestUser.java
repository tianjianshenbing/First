package format.lum;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class LumiaTestUser {
    /**
     * @Author : xianzhiyong
     * @Description :
     * @Date 2020/4/26 18:03
     * @Param  "Cambridge" 剑桥
     * @Return
     * @Exception
     */
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
        //2011或2012 个人情况
       /* List<Transaction> list = transactions.stream()
                .filter(transaction -> transaction.getYear()==2012)
                .collect(toList());
        System.out.println(list);*/

        //有哪些城市
        List<String> cities =
                transactions.stream()
                        .map(transaction -> transaction.getTrader().getCity())
                        .distinct()
                        .collect(toList());
        System.out.println("test 2 :"+cities);


        /*List<Transaction> list = transactions.stream().
                filter(transaction -> transaction.getValue()==1000).
                sorted(comparing(Transaction::getValue))
                .collect(toList());
        System.out.println(list);*/

        /*List<Trader> list = transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity()=="Cambridge")
                .sorted(comparing(Trader::getName))
                .collect(toList());
        System.out.println(list);*/
    }
}
