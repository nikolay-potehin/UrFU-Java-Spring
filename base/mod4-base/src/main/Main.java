package main;

import javax.sound.midi.Soundbank;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DB db = new DB();
        System.out.println("Все заказы\n");
        String user_id = null;
        ArrayList<String> item_id = new ArrayList<>();
        try {
            ResultSet resUser = db.getArtUser();
            ResultSet resItem = db.getArtItem();
            while (resUser.next()) {
                user_id = resUser.getString("id");
            }
            while (resItem.next()){
                item_id.add(resItem.getString("id"));
            }
            for (String item : item_id){
                db.insertArt(user_id, item);
            }
            ResultSet resOrd = db.getArtOrd();

            while (resOrd.next()) {
                ResultSet resUserId = db.getArtUserId(resOrd.getString("user_id"));
                ResultSet resItemId = db.getArtItemId(resOrd.getString("item_id"));
                if (resUserId.next() & resItemId.next()) {
                    System.out.print(resUserId.getString("login") + " - " + resItemId.getString("title") + "\n");
                }
                resOrd.getString("user_id");
                resOrd.getString("item_id");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
