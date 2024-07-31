package bank.proxy;

import bank.domain.Account;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StopWatchProxy implements InvocationHandler {
    private Object target;

    public StopWatchProxy(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.nanoTime();
        Object result = method.invoke(target, args);
        long stop = System.nanoTime();
        System.out.println("Execution of " + method.getName() + " took " + (stop - start) + " ns");
        return result;
    }

}
