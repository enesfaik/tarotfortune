package tarotfortune;

public class Destiny {
	private TarotCard top;

	public Destiny()
	{
	top = null;
	}
	
	public boolean isEmpty()
	{
	return (top == null);
	}
	public void initializeStack()
	{
	top = null;
	}
	public void push(TarotCard card)
	{
		card.setLink(top);
	top = card;
	}
	public TarotCard gettop()
	{
	    return top;
	}
	public boolean pop()
	{
	if(isEmpty())
	return false;
	else
	{
	top = top.getLink();
	return true;
	}
	}
	public void showdestiny( )
	{
	TarotCard current = top;
	while (current != null)
	{
	System.out.println(current);
	current = current.getLink( );
	}
	}
	
	
	
	
	
	
	
	
	
}
