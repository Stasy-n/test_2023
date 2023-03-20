package codeWars;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int min =  args[0];
        for (int i = 0; i < args.length; i++) {
            min = Math.min(min, args[i]);
        }
        return min;
    }
}
