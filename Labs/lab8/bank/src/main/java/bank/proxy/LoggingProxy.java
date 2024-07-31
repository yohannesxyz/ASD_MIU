package bank.proxy;

import bank.dao.IAccountDAO;
import bank.domain.Account;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collection;

public class LoggingProxy implements InvocationHandler {
    private Object target;
    private Log log;

    public LoggingProxy(Object target) {
        this.target = target;
        this.log = new Log();
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.log("Method " + method.getName() + " called on " + target.getClass().getName());
        Object result = method.invoke(target, args);
        log.log("Method " + method.getName() + " returns " + result);
        return result;
    }

}
