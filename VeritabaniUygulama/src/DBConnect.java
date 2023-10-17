import java.sql.*;

public class DBConnect {
    public static final String DB_URL = "jdbc:mysql://localhost/employees";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection connect = null;
        Statement st = null;

        try {
            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            st = connect.createStatement();
            ResultSet resultSet = st.executeQuery("SELECT * FROM employee");
            while (resultSet.next()) {
                System.out.println("ID : " + resultSet.getInt("id"));
                System.out.println("Adı : " + resultSet.getString("name"));
                System.out.println("Pozisyonu : " + resultSet.getString("position"));
                System.out.println("Maaşı : " + resultSet.getInt("salary"));
                System.out.println("#################");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
