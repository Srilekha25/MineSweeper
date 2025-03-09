import Grid.Grid;

public class Main {
	public static void main(String[] args) {
		try{
		// Generate random mines
		Helper helper = new Helper();
		System.out.println("random - " +helper.generateRandomNumbers().toString());

		Grid grid = new Grid();
		// Start the grid
		grid.initialStartup();

		} catch(Exception e) {
			System.out.println("error" + e);
		}
	}
}
