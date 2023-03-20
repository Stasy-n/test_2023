package codeWars;

class Kata1 {
    public static String countingSheep(int num) {
        //Add your code here
        String s = "";
        if (num!=0){
        for (int i = 1; i <= num; i++) {

             s += i + " sheep...";
        }
        return s;
        }
        else
            return "";
    }
}