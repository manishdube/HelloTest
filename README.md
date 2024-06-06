AWS DynamoDB with Java SDK
Introduction
This guide provides an overview of how to interact with AWS DynamoDB using the AWS SDK for Java. It covers the setup, basic operations like creating a table, putting an item, and getting an item, and explains the concepts of method chaining and builder patterns.

Prerequisites
Java Development Kit (JDK)
Maven (for dependency management)
AWS account with DynamoDB permissions
Setting Up the AWS SDK for Java
Add the following dependency to your Maven pom.xml file:

xml
Copy code
<dependency>
    <groupId>software.amazon.awssdk</groupId>
    <artifactId>dynamodb</artifactId>
    <version>2.20.0</version>
</dependency>
DynamoDB Client Initialization
To interact with DynamoDB, you need to create a DynamoDbClient instance. Here’s how to initialize the client:

java
Copy code
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.regions.Region;

public class DynamoDBExample {
    public static void main(String[] args) {
        DynamoDbClient ddb = DynamoDbClient.builder()
                .region(Region.US_EAST_1)
                .build();
    }
}
Creating a Table
Create a table using method chaining:

java
Copy code
import software.amazon.awssdk.services.dynamodb.model.*;

public class DynamoDBExample {
    public static void main(String[] args) {
        DynamoDbClient ddb = DynamoDbClient.builder()
                .region(Region.US_EAST_1)
                .build();

        String tableName = "ExampleTable";

        CreateTableRequest request = CreateTableRequest.builder()
                .attributeDefinitions(AttributeDefinition.builder()
                        .attributeName("Id")
                        .attributeType(ScalarAttributeType.N)
                        .build())
                .keySchema(KeySchemaElement.builder()
                        .attributeName("Id")
                        .keyType(KeyType.HASH)
                        .build())
                .provisionedThroughput(ProvisionedThroughput.builder()
                        .readCapacityUnits(10L)
                        .writeCapacityUnits(10L)
                        .build())
                .tableName(tableName)
                .build();

        ddb.createTable(request);
    }
}
Putting an Item
Add an item to the table:

java
Copy code
import software.amazon.awssdk.services.dynamodb.model.PutItemRequest;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

public class DynamoDBExample {
    public static void main(String[] args) {
        DynamoDbClient ddb = DynamoDbClient.builder()
                .region(Region.US_EAST_1)
                .build();

        String tableName = "ExampleTable";

        Map<String, AttributeValue> item = new HashMap<>();
        item.put("Id", AttributeValue.builder().n("1").build());
        item.put("Name", AttributeValue.builder().s("John Doe").build());

        PutItemRequest request = PutItemRequest.builder()
                .tableName(tableName)
                .item(item)
                .build();

        ddb.putItem(request);
    }
}
Getting an Item
Retrieve an item from the table:

java
Copy code
import software.amazon.awssdk.services.dynamodb.model.GetItemRequest;

public class DynamoDBExample {
    public static void main(String[] args) {
        DynamoDbClient ddb = DynamoDbClient.builder()
                .region(Region.US_EAST_1)
                .build();

        String tableName = "ExampleTable";

        Map<String, AttributeValue> key = new HashMap<>();
        key.put("Id", AttributeValue.builder().n("1").build());

        GetItemRequest request = GetItemRequest.builder()
                .tableName(tableName)
                .key(key)
                .build();

        Map<String, AttributeValue> returnedItem = ddb.getItem(request).item();

        if (returnedItem != null) {
            returnedItem.forEach((k, v) -> System.out.println(k + ": " + v.toString()));
        } else {
            System.out.println("No item found with the key provided.");
        }
    }
}
Understanding Method Chaining and Builders
Method Chaining: This pattern allows multiple method calls to be chained together in a single statement by returning the object on which it was called.
Builder Pattern: This pattern constructs complex objects step by step. Each step returns the builder itself, and the final build() method returns the constructed object.
Example:
java
Copy code
CreateTableRequest request = CreateTableRequest.builder()
    .attributeDefinitions(AttributeDefinition.builder()
        .attributeName("Id")
        .attributeType(ScalarAttributeType.N)
        .build())
    .keySchema(KeySchemaElement.builder()
        .attributeName("Id")
        .keyType(KeyType.HASH)
        .build())
    .provisionedThroughput(ProvisionedThroughput.builder()
        .readCapacityUnits(10L)
        .writeCapacityUnits(10L)
        .build())
    .tableName("ExampleTable")
    .build();
Conclusion
Interacting with DynamoDB using the AWS SDK for Java involves understanding method chaining and builder patterns. With practice, these concepts become intuitive, allowing for efficient and readable code. This guide covered the basics of setting up the SDK, creating a table, putting an item, and getting an item.

For more detailed information, refer to the AWS SDK for Java Documentation.
