import com.sun.xml.internal.fastinfoset.util.StringArray;

public class User {

    public User(int id) {
        this.id = id;
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
