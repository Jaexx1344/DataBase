package BazaDanych;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {

    static String daneZBazy;

    public static void zapytanie() {

        String polaczenieURL = "jdbc:mysql://localhost/test?user=root&password=Jasiu13441344!";
        //Tworzymy proste zapytanie doa bazy danych
        String query = "Select * FROM samochody";
        String wartoscMarki ="BMW";
        String wartoscModelu ="X4";
        int wartoscRokuProdukcji=2022;
        String addUser = "INSERT INTO samochody(marka,model,rok_produkcji)  VALUES (?,?,?)";

        Connection conn = null;
        PreparedStatement preparedStatement = null;

        try {
            //Ustawiamy dane dotyczące podłączenia
            conn = DriverManager.getConnection(polaczenieURL);
            preparedStatement = conn.prepareStatement(addUser);

            preparedStatement.setString(1, wartoscMarki);
            preparedStatement.setString(2, wartoscModelu);
            preparedStatement.setInt(3, wartoscRokuProdukcji);

            // Wykonujemy zapytanie
            int affectedRows = preparedStatement.executeUpdate();


            //Uruchamiamy zapytanie do bazy danych
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            Statement addU = conn.createStatement();






            while (rs.next()) {
                wyswietlDaneZBazy(rs);
            }

            conn.close();
        }
        //Wyrzuć wyjątki jężeli nastąpią błędy z podłączeniem do bazy danych lub blędy zapytania o dane

        catch(SQLException wyjatek) {
            //e.printStackTrace();
            //System.out.println("Problem z logowaniem\nProsze sprawdzic:\n nazwę użytkownika, hasło, nazwę bazy danych lub adres IP serwera");
            System.out.println("SQLException: " + wyjatek.getMessage());
            System.out.println("SQLState: " + wyjatek.getSQLState());
            System.out.println("VendorError: " + wyjatek.getErrorCode());
        }

    }
    static void wyswietlDaneZBazy(ResultSet rs){
        try{
            daneZBazy = rs.getString(1);
            System.out.print( daneZBazy + " ");
            daneZBazy = rs.getString(2);
            System.out.print(daneZBazy + " ");
            daneZBazy = rs.getString(3);
            System.out.print(daneZBazy + " ");
            daneZBazy = rs.getString(4);
            System.out.println(daneZBazy);
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }

    }

