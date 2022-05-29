package tarotfortune;

public class Carddeck {
	private TarotCard root;
	private int size;
	public Carddeck() {

		this.root = null;
		this.size = 0;
	}
	
	public int getSize() {
		return size;
	}
	public TarotCard getRoot() {
		return root;
	}
	public boolean insert(TarotCard card) {
		if(root!=null){
			TarotCard parent=null;
			TarotCard current=root;
			while(current!=null) {
				if(card.getCard_number()<current.getCard_number()) {
					parent=current;
					current=current.getLeftcard();
				}
				else if(card.getCard_number()>current.getCard_number()) {
					parent=current;
					current=current.getRightcard();
				}
				else {
					return false;
				}
			}
			if(card.getCard_number()<parent.getCard_number()) {
				parent.setLeftcard(card);
			}
			else {
				parent.setRightcard(card);
			}


		}
		if (root==null) {
			root=card;}

		size++;
		return true;
	}
	public void inorder(TarotCard root)
	{
	if (root == null)
	return;
	inorder(root.getLeftcard());
	System.out.println(root);
	System.out.println();
	inorder(root.getRightcard());
	}
	public TarotCard search(int number) {
		TarotCard current = root; 
		while (current != null) {
		if (number < current.getCard_number())
		current = current.getLeftcard();
		else if (number > current.getCard_number())
		current = current.getRightcard();
		else 
		return current;
		}
		return null;
		}
}
