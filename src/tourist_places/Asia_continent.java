package tourist_places;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

class india{
    String url="jdbc:mysql://localhost:3306/tourist_guide";
    String username="root";
    String password="shreyas@29";
 void india_cities(){
     try{
Class.forName("com.mysql.cj.jdbc.Driver");}
     catch(ClassNotFoundException e){
   System.out.print(e.getMessage());
     }
     try {
         Connection conn = DriverManager.getConnection(url, username, password);
       String query ="Select * from india_city";
       Statement state=conn.createStatement();
       ResultSet result=state.executeQuery(query);
         List<String> city=new ArrayList<String>();
         List<Double> population=new ArrayList<Double>();
         List<Double> expensive =new ArrayList<>();
         List<Integer> f_places=new ArrayList<>();
         List<String> Avail_trans=new ArrayList<>();
         List<String> City_fam_for =new ArrayList<>();

while(result.next()){
city.add(result.getString("city"));
population.add(result.getDouble("population"));
expensive.add(result.getDouble("expensive"));
f_places.add(result.getInt("f_places"));
Avail_trans.add(result.getString("Avail_trans"));
City_fam_for.add(result.getString("city_fam_for"));
}
//printing the lists
System.out.print("city     population(AVG)    expense(Avg)   no.of places   AVail_trans            famous for \n");
         for(int i=0;i<city.size();i++){
             System.out.print(city.get(i)+ "      ");
             System.out.print(population.get(i)+"%            ");
             System.out.print(expensive.get(i)+"%             ");
             System.out.print(f_places.get(i)+ "        ");
             System.out.print(Avail_trans.get(i)+ "       ");
             System.out.print(City_fam_for.get(i)+"         ");
             System.out.print("\n");
         }


     }catch(SQLException e){
System.out.print(e.getMessage());
     }
 }



}

class China{

    String url="jdbc:mysql://localhost:3306/tourist_guide";
    String username="root";
    String password="shreyas@29";
    void china_cities(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");}
        catch(ClassNotFoundException e){
            System.out.print(e.getMessage());
        }
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            String query ="Select * from china_city";
            Statement state=conn.createStatement();
            ResultSet result=state.executeQuery(query);
            List<String> city=new ArrayList<String>();
            List<Double> population=new ArrayList<Double>();
            List<Double> expensive =new ArrayList<>();
            List<Integer> f_places=new ArrayList<>();
            List<String> Avail_trans=new ArrayList<>();
            List<String> City_fam_for =new ArrayList<>();

            while(result.next()){
                city.add(result.getString("city"));
                population.add(result.getDouble("population"));
                expensive.add(result.getDouble("expensive"));
                f_places.add(result.getInt("f_places"));
                Avail_trans.add(result.getString("Avail_trans"));
                City_fam_for.add(result.getString("city_fam_for"));
            }
//printing the lists
            System.out.print("city     population(AVG)    expense(Avg)   no.of places   AVail_trans            famous for \n");
            for(int i=0;i<city.size();i++){
                System.out.print(city.get(i)+ "      ");
                System.out.print(population.get(i)+"%            ");
                System.out.print(expensive.get(i)+"%             ");
                System.out.print(f_places.get(i)+ "        ");
                System.out.print(Avail_trans.get(i)+ "       ");
                System.out.print(City_fam_for.get(i)+"         ");
                System.out.print("\n");
            }


        }catch(SQLException e){
            System.out.print(e.getMessage());
        }
    }

}
class russia{
    String url="jdbc:mysql://localhost:3306/tourist_guide";
    String username="root";
    String password="shreyas@29";
    void russia_cities(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");}
        catch(ClassNotFoundException e){
            System.out.print(e.getMessage());
        }
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            String query ="Select * from russia_city";
            Statement state=conn.createStatement();
            ResultSet result=state.executeQuery(query);
            List<String> city=new ArrayList<String>();
            List<Double> population=new ArrayList<Double>();
            List<Double> expensive =new ArrayList<>();
            List<Integer> f_places=new ArrayList<>();
            List<String> Avail_trans=new ArrayList<>();
            List<String> City_fam_for =new ArrayList<>();

            while(result.next()){
                city.add(result.getString("city"));
                population.add(result.getDouble("population"));
                expensive.add(result.getDouble("expensive"));
                f_places.add(result.getInt("f_places"));
                Avail_trans.add(result.getString("Avail_trans"));
                City_fam_for.add(result.getString("city_fam_for"));
            }
//printing the lists
            System.out.print("city     population(AVG)    expense(Avg)   no.of places   AVail_trans            famous for \n");
            for(int i=0;i<city.size();i++){
                System.out.print(city.get(i)+ "      ");
                System.out.print(population.get(i)+"%            ");
                System.out.print(expensive.get(i)+"%             ");
                System.out.print(f_places.get(i)+ "       ");
                System.out.print(Avail_trans.get(i)+ "      ");
                System.out.print(City_fam_for.get(i)+"         ");
                System.out.print("\n");
            }


        }catch(SQLException e){
            System.out.print(e.getMessage());
        }
    }

}

class uae{

    String url="jdbc:mysql://localhost:3306/tourist_guide";
    String username="root";
    String password="shreyas@29";
    void uae_cities(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");}
        catch(ClassNotFoundException e){
            System.out.print(e.getMessage());
        }
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            String query ="Select * from uae_city";
            Statement state=conn.createStatement();
            ResultSet result=state.executeQuery(query);
            List<String> city=new ArrayList<String>();
            List<Double> population=new ArrayList<Double>();
            List<Double> expensive =new ArrayList<>();
            List<Integer> f_places=new ArrayList<>();
            List<String> Avail_trans=new ArrayList<>();
            List<String> City_fam_for =new ArrayList<>();

            while(result.next()){
                city.add(result.getString("city"));
                population.add(result.getDouble("population"));
                expensive.add(result.getDouble("expensive"));
                f_places.add(result.getInt("f_places"));
                Avail_trans.add(result.getString("Avail_trans"));
                City_fam_for.add(result.getString("city_fam_for"));
            }
//printing the lists
            System.out.print("city     population(AVG)    expense(Avg)   no.of places   AVail_trans            famous for \n");
            for(int i=0;i<city.size();i++){
                System.out.print(city.get(i)+ "      ");
                System.out.print(population.get(i)+"%            ");
                System.out.print(expensive.get(i)+"%             ");
                System.out.print(f_places.get(i)+ "       ");
                System.out.print(Avail_trans.get(i)+ "      ");
                System.out.print(City_fam_for.get(i)+"         ");
                System.out.print("\n");
            }


        }catch(SQLException e){
            System.out.print(e.getMessage());
        }
    }
}

class japan{

    String url="jdbc:mysql://localhost:3306/tourist_guide";
    String username="root";
    String password="shreyas@29";
    void japan_cities(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");}
        catch(ClassNotFoundException e){
            System.out.print(e.getMessage());
        }
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            String query ="Select * from japan_city";
            Statement state=conn.createStatement();
            ResultSet result=state.executeQuery(query);
            List<String> city=new ArrayList<String>();
            List<Double> population=new ArrayList<Double>();
            List<Double> expensive =new ArrayList<>();
            List<Integer> f_places=new ArrayList<>();
            List<String> Avail_trans=new ArrayList<>();
            List<String> City_fam_for =new ArrayList<>();

            while(result.next()){
                city.add(result.getString("city"));
                population.add(result.getDouble("population"));
                expensive.add(result.getDouble("expensive"));
                f_places.add(result.getInt("f_places"));
                Avail_trans.add(result.getString("Avail_trans"));
                City_fam_for.add(result.getString("city_fam_for"));
            }
//printing the lists
            System.out.print("city     population(AVG)    expense(Avg)   no.of places   AVail_trans            famous for \n");
            for(int i=0;i<city.size();i++){
                System.out.print(city.get(i)+ "      ");
                System.out.print(population.get(i)+"%            ");
                System.out.print(expensive.get(i)+"%             ");
                System.out.print(f_places.get(i)+ "       ");
                System.out.print(Avail_trans.get(i)+ "      ");
                System.out.print(City_fam_for.get(i)+"         ");
                System.out.print("\n");
            }


        }catch(SQLException e){
            System.out.print(e.getMessage());
        }
    }

}