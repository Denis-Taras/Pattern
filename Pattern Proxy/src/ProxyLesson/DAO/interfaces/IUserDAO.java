package ProxyLesson.DAO.interfaces;

import ProxyLesson.domain.User;

public interface IUserDAO {

    User saveUser(User user);
    String getListOfUsers();
    String getUserById(long id);

}
