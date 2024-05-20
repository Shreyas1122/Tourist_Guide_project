package tourist_places;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

class argentina{
    String url = "jdbc:mysql://localhost:3306/tourist_guide";
    String username = "root";
    String password = "shreyas@29";

    void argentina_cities() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.print(e.getMessage());
        }
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            String query = "Select * from argentina_city";
            Statement state = conn.createStatement();
            ResultSet result = state.executeQuery(query);
            List<String> city = new ArrayList<String>();
            List<Double> population = new ArrayList<Double>();
            List<Double> expensive = new ArrayList<>();
            List<Integer> f_places = new ArrayList<>();
            List<String> Avail_trans = new ArrayList<>();
            List<String> City_fam_for = new ArrayList<>();

            while (result.next()) {
                city.add(result.getString("city"));
                population.add(result.getDouble("population"));
                expensive.add(result.getDouble("expensive"));
                f_places.add(result.getInt("f_places"));
                Avail_trans.add(result.getString("Avail_trans"));
                City_fam_for.add(result.getString("city_fam_for"));
            }
//printing the lists
            System.out.print("city     population(AVG)    expense(Avg)   no.of places   AVail_trans            famous for \n");
            for (int i = 0; i < city.size(); i++) {
                System.out.print(city.get(i) + "      ");
                System.out.print(population.get(i) + "%            ");
                System.out.print(expensive.get(i) + "%             ");
                System.out.print(f_places.get(i) + "        ");
                System.out.print(Avail_trans.get(i) + "       ");
                System.out.print(City_fam_for.get(i) + "         ");
                System.out.print("\n");
            }


        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
    }

    public static void main(String[] args) {
        argentina obj=new argentina();
        obj.argentina_cities();
    }

 }
 class chille{
     String url = "jdbc:mysql://localhost:3306/tourist_guide";
     String username = "root";
     String password = "shreyas@29";

     void chile_cities() {
         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
         } catch (ClassNotFoundException e) {
             System.out.print(e.getMessage());
         }
         try {
             Connection conn = DriverManager.getConnection(url, username, password);
             String query = "Select * from chile_city";
             Statement state = conn.createStatement();
             ResultSet result = state.executeQuery(query);
             List<String> city = new ArrayList<String>();
             List<Double> population = new ArrayList<Double>();
             List<Double> expensive = new ArrayList<>();
             List<Integer> f_places = new ArrayList<>();
             List<String> Avail_trans = new ArrayList<>();
             List<String> City_fam_for = new ArrayList<>();

             while (result.next()) {
                 city.add(result.getString("city"));
                 population.add(result.getDouble("population"));
                 expensive.add(result.getDouble("expensive"));
                 f_places.add(result.getInt("f_places"));
                 Avail_trans.add(result.getString("Avail_trans"));
                 City_fam_for.add(result.getString("city_fam_for"));
             }
//printing the lists
             System.out.print("city     population(AVG)    expense(Avg)   no.of places   AVail_trans            famous for \n");
             for (int i = 0; i < city.size(); i++) {
                 System.out.print(city.get(i) + "      ");
                 System.out.print(population.get(i) + "%            ");
                 System.out.print(expensive.get(i) + "%             ");
                 System.out.print(f_places.get(i) + "        ");
                 System.out.print(Avail_trans.get(i) + "       ");
                 System.out.print(City_fam_for.get(i) + "         ");
                 System.out.print("\n");
             }


         } catch (SQLException e) {
             System.out.print(e.getMessage());
         }
     }


 }
 class colombia{
     String url = "jdbc:mysql://localhost:3306/tourist_guide";
     String username = "root";
     String password = "shreyas@29";

     void colombia_cities() {
         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
         } catch (ClassNotFoundException e) {
             System.out.print(e.getMessage());
         }
         try {
             Connection conn = DriverManager.getConnection(url, username, password);
             String query = "Select * from colombia_city";
             Statement state = conn.createStatement();
             ResultSet result = state.executeQuery(query);
             List<String> city = new ArrayList<String>();
             List<Double> population = new ArrayList<Double>();
             List<Double> expensive = new ArrayList<>();
             List<Integer> f_places = new ArrayList<>();
             List<String> Avail_trans = new ArrayList<>();
             List<String> City_fam_for = new ArrayList<>();

             while (result.next()) {
                 city.add(result.getString("city"));
                 population.add(result.getDouble("population"));
                 expensive.add(result.getDouble("expensive"));
                 f_places.add(result.getInt("f_places"));
                 Avail_trans.add(result.getString("Avail_trans"));
                 City_fam_for.add(result.getString("city_fam_for"));
             }
//printing the lists
             System.out.print("city     population(AVG)    expense(Avg)   no.of places   AVail_trans            famous for \n");
             for (int i = 0; i < city.size(); i++) {
                 System.out.print(city.get(i) + "      ");
                 System.out.print(population.get(i) + "%            ");
                 System.out.print(expensive.get(i) + "%             ");
                 System.out.print(f_places.get(i) + "        ");
                 System.out.print(Avail_trans.get(i) + "       ");
                 System.out.print(City_fam_for.get(i) + "         ");
                 System.out.print("\n");
             }


         } catch (SQLException e) {
             System.out.print(e.getMessage());
         }
     }


 }

 class brazil{
     String url = "jdbc:mysql://localhost:3306/tourist_guide";
     String username = "root";
     String password = "shreyas@29";

     void brazil_cities() {
         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
         } catch (ClassNotFoundException e) {
             System.out.print(e.getMessage());
         }
         try {
             Connection conn = DriverManager.getConnection(url, username, password);
             String query = "Select * from brazil_city";
             Statement state = conn.createStatement();
             ResultSet result = state.executeQuery(query);
             List<String> city = new ArrayList<String>();
             List<Double> population = new ArrayList<Double>();
             List<Double> expensive = new ArrayList<>();
             List<Integer> f_places = new ArrayList<>();
             List<String> Avail_trans = new ArrayList<>();
             List<String> City_fam_for = new ArrayList<>();

             while (result.next()) {
                 city.add(result.getString("city"));
                 population.add(result.getDouble("population"));
                 expensive.add(result.getDouble("expensive"));
                 f_places.add(result.getInt("f_places"));
                 Avail_trans.add(result.getString("Avail_trans"));
                 City_fam_for.add(result.getString("city_fam_for"));
             }
//printing the lists
             System.out.print("city     population(AVG)    expense(Avg)   no.of places   AVail_trans            famous for \n");
             for (int i = 0; i < city.size(); i++) {
                 System.out.print(city.get(i) + "      ");
                 System.out.print(population.get(i) + "%            ");
                 System.out.print(expensive.get(i) + "%             ");
                 System.out.print(f_places.get(i) + "        ");
                 System.out.print(Avail_trans.get(i) + "       ");
                 System.out.print(City_fam_for.get(i) + "         ");
                 System.out.print("\n");
             }


         } catch (SQLException e) {
             System.out.print(e.getMessage());
         }
     }


 }

 class peru{
     String url = "jdbc:mysql://localhost:3306/tourist_guide";
     String username = "root";
     String password = "shreyas@29";

     void peru_cities() {
         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
         } catch (ClassNotFoundException e) {
             System.out.print(e.getMessage());
         }
         try {
             Connection conn = DriverManager.getConnection(url, username, password);
             String query = "Select * from peru_city";
             Statement state = conn.createStatement();
             ResultSet result = state.executeQuery(query);
             List<String> city = new ArrayList<String>();
             List<Double> population = new ArrayList<Double>();
             List<Double> expensive = new ArrayList<>();
             List<Integer> f_places = new ArrayList<>();
             List<String> Avail_trans = new ArrayList<>();
             List<String> City_fam_for = new ArrayList<>();

             while (result.next()) {
                 city.add(result.getString("city"));
                 population.add(result.getDouble("population"));
                 expensive.add(result.getDouble("expensive"));
                 f_places.add(result.getInt("f_places"));
                 Avail_trans.add(result.getString("Avail_trans"));
                 City_fam_for.add(result.getString("city_fam_for"));
             }
//printing the lists
             System.out.print("city     population(AVG)    expense(Avg)   no.of places   AVail_trans            famous for \n");
             for (int i = 0; i < city.size(); i++) {
                 System.out.print(city.get(i) + "      ");
                 System.out.print(population.get(i) + "%            ");
                 System.out.print(expensive.get(i) + "%             ");
                 System.out.print(f_places.get(i) + "        ");
                 System.out.print(Avail_trans.get(i) + "       ");
                 System.out.print(City_fam_for.get(i) + "         ");
                 System.out.print("\n");
             }


         } catch (SQLException e) {
             System.out.print(e.getMessage());
         }
     }


 }
