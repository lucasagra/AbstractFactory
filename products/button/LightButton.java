package products.button;

public class LightButton implements Button {
    public void doSomething(){
        System.out.println("Button clicked!");
    }
    public void getColor(){
        System.out.println("This button is light colored");
    }
}
