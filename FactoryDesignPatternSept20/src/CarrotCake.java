/**
 * Describes the shape and attributes of Carrot Cakes
 * @author nylesgeiger
 *
 */
public class CarrotCake extends Cake {

	public CarrotCake () {
		name = "Carrot Cake";
		price = 54.99;
		numLayers = 2;
		shape = shape.ROUND;
		flavor = "Carrot";
		icing = "Cream Cheese";
		decorations.add("Walnuts");
		decorations.add("Candy Carrots");
	}
}
