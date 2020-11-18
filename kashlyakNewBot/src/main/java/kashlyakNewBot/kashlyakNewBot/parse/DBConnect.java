package kashlyakNewBot.kashlyakNewBot.parse;

import java.sql.*;

public class DBConnect {
    private static final String URL = Loggin.getURL();
    private static final String USERNAME = Loggin.getUSERNAME();
    private static final String PASSWORD = Loggin.getPASSWORD();

    private static final String INSERT_NEW = "insert into msgtable(msg) values(?);";
    private static final String GET_ALL = "select * from msgtable;";


    static {
        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void writeOnDB(String msg) {

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            System.out.println("Соединение с базой данных устнановлено");
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_NEW);

            preparedStatement.setString(1, msg);

            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static String readDB() {

        int id=0;
        String msg="";

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            msg="";
            System.out.println("Соединение с базой данных устнановлено");
            PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                id = resultSet.getInt("id");
               String msag = resultSet.getString("msg");
                String message = id+": "+msag;
                System.out.println(id+msag);
                msg = msg + message +"\n";
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return msg;
    }
}




