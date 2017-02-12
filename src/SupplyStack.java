
public class SupplyStack {
	Card type;
	int quantity;
	
	public SupplyStack(String type, int count){
		this.type=new Card(type);
		quantity=count;
	}
	
	public String getType(){
		return type.cardType;
	}
		
}
