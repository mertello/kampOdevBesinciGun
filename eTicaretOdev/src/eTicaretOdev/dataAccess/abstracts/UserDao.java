package eTicaretOdev.dataAccess.abstracts;
import eTicaretOdev.entities.concrete.User;
import java.util.List;

public interface UserDao {
	void add(User user);
	void remove(User user);
	void update(User user);
	User getId(User user);
	List<User> getAll();
}
