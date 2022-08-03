package ProxyLesson.DAO.complicatedProxy;

import ProxyLesson.DAO.UserDAO;
import ProxyLesson.DAO.complicatedProxy.annotations.RequestProxy;
import ProxyLesson.DAO.interfaces.IUserDAO;
import ProxyLesson.domain.User;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.stream.Stream;

public class ComplicatedUserDaoProxy {
    
    public ComplicatedUserDaoProxy() {
        super();
    }

    public IUserDAO createUserDaoProxy(IUserDAO userDAO) {
        return (IUserDAO) Proxy.newProxyInstance(UserDAO.class.getClassLoader(), new Class<?>[]{
                IUserDAO.class
        }, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if(needProxy(method)) {
                    return proxyMethod(proxy, method, args);
                } else {
                    return method.invoke(userDAO, args);
                }
            }
            private boolean needProxy(Method method) {
                try {
                    Method userDaoMethod = userDAO.getClass().getMethod(method.getName(), method.getParameterTypes());
                    return Stream.of(userDaoMethod.getAnnotations()).anyMatch(annotation -> annotation.annotationType().equals(RequestProxy.class));
                } catch (NoSuchMethodException | SecurityException ex) {
                    throw new RuntimeException();
                }
            }

            private Object proxyMethod(Object proxy, Method method, Object[] args) {
                try {
                    String stringUser = (String) method.invoke(userDAO, args);
                    User user = new User();
                    user.setId((Long) args[0]);
                    user.setName(stringUser.substring(stringUser.indexOf("name='"), stringUser.indexOf("',")));
                    user.setPassword("***");
                    return user.toString();
                } catch (InvocationTargetException | IllegalAccessException e) {
                    throw new RuntimeException();
                }
            }
        });
    }
}