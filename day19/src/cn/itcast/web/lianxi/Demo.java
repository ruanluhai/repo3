package cn.itcast.web.lianxi;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Demo {
    @Test
    public void test1() {
        Car b = new BigCar();
        Car o = (Car) Proxy.newProxyInstance(b.getClass().getClassLoader(),
                new Class[]{Car.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        method.invoke(b);
                        return null;
                    }
                });
        o.get();
    }
}
