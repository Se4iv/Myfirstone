package Homework71;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Account {
    private LinkedList id;
    private LinkedList holder;
    private LinkedList amount;

    public Account() throws IOException {
            this.id = new LinkedList();
            this.holder = new LinkedList();
            this.amount = new LinkedList();
            Path p = Paths.get("/Users/s.ivanov/Desktop/accounts.txt");
            boolean check = Files.exists(p);
            if (!check){
                Files.createFile(p);
                PrintWriter write = new PrintWriter(new FileWriter("/Users/s.ivanov/Desktop/accounts.txt"));
                String[] infoWrite = new String[]{"1|Paul|500", "2|Emma|300", "3|Jess|400",
                        "4|Veronica|400", "5|Beth|500", "6|Greg|600"
                        , "7|Harry|700", "8|Cindy|800", "9|Larry|900", "10|Monica|1000"};
                for (String s : infoWrite) {
                    write.println(s + "|");
                    write.flush();
                }
            }


    }



    public LinkedList getAmount() {
        return amount;
    }

    public void setAmountMinus(int id, int amount) {
        this.amount.add(id,Double.parseDouble((String)this.amount.get(id)) - amount );
    }

    public void setAmountPlus(int id, int amount) {
        this.amount.add(id,Double.parseDouble((String)this.amount.get(id)) + amount );
    }

    public  void read() throws IOException {
        try (BufferedReader reader = new
                BufferedReader(new FileReader("/Users/s.ivanov/Desktop/accounts.txt"))) {
            ArrayList arr = new ArrayList();
            String str = reader.readLine();
            while (str !=  null) {
                String[] split = str.split("\\|");
                Collections.addAll(arr, split);
                str = reader.readLine();
            }
            for (int i = 0; i < arr.size(); i += 3) {
               id.add(arr.get(i));
               holder.add(arr.get(i+1));
               amount.add(arr.get(i+2));
            }
        }
         catch (IOException ex) {
            ex.printStackTrace();
            throw ex;
        }

    }

    public void write(){
        try(PrintWriter writer = new PrintWriter(new
                FileWriter("/Users/s.ivanov/Desktop/accounts.txt")))
        {
            for (int i=0;i<id.size();i++) {
                writer.println(id.get(i) + "|" + holder.get(i) + "|" + amount.get(i)+"|");
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}


