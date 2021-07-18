package Examples;

class Parent {
	 String father = "Sathyanathan";
	 String mother = "Vanaja";
	 public void parents () {
		 System.out.println(father + " and " + mother + " are parents");
	 }
}

public class Inheritance_Basics_Parent extends Parent {
	String child1 = "Shobana";
	String child2 = "Savitha";
	public void daughters () {
		System.out.println(child1 + " and " + child2 + " are daughters");
	}
	public static void main(String[] args) {
		Inheritance_Basics_Parent obj = new Inheritance_Basics_Parent ();
		System.out.println(obj.father);
		System.out.println(obj.mother);
		obj.parents();
		System.out.println(obj.child1);
		System.out.println(obj.child2);
		obj.daughters();
	}

}
