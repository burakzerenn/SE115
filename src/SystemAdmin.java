public class SystemAdmin {//Classes created for the information of the system administrator.
    //Attributes,
    private double password;
    private int id;
    //methods,
    public double getPassword() {
        return password;
    }

    public void setPassword(double _password) {
        this.password = _password;
    }
    //Password required for admin to login.

    public int getId() {
        return id;
    }

    public void setId(int _id) {
        this.id = _id;
    }
    //Id required for admin to login.
}
