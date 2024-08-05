package miu.edu.race.application;

import miu.edu.race.framework.*;

public class Medium extends CarState {
    public Medium(Car car) {
        super(car);
    }
    @Override
    public int goFaster(int speed) {
        if (speed < 80)
            return 2;
        else{
            car.setState(new Fast(car));
            return 3;
        }
    }

    @Override
    public int goSlower(int speed) {
        if (speed > 40)
            return 2;
        else{
            car.setState(new Slow(car));
            return 1;
        }
    }
}
