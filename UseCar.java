class Car{
    int price;
    void showPrice(){
//        System.out.println("The Price is "+price);
        System.out.println("The Price is "+this.price);
   
    }
}
public class UseCar {

    public static void main(String[] args){
        Car obj = new Car();
        Car obj1 = new Car();
        obj.price=1000;
        obj1.price=2000;
        obj1.showPrice();
        obj1.showPrice();
    }

}
