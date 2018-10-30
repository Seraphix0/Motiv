public class UserRepository implements IUserRepository {
    private static IUserContext userContext;

    public UserRepository(IUserContext userContext) {
        this.userContext = userContext;
    }

    public void create(User user) {

    }

    public void remove(int id) {

    }

    public void update(User user) {

    }

    public void delete(int id) {

    }
}
