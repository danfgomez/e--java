public class If_else {
    public static void main(String args[]){
        int num = 25000;
        if (num < 100 && num >= 10){
            System.out.println("It's a two digit number");
        } else if (num < 1000 && num >= 100) {
            System.out.println("It's a three digit number");
        } else if (num < 10000 && num >= 1000) {
            System.out.println("It's a four digit number");
        } else if (num < 100000 && num >= 100000){
            System.out.println("It's a five digit number");
        } else {
            System.out.println("number is not between 1 & 99999");
        }
    }
}
