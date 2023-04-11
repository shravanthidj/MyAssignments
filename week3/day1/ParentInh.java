package week3.day1;

public class ParentInh extends GrandParenInh {

	public void ecrHouse() {
		System.out.println("4bhk ECR house ");
	}
	
	public static void main(String[] args) {
		GrandParenInh gp = new GrandParenInh();
		gp.ownHouse();
		gp.ownLand();
		//single or simple inheritance
		//using parent class obj we can access grandparent properties/methods
		ParentInh pobj = new ParentInh();
		pobj.ecrHouse();
		pobj.ownHouse();
		pobj.ownLand();
	}

}
