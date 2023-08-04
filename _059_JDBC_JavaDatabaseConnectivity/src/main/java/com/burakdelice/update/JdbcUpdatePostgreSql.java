package com.burakdelice.update;

import java.sql.*;

    public class JdbcUpdatePostgreSql {

        static final String DB_DRIVER_CLASS_NAME = "org.postgresql.Driver";
        static final String DB_URL = "jdbc:postgresql://localhost:5432/musteriDB";
        static final String USERNAME = "postgres";
        static final String PASSWORD = "123456789";
        static final String QUERY_SELECT_MUSTERI_ALL = "SELECT * FROM tblmusteri";
        static final String QUERY_UPDATE_MUSTERI_BY_ID = "UPDATE public.tblmusteri " +
                "SET " +
                "ad='Ali', " +
                "soyadi='Güneş', " +
                "aciklama='ali123@gmail.com' " +
                "WHERE id=1;";

        public static void main(String[] args) throws SQLException {

            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;

            try {
                Class.forName(DB_DRIVER_CLASS_NAME);
                connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

                statement = connection.createStatement();
                statement.executeUpdate(QUERY_UPDATE_MUSTERI_BY_ID);
                resultSet = statement.executeQuery(QUERY_SELECT_MUSTERI_ALL);

                while (resultSet.next()) {
                    System.out.println(resultSet.getInt("id") + " - " + resultSet.getString("ad") + " " + resultSet.getString("soyadi"));
                }

            } catch (Exception e) {
                System.out.println("Hata: " + e);
            } finally {

                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            }
        }
    }

