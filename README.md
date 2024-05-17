import com.amazonaws.auth.AWSCredentialsProviderChain;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.KeyType;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;

import java.util.HashMap;
import java.util.Map;

public class AWSTestDataManagement {

    // Credentials provider chain to load credentials from different sources
    private static final AWSCredentialsProviderChain credentialsProviderChain = new AWSCredentialsProviderChain(
            new ProfileCredentialsProvider("default")
            // Add other credentials providers as necessary
    );

    // Amazon DynamoDB client initialization
    private static final AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
            .withCredentials(credentialsProviderChain)
            .withRegion("us-west-2") // specify your region
            .build();

    // DynamoDB object for high-level API interactions
    private static final DynamoDB dynamoDB = new DynamoDB(client);

    /**
     * Method to create a DynamoDB table
     * @param tableName Name of the table
     * @param keyName Primary key for the table
     */
    public static void createTable(String tableName, String keyName) {
        try {
            System.out.println("Attempting to create table; please wait...");
            Table table = dynamoDB.createTable(new CreateTableRequest()
                    .withTableName(tableName)
                    .withKeySchema(new KeySchemaElement(keyName, KeyType.HASH)) // Partition key
                    .withAttributeDefinitions(new AttributeDefinition(keyName, "S")) // String type
                    .withProvisionedThroughput(new ProvisionedThroughput(10L, 10L)));
            table.waitForActive();
            System.out.println("Success. Table status: " + table.getDescription().getTableStatus());
        } catch (Exception e) {
            System.err.println("Unable to create table: ");
            System.err.println(e.getMessage());
        }
    }

    /**
     * Method to put an item into a DynamoDB table
     * @param tableName Name of the table
     * @param item Data item to put into the table
     */
    public void putItem(String tableName, Map<String, Object> item) {
        try {
            System.out.println("Putting item into table " + tableName);
            dynamoDB.getTable(tableName).putItem(new com.amazonaws.services.dynamodbv2.document.Item().withPrimaryKey("ID", item.get("ID")).withMap("info", item));
            System.out.println("Item put successfully");
        } catch (Exception e) {
            System.err.println("Unable to put item: ");
            System.err.println(e.getMessage());
        }
    }

    /**
     * Method to get an item from a DynamoDB table
     * @param tableName Name of the table
     * @param keyName Key name of the item
     * @param keyValue Key value of the item
     */
    public void getItem(String tableName, String keyName, Object keyValue) {
        try {
            System.out.println("Getting item from table " + tableName);
            com.amazonaws.services.dynamodbv2.document.Item item = dynamoDB.getTable(tableName).getItem(keyName, keyValue);
            System.out.println("Item retrieved: " + item.toJSONPretty());
        } catch (Exception e) {
            System.err.println("Unable to get item: ");
            System.err.println(e.getMessage());
        }
    }

    /**
     * Method to update an item in a DynamoDB table
     * @param tableName Name of the table
     * @param keyName Key name of the item
     * @param keyValue Key value of the item
     * @param updatedValues Map of updated values
     */
    public void updateItem(String tableName, String keyName, Object keyValue, Map<String, Object> updatedValues) {
        try {
            System.out.println("Updating item in table " + tableName);
            dynamoDB.getTable(tableName).updateItem(new com.amazonaws.services.dynamodbv2.document.PrimaryKey(keyName, keyValue), new com.amazonaws.services.dynamodbv2.document.UpdateItemSpec().withAttributeUpdates(updatedValues));
            System.out.println("Item updated successfully");
        } catch (Exception e) {
            System.err.println("Unable to update item: ");
            System.err.println(e.getMessage());
        }
    }

    /**
     * Method to delete an item from a DynamoDB table
     * @param tableName Name of the table
     * @param keyName Key name of the item
     * @param keyValue Key value of the item
     */
    public void deleteItem(String tableName, String keyName, Object keyValue) {
        try {
            System.out.println("Deleting item from table " + tableName);
            dynamoDB.getTable(tableName).deleteItem(keyName, keyValue);
            System.out.println("Item deleted successfully");
        } catch (Exception e) {
            System.err.println("Unable to delete item: ");
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Example usage:
        createTable("TestTable", "TestKey");

        AWSTestDataManagement manager = new AWSTestDataManagement();

        // Example item
        Map<String, Object> item = new HashMap<>();
        item.put("ID", "123");
        item.put("info", new HashMap<String, Object>() {{
            put("Name", "Test Item");
            put("Value", "This is a test");
        }});

        // Put item
        manager.putItem("TestTable", item);

        // Get item
        manager.getItem("TestTable", "ID", "123");

        // Update item
        Map<String, Object> updatedValues = new HashMap<>();
        updatedValues.put("info", new HashMap<String, Object>() {{
            put("Name", "Updated Test Item");
            put("Value", "This is an updated test");
        }});
        manager.updateItem("TestTable", "ID", "123", updatedValues);

        // Get updated item
        manager.getItem("TestTable", "ID", "123");

        // Delete item
        manager.deleteItem("TestTable", "ID", "123");
    }
}
