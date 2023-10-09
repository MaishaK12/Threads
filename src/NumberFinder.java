
public class NumberFinder extends Thread {

    private int findNum;
    private int startRange;
    private int endRange;

    public NumberFinder(int findNum, int startRange, int endRange) {
        this.findNum = findNum;
        this.startRange = startRange;
        this.endRange = endRange;
    }

    @Override
    public void run() {

        for (int i = startRange; i <= endRange; i++) {
            if (i == findNum) {
                System.out.println("The number is " + findNum);
                System.out.println("Target number " + findNum + " found by " + this.getName());
                return; // Exit thread when number is found
            }
        }
    }

    @Override
    public String toString() {
        return "The number is " + findNum + "\nTarget number " + findNum + " found by " + this.getName();
    }
}
