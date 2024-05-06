import java.util.Scanner;

public class TwoSum {
    public int height;
    public int smallWidth;
    public int bigWidth;
    public double twoSum;

    public TwoSum(int height, int smallWidth, int bigWidth) {
        this.height = height;
        this.smallWidth = smallWidth;
        this.bigWidth = bigWidth;
    }

    @Override
    public String toString() {
        return String.format("%.2f", (double) twoSum);
    }

    public void calculateTwoSum(){
        twoSum = (double)((height * (smallWidth + bigWidth))/2);
    }
}
