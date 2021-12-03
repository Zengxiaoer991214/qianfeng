package month11.day11;

/**
 * ClassName: Card
 * Description:
 * date: 2021/11/11 19:14
 *
 * @author: Lilin
 * @since JDK 1.8
 */
public class Card {
    private String cardName;
    private String cardColor;

    public Card(String cardName, String cardColor) {
        this.cardName = cardName;
        this.cardColor = cardColor;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardColor() {
        return cardColor;
    }

    public void setCardColor(String cardColor) {
        this.cardColor = cardColor;
    }
}
