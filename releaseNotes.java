Steps to Create Postman Mock Servers  

 

Prerequisites 

Postman account  

Basic understanding of APIs and mock servers 

 

Create a Collection for Mocking 

create a new Postman collection.  

Add requests to the collection, representing the endpoints you want to mock. 

For each request, save an example response by selecting “Send” and then “Save as Example” in the response pane. 

 

Retrieve the Collection ID 

Use the Postman API to get the collection ID for your collection. 

(You can find the collection ID in Postman or by making a GET request to https://api.getpostman.com/collections). 

 

Create a Mock Server 

Make a POST request to https://api.getpostman.com/mocks with the collection ID. 

Configure mock server details (e.g., name, delay). 

Retrieve the mock server URL from the response. (e.g. : https://7252c281-c002-4bd3-a71a-bf1b6986b378.mock.pstmn.io/get) 

 

Replace Base URLs in Requests 

Replace the base URL of your saved requests with the mock server URL. 

Now your requests will be directed to the mock server. 

 

Test the Mock Server 

Send requests to the mock server endpoints. 

Postman will respond with the saved examples you defined earlier. 

Customize responses or add dynamic behavior using Postman’s scripting features. 

 

Tear Down the Mock Server 

When done, delete the mock server using the Postman API. (https://www.postman.com/postman/workspace/postman-public-workspace/documentation/12959542-c8142d51-e97c-46b6-bd77-52bb66712c9a) 

 
