package miu.edu.race.application;

import miu.edu.race.framework.*;

public class CarDAO implements Observer {
    @Override
    public void update(int speed) {
        System.out.println("CarDAO: Saving car speed :"+speed);
    }
}