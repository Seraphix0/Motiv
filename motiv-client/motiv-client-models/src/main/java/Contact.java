import com.sun.xml.internal.fastinfoset.util.StringArray;

public class Contact {

    public Contact(int id, int number, int extension, StringArray name, Status status, boolean motivSupport) {
        this.id = id;
        this.number = number;
        this.extension = extension;
        this.name = name;
        this.status = status;
        this.motivSupport = motivSupport;
    }

    private int id;
    private int number; // DID number
    private int extension; // Local extension number
    private StringArray name;
    private Status status;
    private boolean motivSupport; // Support for integrated functionality provided by Motiv.

    private enum Status {
        Available,
        Away,
        Busy,
        DD, // Don't disturb
        OoO // Out-of-office
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

    public StringArray getName() {
        return name;
    }

    public void setName(StringArray name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean getMotivSupport() {
        return motivSupport;
    }

    public void setMotivSupport(boolean motivSupport) {
        this.motivSupport = motivSupport;
    }
}
