package ProxyLesson.DAO.simpleProxy;

import ProxyLesson.DAO.UserDAO;
import ProxyLesson.domain.User;
import ProxyLesson.security.SecurityMode;

public class SimpleUserDaoProxy extends UserDAO {

    public SimpleUserDaoProxy() {
        super();
    }

    public User getUserById(SecurityMode mode, long id) {
        String stringUser = super.getUserById(id);
        User user = new User();
        user.setId(id);
        user.setName(stringUser.substring(stringUser.indexOf("name='"), stringUser.indexOf("',")));
        if (mode.equals(SecurityMode.PROTECTED)) {
            user.setPassword("***");
        } else if(mode.equals(SecurityMode.FREE)) {
            user.setPassword(stringUser.substring(stringUser.indexOf("password='"), stringUser.indexOf("'}")));
        } else {
            user.setId(-1);
            user.setName(null);
            user.setPassword(null);
        }
        return user;
    }
}
