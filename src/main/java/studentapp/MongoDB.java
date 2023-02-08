package studentapp;

import java.util.concurrent.Flow.Publisher;

import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;



public class MongoDB {

    MongoClient client = MongoClients.create("mongodb+srv://dbAdmin:dbAdmin@cs4220-final.52sgh.mongodb.net/?retryWrites=true&w=majority");
    MongoDatabase db = client.getDatabase("StudentAppDatabase");
    MongoCollection<Document> col = db.getCollection("students");

    public MongoDB(){};


public void addStudent (String fName, String lName, String id){
    Document studentDoc = new Document("_id", id)
    .append("First Name", fName )
    .append("Last Name", lName )
    .append("Student Year", id.charAt(0))
    .append("Student ID", id)
    .append("Classes", null)
    .append("Balance", 0)
    ;
 
    col.insertOne(studentDoc);

}

public void updateBalance (double num, String id){
  col.updateOne(Filters.eq("_id", id), Updates.set("Balance", num));
}

public void updateClasses (String[] classes, String id){
    col.updateOne(Filters.eq("_id", id), Updates.set("Classes", classes));
  }



}
