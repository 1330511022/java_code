package package_CollectionAndMap.Collection.List.ListWork;

import java.util.ArrayList;
import java.util.Collections;

public class PokerMain {
    public static void main(String[] args) {
        ArrayList<Poker> pokers = new ArrayList<>();
        String[] types = {"♥","♠","♣","♦"};
        String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for(String v : values){
            for(String t: types){
                Poker poker = new Poker(v,t);
                pokers.add(poker);
            }
        }
        for(Poker p: pokers){
            System.out.print(p.getType() + p.getValue() + " ");
        }
        System.out.println();
        // 洗牌
        Collections.shuffle(pokers);
        for(Poker p: pokers){
            System.out.print(p.getType() + p.getValue() + " ");
        }
        Person zhangsan = new Person();


    }
}
