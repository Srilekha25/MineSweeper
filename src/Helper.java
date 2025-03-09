
import java.util.ArrayList;
import java.util.List;

public class Helper {
    public List<Integer> generateRandomNumbers() {
        List<Integer> randomNumbers = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            int rand = (int)(Math.random() * 100);
            if(!randomNumbers.contains(rand)) {
                randomNumbers.add(rand);
            }
        }
        return randomNumbers;
    }
}