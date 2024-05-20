package tourist_places;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Execution{
   int ask_continent(){
        int option=0;
        boolean deci=false;
        do{
            try {
                System.out.print("please enter the continent you want to visit(choose option)\n");
                System.out.print("1)Asia\n2)Europe\n3)South America\n");
                Scanner obj = new Scanner(System.in);
                option = obj.nextInt();
            }catch(Exception e){
                deci=true;
            }
        if(option==1||option==2||option==3){
            deci=false;
           return option;
        }
        else{
            System.out.print("please choose correct integer option from below\n");
            deci=true;
        }}
        while(deci);
        return option;
    }
    int ask_country(String options){
       int option=0;
       boolean deci=false;
        do{
            try{
            System.out.print("please enter the country you want to visit(choose option)\n");
            System.out.print(options);
            Scanner obj=new Scanner(System.in);
            option=obj.nextInt();}
            catch(Exception e){
                deci=true;
            }
            if(option==1||option==2||option==3||option==4||option==5){
                deci=false;
                return option;
            }
            else{
                System.out.print("please choose correct Integer option from below\n");
                deci=true;
            }}
        while(deci);
        return option;
    }



    String url = "jdbc:mysql://localhost:3306/tourist_guide";
    String username = "root";
    String password = "shreyas@29";

    void extract_data(String  query){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.print(e.getMessage());
        }
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
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
       Execution obj=new Execution();
       int continent=obj.ask_continent();
       if(continent==1){
         int country=obj.ask_country("1)India\n2)China\n3)Russia\n4)Japan\n5)UAE\n");
         if(country==1){
             System.out.print("Here are some Famous Cities in india\n");
             obj.extract_data("select * from india_city;");
         } else if (country==2) {
             System.out.print("Here are some Famous Cities in china\n");
            obj.extract_data("select * from china_city; ");

         } else if (country==3) {
             System.out.print("Here are some Famous Cities in russia\n");
             obj.extract_data("select * from russia_city;");
         } else if (country==4) {
             System.out.print("Here are some Famous Cities in Japan\n");
             obj.extract_data("select * from japan_city;");
         } else if (country==5) {
             System.out.print("Here are some Famous Cities in UAE\n");
             obj.extract_data("select * from uae_city;");
         }
         else{System.out.print("Please enter the choose proper option from above and start over ");}

       }
       else if(continent==2){
           int country=obj.ask_country("1)France\n2)Italy\n3)Germany\n4)Switzerland\n5)UK\n");
           if(country==1){
               System.out.print("Here are some Famous Cities in france\n");
               obj.extract_data("select * from france_city;");
           } else if (country==2) {
               System.out.print("Here are some Famous Cities in Italy\n");
               obj.extract_data("select * from Italy_city; ");

           } else if (country==3) {
               System.out.print("Here are some Famous Cities in Germany\n");
               obj.extract_data("select * from germany_city;");
           } else if (country==4) {
               System.out.print("Here are some Famous Cities in switzerland\n");
               obj.extract_data("select * from switzerland_city;");
           } else if (country==5) {
               System.out.print("Here are some Famous Cities in UK\n");
               obj.extract_data("select * from uk_city;");
           }
           else{System.out.print("Please enter the choose proper option from above and start over ");}
       }
       else if(continent==3){
           int country=obj.ask_country("1)Argentina\n2)Chile\n3)Brazil\n4)Colombia\n5)Peru\n");
           if(country==1){
               System.out.print("Here are some Famous Cities in Argentina\n");
               obj.extract_data("select * from argentina_city;");
           } else if (country==2) {
               System.out.print("Here are some Famous Cities in Chile\n");
               obj.extract_data("select * from chile_city; ");

           } else if (country==3) {
               System.out.print("Here are some Famous Cities in Brazil\n");
               obj.extract_data("select * from brazil_city;");
           } else if (country==4) {
               System.out.print("Here are some Famous Cities in Colombia\n");
               obj.extract_data("select * from colombia_city;");
           } else if (country==5) {
               System.out.print("Here are some Famous Cities in Peru\n");
               obj.extract_data("select * from peru_city;");
           }
           else{System.out.print("Please enter the choose proper option from above and start over ");}
       }
       else{
           System.out.print("Please choose the proper option from above and start over again\n");
       }
    }
}