package ProxyLesson;

import ProxyLesson.DAO.UserDAO;
import ProxyLesson.DAO.complicatedProxy.ComplicatedUserDaoProxy;
import ProxyLesson.DAO.interfaces.IUserDAO;
import ProxyLesson.DAO.simpleProxy.SimpleUserDaoProxy;
import ProxyLesson.domain.User;
import ProxyLesson.security.SecurityMode;


public class Main {

    public static void main(String[] args) {
        User user = new User("John Doe", "qwerty123");
        User user2 = new User("Jane Doe", "0123456789");

        /*IUserDAO userDao = new UserDAO();
        SimpleUserDaoProxy simpleUserDaoProxy = new SimpleUserDaoProxy();*/
        IUserDAO complicatedUserDao = new ComplicatedUserDaoProxy().createUserDaoProxy(new UserDAO());

        complicatedUserDao.saveUser(user);
        complicatedUserDao.saveUser(user2);

        /*System.out.println("Saved user: " + savedUser.toString());
        System.out.println("Saved user: " + savedUser2.toString());
        System.out.println();
        System.out.println(userDao.getListOfUsers());
        System.out.println(userDao.getUserById(2l));*/

        /*System.out.println(simpleUserDaoProxy.getUserById(SecurityMode.PROTECTED, 1l));
        System.out.println(simpleUserDaoProxy.getUserById(SecurityMode.FREE, 1l));*/

        System.out.println(complicatedUserDao.getUserById(1l));
        System.out.println(complicatedUserDao.getUserById(2l));
        System.out.println();
        System.out.println(complicatedUserDao.getListOfUsers());
    }
}