/**
 * Describes the shape and attributes of a birthday cake
 * @author nylesgeiger
 */
public class BirthdayCake extends Cake {
	
	public BirthdayCake () {
		name = "Birthday Cake";
		price = 109.99;
		numLayers =  1;
		shape = Shape.SHEET;
		flavor = "Funfetti";
		icing = "Vanilla";
		decorations.add("Sprinkles");
		decorations.add("Candy Flowers");
		decorations.add("Icing Writing");
	}
}
