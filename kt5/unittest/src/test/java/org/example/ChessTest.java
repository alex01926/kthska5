package org.example;

import java.sql.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ChessTest {

    @Test
    public void testAll() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/KT5";
        String user = "postgres";
        String password = "1";
        Connection connection = DriverManager.getConnection(url, user, password);

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM chess");

        while (resultSet.next()) {
            int kingX = resultSet.getInt("kingX");
            int kingY = resultSet.getInt("kingY");
            int rook1X = resultSet.getInt("rook1X");
            int rook1Y = resultSet.getInt("rook1Y");
            int rook2X = resultSet.getInt("rook2X");
            int rook2Y = resultSet.getInt("rook2Y");
            int rook3X = resultSet.getInt("rook3x");
            int rook3Y = resultSet.getInt("rook3Y");
            String result = resultSet.getString("result");
            Assertions.assertEquals(Chess.solve(kingX, kingY, rook1X, rook1Y, rook2X, rook2Y, rook3X, rook3Y), result);
        }

        connection.close();
    }
}


