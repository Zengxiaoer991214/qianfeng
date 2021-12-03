package month11.day11;

import java.util.Random;

/**
 * ClassName: Cards
 * Description:
 * date: 2021/11/11 19:16
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Cards {
    private final Card[] cards=new Card[54];

    /**
     * Cards
     * @description:
     *
     * cards[0] 放A，cards[1] - cards[9] 放2，3，4，5，6，7，8，9，10
     * 前十三张 初始化完成，只需要把前十三的花色改变，存入数组即可，
     * 最后放入两张小丑
     * @params []
     * @return  void
     * @author Lilin
     * @date 2021/11/11 19:56
     */
    public Cards() {
        int num = 10;
        cards[0] = new Card("A", "梅花");
        for (int i=1;i<num;i++){
            int j=i+1;
            String str=String.valueOf(j);
            cards[i] = new Card(str, "梅花");
        }
        cards[10] = new Card("J", "梅花");
        cards[11] = new Card("Q", "梅花");
        cards[12] = new Card("K", "梅花");

        for (int i=13;i<26;i++){
            String cardName=cards[i-13].getCardName();
            String cardColor="方块";
            cards[i]=new Card(cardName,cardColor);
        }
        for (int i=26;i<39;i++){
            String cardName=cards[i-13].getCardName();
            String cardColor="红桃";
            cards[i]=new Card(cardName,cardColor);
        }
        for (int i=39;i<52;i++){
            String cardName=cards[i-13].getCardName();
            String cardColor="黑桃";
            cards[i]=new Card(cardName,cardColor);
        }
        cards[52] = new Card("小王","");
        cards[53] = new Card("大王","");
    }
    /**
     * shuffle
     * @description:
     *
     * 洗牌，使用随机数进行洗牌
     *
     * @params []
     * @return void
     * @author Lilin
     * @date 2021/11/11 19:29
     */
    public void shuffle(){
        int shuffleCount = 100;
        for (int i = 0; i < shuffleCount; i++) {
            Random r = new Random();
            int count = 54;
            int m1 = r.nextInt(count);
            Random r2 = new Random();
            int m2 = r2.nextInt(count);
            Card tempCard;
            tempCard = cards[m1];
            cards[m1] = cards[m2];
            cards[m2] = tempCard;
        }
    }
    /**
     * handOutPoker
     * @description:
     *
     * 因为牌的顺序已经是乱序的，所以直接按顺序发牌即可
     *
     * @params []
     * @return void
     * @author Lilin
     * @date 2021/11/11 19:55
     */
    public void handOutPoker(){
        Random r = new Random();
        int playerCount = 3;
        int farmer = r.nextInt(playerCount);
        int cordIndex =0;
        for(int index=0;index<playerCount;index++){
            System.out.format("玩家%d的牌是:",index+1);
            for(int i=0;i<17;i++){
                System.out.format("%5s%s",cards[cordIndex].getCardColor(),cards[cordIndex].getCardName());
                cordIndex++;
            }
            System.out.println();
        }
        System.out.println("地主是"+farmer+"号玩家");
        System.out.print("地主牌是:");
            while (cordIndex <54){
                System.out.format("%5s%s",cards[cordIndex].getCardColor(),cards[cordIndex].getCardName());
                cordIndex++;
            }
    }
}
