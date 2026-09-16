package task.com.banking.system;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service

public class UserService {
    private final List<User> userList = new ArrayList<>();

    public List<User> getAllUsers() {
        return userList;
    }
    public User addUser(User user) {
        userList.add(user);
        return user;
    }
    public User replaceUser(String id, User newData) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId().equals(id)) {
                newData.setId(id);
                userList.set(i, newData);
                return newData;
            }
        }
        return null;
    }
    public String deleteUser(String id) {
        boolean removed = userList.removeIf(user -> user.getId().equals(id));
        return removed ? "User deleted successfully" : "User not found";
    }
    
}
