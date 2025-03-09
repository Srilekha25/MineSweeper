package Grid;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Grid {
	public void createInitialGrid() {
		int[][] rowsAndColumns = new int[10][10];
        List<String> allIntegers = new LinkedList();

		for(int i = 0; i < rowsAndColumns.length; i++) {
			for(int j=0; j<rowsAndColumns.length;j++) {
				System.out.print(i+""+j + " ");
                allIntegers.add(i+""+j);
			}
			System.out.println();
		}
	}

	public void initialStartup() {
		System.out.println("Welcome to Minesweeper. Would you like to start the game? (y/n)");
		System.out.println("-----------------------------------------------------------------");
		
            try (Scanner getConsentToStartGame = new Scanner(System.in)) {
                String yesOrNoConsent = getConsentToStartGame.nextLine().trim();
                
                if(yesOrNoConsent.equalsIgnoreCase("y")) {
                    createInitialGrid();
                } else {
                    System.out.println("See you next time!");
                }
            }
	}	
}