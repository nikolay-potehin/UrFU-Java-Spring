package main;

import java.sql.*;

public class DB {
    private final String HOST = "localhost";
    private final String PORT = "8889";
    private final String DB_NAME = "mod4-basedb";
    private final String LOGIN = "root";
    private final String PASS = "root";
    private Connection dbConn = null;

    private Connection getDbConn() throws ClassNotFoundException, SQLException {
        String ConnStr = "jdbc:mysql://" + HOST + ":" + PORT + "/" +DB_NAME;
        Class.forName("com.mysql.cj.jdbc.Driver");

        dbConn = DriverManager.getConnection(ConnStr, LOGIN, PASS);

        return dbConn;
    }

    public void isConnected() throws SQLException, ClassNotFoundException {
        dbConn = getDbConn();
        System.out.println(dbConn.isValid(1000));
    }

    public ResultSet getArtUser() throws SQLException, ClassNotFoundException{
        String sql = "SELECT * FROM users WHERE login='john'";

        Statement statement = getDbConn().createStatement();
        ResultSet resUser = statement.executeQuery(sql);

        return resUser;
    }

    public ResultSet getArtItem() throws SQLException, ClassNotFoundException{
        String sql1 = "SELECT * FROM items WHERE category='hats'";

        Statement statement = getDbConn().createStatement();
        ResultSet resItem = statement.executeQuery(sql1);

        return resItem;
    }

    public void insertArt(String user_id, String item_id) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO orders (user_id, item_id) VALUES (?, ?)";
        PreparedStatement preparedStatement = getDbConn().prepareStatement(sql);

        preparedStatement.setString(1,user_id);
        preparedStatement.setString(2,item_id);

        preparedStatement.executeUpdate();
    }

    public ResultSet getArtOrd() throws SQLException, ClassNotFoundException{
        String sql1 = "SELECT * FROM orders";

        Statement statement = getDbConn().createStatement();
        ResultSet resItem = statement.executeQuery(sql1);

        return resItem;
    }

    public ResultSet getArtUserId(String id) throws SQLException, ClassNotFoundException{
        String sql = "SELECT * FROM users WHERE id="+id;

        Statement statement = getDbConn().createStatement();
        ResultSet resUser = statement.executeQuery(sql);

        return resUser;
    }

    public ResultSet getArtItemId(String id) throws SQLException, ClassNotFoundException{
        String sql1 = "SELECT * FROM items WHERE id="+id;

        Statement statement = getDbConn().createStatement();
        ResultSet resItem = statement.executeQuery(sql1);

        return resItem;
    }
}
