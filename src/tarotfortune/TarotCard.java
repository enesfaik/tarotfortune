package tarotfortune;

public class TarotCard {
private int card_number;
private String card_name;
private String card_meaning;
private TarotCard leftcard;
private TarotCard rightcard;
private TarotCard link;
public TarotCard() {
	this.card_number = 0;
	this.card_name = null;
	this.card_meaning =null;
	this.leftcard = null;
	this.rightcard =null;
	this.link=null;
}
public int getCard_number() {
	return card_number;
}
public void setCard_number(int card_number) {
	this.card_number = card_number;
}
public String getCard_name() {
	return card_name;
}
public void setCard_name(String card_name) {
	this.card_name = card_name;
}
public String getCard_meaning() {
	return card_meaning;
}
public void setCard_meaning(String card_meaning) {
	this.card_meaning = card_meaning;
}
public TarotCard getLeftcard() {
	return leftcard;
}
public void setLeftcard(TarotCard leftcard) {
	this.leftcard = leftcard;
}
public TarotCard getRightcard() {
	return rightcard;
}
public void setRightcard(TarotCard rightcard) {
	this.rightcard = rightcard;
}
@Override
public String toString() {
	return "One of your card is: " + card_name + " and the meaning of this card says:" + card_meaning ;
}
public TarotCard getLink() {
	return link;
}
public void setLink(TarotCard link) {
	this.link = link;
}

}
