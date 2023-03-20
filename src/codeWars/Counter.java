package codeWars;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        int count = 0;
        if(arrayOfSheeps!= null) {
            for (int i = 0; i < arrayOfSheeps.length; i++) {

                if(arrayOfSheeps[i]) {
                    count += 1;
                }

            }
            return count;
        }
        else
            return 1;

    }
}