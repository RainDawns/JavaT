package systematicLearn.Java.homework.Day13;

import java.util.*;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2021/6/17 10:01<br/>
 *
 * @author lnh<br />
 */
public class Games {
    public static void main(String[] args) {

        List cards=new ArrayList();
        List numbers=new ArrayList();
        List colors=new ArrayList();

        Collections.addAll(colors,"♠","♥","♣","♦");
        Collections.addAll(numbers,"3","4","5","6","7","8","9","10","J","Q","K","A","2");
        int i=0;
        for (Object o:numbers) {
            i++;
            for (Object o1:colors) {
                String o2=(String)o1;
                String o3=(String)o;
                cards.add(new cards(o3,o2,i));
            }
        }

        cards.add(new cards("小王","黑色",14));
        cards.add(new cards("大王","红色",15));

        Collections.shuffle(cards);
        //System.out.println(cards);

        Map players=new HashMap();
        List player1=new ArrayList();
        List player2=new ArrayList();
        List player3=new ArrayList();
        List threecard=new ArrayList();
        players.put("player1",player1);
        players.put("player2",player2);
        players.put("player3",player3);
        players.put("threecard",threecard);
        int j=-1;
        for (Object o: cards) {
            j++;
            if (j<51){
                if (j%3==0){
                    player1.add(o);
                }else if (j%3==1){
                    player2.add(o);
                }else if (j%3==2){
                    player3.add(o);
                }
            }else {
                threecard.add(o);
            }
        }

/*
        for (Object o:
             player1) {
            System.out.println(o);
        }*/
        Comparator com=new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof cards&& o2 instanceof cards){
                    cards c1=(cards) o1;
                    cards c2=(cards) o2;
                    if (c1.getWeight()!=c2.getWeight()){
                        return c1.getWeight()-c2.getWeight();
                    }
                }
                return 0;
            }
        };
        Collections.sort(player1,com);
        Collections.sort(player2,com);
        Collections.sort(player3,com);
        Collections.sort(threecard,com);
        System.out.println(players.entrySet());
       /* for (:
             ) {

        }
*/
    }
}
class cards{
    private String number;
    private String color;
    private  int weight;

    public cards(String number, String color, int weight) {
        this.number = number;
        this.color = color;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    @Override
    public String
    toString() {
        return "cards{" +
                "number='" + number + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}