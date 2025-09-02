package duck;

import fly.FlyNoWay;
import quack.MuteQuack;

public class DecoyDuck extends Duck {
    
    public DecoyDuck (){
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }
    
    public void display(){
        System.out.println("this is a decoy duck");
    }
}
