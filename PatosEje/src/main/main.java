package main;

import duck.DecoyDuck;
import duck.Duck;
import duck.MallardDuck;
import fly.FlyRocketPowered;
import quack.Squeak;

public class main {
    
    public static void main(String[] args) {
        
        Duck duck1 = new MallardDuck();
        duck1.performQuack();

        duck1.updateDuck(new FlyRocketPowered(), new Squeak());
        duck1.performQuack();

        Duck duck2 = new DecoyDuck();
        duck2.performFly();
    
    }
}
