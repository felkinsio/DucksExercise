package duck;

import fly.FlyBehavior;
import fly.FlyWithWings;
import quack.Quack;
import quack.QuackBehavior;

public class MallardDuck extends Duck {
    
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public MallardDuck (){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    public updateMallardDuck(MallardDuck mallardDuck, FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        mallardDuck.flyBehavior = 
    }
    
    public void display(){
        System.out.println("this is a mallard duck");
    }
}
