/**
 * Describes the shape of Black Forest Cakes
 * @author nylesgeiger
 */
public class BlackForestCake extends Cake {
	
	public BlackForestCake () {
		name = "Black Forest Cake";
		price = 47.99;
		numLayers = 3;
		shape = Shape.ROUND;
		flavor = "Black Forest";
		icing = "Whipped Cream";
		decorations.add("Cherries");
		decorations.add("Whipped Cream");
	}
}
