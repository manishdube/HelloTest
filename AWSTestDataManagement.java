import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.auth.credentials.ProfileCredentialsProvider;
import software.amazon.awssdk.core.client.config.ClientOverrideConfiguration;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeDefinition;
import software.amazon.awssdk.services.dynamodb.model.CreateTableRequest;
import software.amazon.awssdk.services.dynamodb.model.DeleteItemRequest;
import software.amazon.awssdk.services.dynamodb.model.GetItemRequest;
import software.amazon.awssdk.services.dynamodb.model.KeySchemaElement;
import software.amazon.awssdk.services.dynamodb.model.KeyType;
import software.amazon.awssdk.services.dynamodb.model.ProvisionedThroughput;
import software.amazon.awssdk.services.dynamodb.model.PutItemRequest;
import software.amazon.awssdk.services.dynamodb.model.UpdateItemRequest;
import software.amazon.awssdk.services.dynamodb.model.DynamoDbException;

import java.util.HashMap;
import java.util.Map;

public class AWSTestDataManagement {

    // Credentials provider to load credentials from the default profile
    private static final AwsCredentialsProvider credentialsProvider = ProfileCredentialsProvider.create("default");

    // DynamoDB client initialization
    private static final DynamoDbClient dynamoDbClient = DynamoDbClient.builder()
            .credentialsProvider(credentialsProvider)
            .region(Region.US_WEST_2) // specify your region
            .overrideConfiguration(ClientOverrideConfiguration.builder().build())
            .build();

    /**
     * Method to create a DynamoDB table
     * @param tableName Name of the table
     * @param keyName Primary key for the table
     */
    public static void createTable(String tableName, String keyName) {
        try {
            System.out.println("Attempting to create table; please wait...");
            CreateTableRequest request = CreateTableRequest.builder()
                    .tableName(tableName)
                    .keySchema(KeySchemaElement.builder().attributeName(keyName).keyType(KeyType.HASH).build()) // Partition key
                    .attributeDefinitions(AttributeDefinition.builder().attributeName(keyName).attributeType("S").build()) // String type
                    .provisionedThroughput(ProvisionedThroughput.builder()
                            .readCapacityUnits(10L)
                            .writeCapacityUnits(10L)
                            .build())
                    .build();
            
            dynamoDbClient.createTable(request);
            System.out.println("Success. Table created.");
        } catch (DynamoDbException e) {
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
            Map<String, software.amazon.awssdk.services.dynamodb.model.AttributeValue> itemValues = new HashMap<>();
            item.forEach((key, value) -> itemValues.put(key, software.amazon.awssdk.services.dynamodb.model.AttributeValue.builder().s(value.toString()).build()));

            PutItemRequest request = PutItemRequest.builder()
                    .tableName(tableName)
                    .item(itemValues)
                    .build();

            dynamoDbClient.putItem(request);
            System.out.println("Item put successfully");
        } catch (DynamoDbException e) {
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
            Map<String, software.amazon.awssdk.services.dynamodb.model.AttributeValue> key = new HashMap<>();
            key.put(keyName, software.amazon.awssdk.services.dynamodb.model.AttributeValue.builder().s(keyValue.toString()).build());

            GetItemRequest request = GetItemRequest.builder()
                    .tableName(tableName)
                    .key(key)
                    .build();

            Map<String, software.amazon.awssdk.services.dynamodb.model.AttributeValue> returnedItem = dynamoDbClient.getItem(request).item();
            if (returnedItem != null) {
                returnedItem.forEach((k, v) -> System.out.println(k + ": " + v.s()));
            } else {
                System.out.println("No item found with the key " + keyValue);
            }
        } catch (DynamoDbException e) {
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
            Map<String, software.amazon.awssdk.services.dynamodb.model.AttributeValue> key = new HashMap<>();
            key.put(keyName, software.amazon.awssdk.services.dynamodb.model.AttributeValue.builder().s(keyValue.toString()).build());

            Map<String, software.amazon.awssdk.services.dynamodb.model.AttributeValueUpdate> attributeUpdates = new HashMap<>();
            updatedValues.forEach((k, v) -> attributeUpdates.put(k, software.amazon.awssdk.services.dynamodb.model.AttributeValueUpdate.builder()
                    .value(software.amazon.awssdk.services.dynamodb.model.Attribute
