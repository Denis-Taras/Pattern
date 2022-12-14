package ProxyLesson.DAO;

import ProxyLesson.DAO.complicatedProxy.annotations.RequestProxy;
import ProxyLesson.DAO.interfaces.IUserDAO;
import ProxyLesson.domain.User;

import java.io.*;

public class UserDAO implements IUserDAO {
    private File fileDb;
    private FileWriter fileWriter;
    private long idCounter;

    public UserDAO() {
        fileDb = new File("src/ProxyLesson/DB/UserDB.txt");
        this.idCounter = 0l;
        try {
            this.fileWriter = new FileWriter(fileDb);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public User saveUser(User user) {
        user.setId(++idCounter);
        try {
            fileWriter.write(user.toString() + "\n");
            fileWriter.flush();
            return user;
        } catch (IOException ex) {
            System.out.println("Problems with creating fileWriter");
        }
        return null;
    }

    @Override
    public String getListOfUsers() {
        try {
            FileReader fileReader = new FileReader(fileDb);
            char[] buf = new char[1024];
            fileReader.read(buf);
            fileReader.close();
            return new String(buf);
        } catch (IOException ex) {
            System.out.println("Problems with creating fileReader");
        }
        return "";
    }

    @Override
    @RequestProxy
    public String getUserById(long id) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileDb));
            String line = bufferedReader.readLine();
            while (line != null) {
                if(line.startsWith("User{id=" + id)) {
                    return line;
                }
                line = bufferedReader.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return "User with id=" + id + " wasn't found";
    }
}
