
/**
 * Takes in user information to determine which cake should be created.
 * The factory design.
 * @author Nyles Geiger
 *
 */
public class Bakery {

	/**
	 * Takes in string of the type of cake and creates that cake
	 * @param type
	 * string representation of the name of the type of cake
	 * @return
	 * a null value
	 */
	public Cake orderCake(String type) {
		this.createCake(type).createCake();
		System.out.println(this.createCake(type).price);
		return null;
	}
	
	/**
	 * determines the type of cake should be created
	 * @param type
	 * the string representation of what cake should to be created
	 * @return
	 * a type of cake representing the value of type
	 */
	private Cake createCake(String type) {
		
		if (type == "carrot cake") {
			return new CarrotCake();
		}else if (type == "black forest cake") {
			return new BlackForestCake();
		}else if (type == "birthday cake") {
			return new BirthdayCake();
		}else return new CarrotCake();
		
	}
}
