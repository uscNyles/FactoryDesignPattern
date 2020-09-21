import java.util.ArrayList;

/**
 * Describes the general shape of cakes and the 
 * steps in making and buying one
 * @author nylesgeiger
 *
 */
public abstract class Cake {

	protected String name;
	protected double price;
	protected int numLayers;
	protected ArrayList<String> decorations;
	protected Shape shape;
	protected String flavor;
	protected String icing;
	
	/**
	 * creating a cake will always create a new ArrayList 
	 * holding its decorations
	 */
	public Cake() {
		decorations = new ArrayList<String>();
	}
	
	/**
	 * creates a cake by creating its layers, frost, and decorations
	 */
	public void createCake() {
		
		this.createLayers();
		this.frostCake();
		this.addDecorations();
	};
	
	/**
	 * Creates a cake based on its number of layers and flavor
	 */
	private void createLayers() {
		
		if (this.shape.toString().toLowerCase() == "cupcakes" 
				|| this.shape.toString().toLowerCase() == "bunt"){
			
			System.out.println("Creating a "+ this.flavor +" " + this.shape);
			
			}else {
				System.out.println("Creating a "+ this.numLayers+" layer "
			+this.shape.toString().toLowerCase()+" "+this.flavor+" cake.");
			}
		}
	
	/**
	 * frosts the cake with its defined icing
	 */
	private void frostCake() {
		System.out.println("Frost cake with " + icing + " icing.");
	};
	
	/**
	 * Adds decorations to the cake which are held in its ArrayLisyt
	 */
	private void addDecorations() {
		for (String decoration: decorations) {
			System.out.println("Adding " + decoration+".");
		}
	};
	
	/**
	 * Returns the cost of the cake
	 * @return
	 * A double value representing the cost of the cake
	 */
	public double getPrice() {
		return price;
	};
	
}
