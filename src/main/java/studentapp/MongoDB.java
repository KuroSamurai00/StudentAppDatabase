package studentapp;

import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.InsertOneResult;

public class MongoDB {

    MongoClient client = MongoClients.create("mongodb+srv://dbAdmin:dbAdmin@cs4220-final.52sgh.mongodb.net/?retryWrites=true&w=majority");
    MongoDatabase db = client.getDatabase("StudentAppDatabase");
    MongoCollection<Document> col = db.getCollection("students");

    public MongoDB(){};


public void addStudent (String fName, String lName, String id){
    Document studentDoc = new Document("_id", id)
    .append("First Name", fName )
    .append("Last Name", lName )
    .append("Student ID", id)
    .append("Classes", null);
 
    InsertOneResult results = col.insertOne(studentDoc);

}


    
}
