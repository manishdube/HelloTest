
hopper

Company

Hopper Media

Q Find booking

English▾

Travel Products

Download the app

Sign in

$20.00

Return

Review itinerary

Customize

Trip review

Departure

Payment

Contact Info

Traveler info

< Back

Customize your trip

Checkout Breakdown

hopper

Provided by

Premium Disruption Assistance

$100

Basic Doing

If your flight is canceled or delayed for 1+ hours on the day of travel

Taxes & Fees

$15

We'll cover the cost of a new flight on any airline (up to $2,000 per traveler)

Alternatively, get a $<XXX> cash refund per traveler, and keep your original reservation

$115

Total

Get help using our self-serve tools or speak to an agent!

How it works

View Terms

Continue

Add protection against delays + cancellations

Popular

$<XX.00>/traveler

No, thanks

I don't want to add this option





Test Suite	Test Case	Description	Priority	Test Type	Frequency	Handling Dynamic Data	Steps	Expected Result
Price Accuracy Test Suite	Flight Price Display	Verify flight price ($20.00) matches backend data.	High	Automated Functional	With every build, nightly	Mock API responses for price data.	1. Open the Offer Screen. 2. Retrieve the flight price displayed. 3. Compare the displayed price with the backend data using a mock API response.	The displayed flight price should match the mocked backend data value.
Price Accuracy Test Suite	Coverage Option Price Display	Validate that the price for 'Premium Disruption Assistance' ($100) is correct.	High	Automated Functional	With every build, nightly	Use stubs for coverage option prices.	1. Open the Offer Screen. 2. Retrieve the price for 'Premium Disruption Assistance'. 3. Compare the displayed price with the expected value using stubs.	The displayed price for 'Premium Disruption Assistance' should be $100.
Price Accuracy Test Suite	Taxes and Fees Display	Ensure that taxes and fees ($15) are correctly displayed.	High	Automated Functional	With every build, nightly	Mock API responses for taxes and fees.	1. Open the Offer Screen. 2. Retrieve the taxes and fees amount displayed. 3. Compare the displayed taxes and fees with the backend data using a mock API response.	The displayed taxes and fees should match the mocked backend data value of $15.
Price Accuracy Test Suite	Total Price Calculation	Check that the total price ($115) is calculated correctly.	High	Automated Functional	With every build, nightly	Validate calculations using mock data for all price components.	1. Open the Offer Screen. 2. Verify the individual components: Flight price ($20.00), Premium Disruption Assistance ($100), Taxes & Fees ($15). 3. Check that the total price displayed is $115. 4. Change coverage options and verify the updated total price. 5. Compare the total price with the expected calculation based on mock data.	The total price should be the sum of the individual components and update correctly when coverage options change.
Price Accuracy Test Suite	Dynamic Pricing Update	Verify that changing coverage options updates the total price accurately.	High	Automated Functional	With every build, nightly	Mock dynamic price updates and validate calculations.	1. Open the Offer Screen. 2. Change the coverage option to 'Basic Doing'. 3. Verify the updated total price. 4. Change the coverage option back to 'Premium Disruption Assistance'. 5. Verify the updated total price. 6. Compare the updated prices with the expected values based on mock data.	The total price should update correctly based on the selected coverage option.
Interactive Elements Test Suite	Button Functionality	Verify that buttons ('Sign in,' 'Continue,' 'No, thanks') function correctly.	High	Automated and Manual Functional	Automated daily, manual during major updates	Use parameterized tests to validate button actions.	1. Open the Offer Screen. 2. Click the 'Sign in' button and verify that it navigates to the sign-in page. 3. Click the 'Continue' button and verify that it proceeds to the next step. 4. Click the 'No, thanks' button and verify that it dismisses the optional protection offer.	All buttons should function correctly and navigate to the appropriate pages or perform the expected actions.
Interactive Elements Test Suite	Dropdown Functionality	Ensure that the language dropdown ('English▾') functions correctly.	High	Automated and Manual Functional	Automated daily, manual during major updates	Use mock data for dropdown options; validate functionality.	1. Open the Offer Screen. 2. Click the language dropdown and select a different language. 3. Verify that the page updates to the selected language.	The language dropdown should function correctly, and the page should update to the selected language.
Interactive Elements Test Suite	Link Navigation	Verify that links ('How it works,' 'View Terms') navigate to the correct pages.	High	Automated and Manual Functional	Automated daily, manual during major updates	Use mock URLs; validate link navigation.	1. Open the Offer Screen. 2. Click the 'How it works' link and verify that it navigates to the correct page. 3. Click the 'View Terms' link and verify that it navigates to the correct page.	All links should navigate to the appropriate pages.
Error Handling and Edge Case Test Suite	Error Messaging	Verify that error messages are displayed for scenarios such as network failures or invalid data inputs.	Medium	Automated and Manual	With every build, weekly	Mock error scenarios; validate error message display.	1. Simulate a network failure while loading the Offer Screen. 2. Verify that an appropriate error message is displayed to the user. 3. Enter invalid data into form fields and verify that relevant error messages are displayed.	Appropriate error messages should be displayed for network failures and invalid data inputs.
Error Handling and Edge Case Test Suite	Edge Case Handling	Test edge cases such as maximum number of travelers or extreme price values.	Medium	Automated and Manual	With every build, weekly	Use parameterized tests to simulate edge cases; validate handling.	1. Open the Offer Screen. 2. Enter the maximum number of travelers. 3. Verify that the screen handles this input correctly. 4. Enter extreme price values and verify that the screen handles these values correctly.	The screen should handle edge cases correctly and display appropriate messages or actions.
Performance Test Suite	Page Load Time	Measure the time it takes for the offer screen to load completely.	Medium	Automated Performance	With every build, nightly	Simulate dynamic data load; measure performance with varying data volumes.	1. Open the Offer Screen and start a timer. 2. Measure the time taken for all elements to load completely. 3. Repeat the test under different network conditions (e.g., 3G, 4G, Wi-Fi).	The page should load within an acceptable time frame across all network conditions.
Performance Test Suite	Interactive Response Time	Check the response time of interactive elements (buttons, dropdowns).	Medium	Automated Performance	With every build, nightly	Use mock data to simulate user interactions; measure response times.	1. Open the Offer Screen. 2. Interact with various elements (click buttons, select dropdowns). 3. Measure the time taken for each interaction to be processed.	The response time for each interaction should be within acceptable limits.
Performance Test Suite	Stress Testing	Perform stress testing to ensure the page performs well under heavy load.	Medium	Automated Performance	With every build, nightly	Simulate high traffic scenarios using load testing tools.	1. Use a load testing tool to simulate a high number of concurrent users accessing the Offer Screen. 2. Monitor the system performance, including response times and resource utilization. 3. Identify any performance bottlenecks or failures.	The Offer Screen should remain responsive and functional under heavy load.
UI and Layout Test Suite	Static Element Display	Verify static elements (e.g., 'hopper,' 'Company,' etc.) are displayed correctly.	Medium	Manual and Automated Visual	Automated daily, manual during major updates	Use reference images for comparison.	1. Open the Offer Screen. 2. Verify the presence and correct display of static elements like 'hopper,' 'Company,' etc. 3. Compare the displayed elements with reference images.	All static elements should be displayed correctly and match the reference images.
UI and Layout Test Suite	Dynamic Element Display	Check dynamic elements (prices, totals) are correctly displayed and formatted.	Medium	Manual and Automated Visual	Automated daily, manual during major updates	Mock dynamic data for consistency.	1. Open the Offer Screen. 2. Verify the presence and correct display of dynamic elements like prices and totals. 3. Compare the displayed elements with expected values using mock data.	All dynamic elements should be displayed correctly and formatted appropriately.
UI and Layout Test Suite	Cross-Browser Display Consistency	Ensure all elements are displayed consistently across different browsers using Sauce Labs.	Medium	Automated Visual	Automated daily	Use Sauce Labs for cross-browser testing.	1. Open the Offer Screen in different browsers (Chrome, Firefox, Safari, Edge) using Sauce Labs. 2. Verify the layout and alignment of all elements. 3. Compare the display across all browsers for consistency.	All elements should be displayed consistently across all supported browsers.
UI and Layout Test Suite	Cross-Device Display Consistency	Ensure all elements are displayed consistently across different devices using Sauce Labs.	Medium	Automated Visual	Automated daily	Use Sauce Labs for cross-device testing.	1. Open the Offer Screen on different devices (desktop, tablet, mobile) using Sauce Labs. 2. Verify the layout and alignment of all elements. 3. Compare the display across all devices for consistency.	All elements should be displayed consistently across all supported devices.
API Response Validation Test Suite	Flight Price API Response	Verify the API response for flight prices.	High	Automated API Testing	With every build, nightly	Use mock responses to simulate different scenarios.	1. Send a request to the flight price API endpoint. 2. Verify the structure and content of the response. 3. Compare the response data with expected values using mock data.	The API response should have the correct structure and accurate data.
API Response Validation Test Suite	Coverage Option API Response	Validate the API response for coverage options.	High	Automated API Testing	With every build, nightly	Use mock responses to simulate different scenarios.	1. Send a request to the coverage option API endpoint. 2. Verify the structure and content of the response.