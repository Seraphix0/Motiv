public interface IUserRepository {
    void create(User user);
    void remove(int id);
    void update(User user);
    void delete(int id);
}
