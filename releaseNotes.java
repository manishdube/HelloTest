# Release 1.5
Created by Dube, Manish (Alpharetta), last modified by R, Damien Matthew (Chennai) about 4 hours ago

**Product Name:** 

  

**Product Description:** 

 GBS Continuous Automation Framework 

**Release Version:** 

 1.5 

**Release Date:** 



**Prepared by:** 

Dube, Manish (Alpharetta) 

**Reviewed by:** 

Dube, Manish (Alpharetta)  
Karuppiah, Sanguth Thalaivan (Chennai)  
P, Jeeva (Chennai)  
Ragavan P, Veera (Chennai)  
Sankar, Balachander (Chennai)  
S P, Kolunthuvelu (Chennai)  
DURAIKRISHNAN, S. (Chennai)  
Kannan, Gopalsamy (Chennai)  

**Authorized by:** 

Gupta, Vipul (Alpharetta) 

**Prerequisite:** 

Any previous changes made inside the GBSCAF folder will be overwritten during this upgrade as it is a dev folder – To mitigate the issue, take a backup of your current GBSCAF folder and resolve the conflicts manually. 
Supported JDKs - JDK 11 or above

**New Features and Enhancements:**

**GBSCAF Java**

1. OTP reading for Multifactor Authentication with API

**GBSCAF Python**

1. Framework Refactoring to make it compatible with GBSCAF Principles
2. PTS Functionality Automation POC
3. Enhanced Test Data Management
4. FTP File Transfer from Mainframe to Local Validation


**Known Issues:**

No known issues at the time of release. Any issues encountered should be reported to the GBSCAF development team for resolution in future updates.
Please reach out to DL-NA-GBSTech-QE-Support in case of any queries related to GBSCAF.


**Stories Delivered:**

1. GBSCAFDEV-782 - GBSCAF Java CAPCHA reading - Gopal
2. GBSCAFDEV-785 - GBSCAF Java barcode reading - Gopal
3. GBSCAFDEV-728 - GBSCAF Java OTP reading and handling - Velu
4. GBSCAFDEV-734 - GBSCAF Java File uploading method to push files (Attachments) to a Web page - Velu
5. GBSCAFADT-302 - GBSCAF Java Zephyr log file attachment for failed executions - Sangu
6. GBSCAFDEV-760 - GBSCAF Java Saucelab enhancements - Test case name, scenario name - Durai
7. GBSCAFDEV-762 - GQSXML Java integration to Zephyr - Rapid Connect project - Jeeva
8. GBSCAFDEV-714 - GBSCAF Python - PTS functionality automation - Bala
9. GBSCAFDEV-797 - Adding Certificate Configuration while doing API call - Velu
10. FDPOS-3820 - Parallel thread execution capabilities with GBSCAF - Durai
11. GBSCAFDEV-743 - GBSCAF Python - Restructuring the framework to bring it closer to GBSCAF-Java - Damien
12. GBSCAFDEV-798 - GBSCAF Python - Use dictionary for YAML file data - Damien
13. GBSCAFDEV-809 - GBSCAF Python - Zephyr Scale integration - Bala
14. GBSCAFDEV-806 - GBSCAF Python - Share data across test scenarios - Damien
15. GBSCAFDEV-808 - FTP




1. use this as the confluence format --> Release 1.4
Created by Dube, Manish (Alpharetta), last modified by Kannan, Gopalsamy (Chennai) on May 20, 2024
Product Name: 

  

 

Product Description: 

 GBS Continuous Automation Framework

 

Release Version: 

 1.4 

 

Release Date: 

5/17/24



Documentation

Javadocs:http://info.gbscaf-nonprod.aws.fisv.cloud/GBSCAF_JAVADOC/V1.4/index.html
Knowledge Hub


Prepared by: 

Dube, Manish (Alpharetta) 



Reviewed by: 

Dube, Manish (Alpharetta)  Karuppiah, Sanguth Thalaivan (Chennai) P, Jeeva (Chennai) Ragavan P, Veera (Chennai) Sankar, Balachander (Chennai) S P, Kolunthuvelu (Chennai) DURAIKRISHNAN, S. (Chennai) Kannan, Gopalsamy (Chennai) 



Authorized by: 

Gupta, Vipul (Alpharetta) 





Prerequisite: 

Any previous changes made inside the GBSCAF folder will be overwritten during this upgrade as it is a dev folder – To mitigate the issue, take a backup of your current GBSCAF folder and resolve the conflicts manually. 
Supported JDKs - JDK 11 or above
New Features and Enhancements:

GBSCAF Java	
Implemented CAPTCHA reading(Plain text format image) functionality for Windows machine.
Users can now extract text from CAPTCHA images programmatically.
Implemented Barcode reading capability

Supports various barcode formats (e.g., 2D Codes > QR Code, Linear Codes > Code-128, Business Cards > QR Code vCard, Event Barcodes > QR Code, UPC-A, EAN-14, ISBN 13, QR Code pdf, QR Code Image).
Integrated one-time password (OTP) generation and verification.
Supports both HOTP (counter-based) and TOTP (time-based) standards.
Implemented a method to upload files (attachments) to a web page.
Supports additional parameters alongside file uploads.
Enhanced Zephyr test execution by attaching log files for failed executions.

Saucelab Enhancements

Added test case and scenario names for better reporting when using Saucelabs

Added Certificate Configuration for API Calls

Enhanced Parallel Thread Execution

GBSCAF Python	
Framework Refactoring to make it compatible with GBSCAF Principles

PTS Functionality Automation POC

Streamlined data processing and assertions.
Utilized dictionaries for managing YAML file data.
Integrated with Zephyr Scale

Enhanced Test Data Management

Enabled data sharing between different test scenarios.
Implemented FTP File Transfer from Mainframe to Local Validation



Known Issues:

No known issues at the time of release. Any issues encountered should be reported to the GBSCAF development team for resolution in future updates.
Please reach out to DL-NA-GBSTech-QE-Support in case of any queries related to GBSCAF.



Stories Delivered:




GBSCAFDEV-782	GBSCAF Java CAPCHA reading	Gopal
GBSCAFDEV-785	GBSCAF Java barcode reading	Gopal
GBSCAFDEV-728	GBSCAF Java OTP reading and handling.	Velu
GBSCAFDEV-734	GBSCAF Java File uploading method to push files (Attachments) to a Web page	Velu
GBSCAFADT-302

GBSCAF Java Zephyr log file attachment for failed executions.	Sangu
GBSCAFDEV-760	GBSCAF Java Saucelab enhancements - Test case name, scenario name. 	Durai
GBSCAFDEV-762	GQSXML Java integration to Zephyr. - Rapid Connect project.	Jeeva
GBSCAFDEV-714	GBSCAF python - PTS functionality automation. 	Bala
GBSCAFDEV-797	Adding Certificate Configuration while doing API call	Velu
FDPOS-3820

Parallel thread execution capabilities with GBSCAF	Durai
GBSCAFDEV-743	GBSCAF Python - Restructuring the framework to bring it closer to GBSCAF-Java	Damien
GBSCAFDEV-798	GBSCAF Python - Use dictionary for yaml file data	Damien
GBSCAFDEV-809	GBSCAF Python - Zephyr Scale integration	Bala
GBSCAFDEV-806	GBSCAF Python - Share data across test scenarios	Damien
GBSCAFDEV-808	ftp to transfer file from mainframe to local and validate	Damien

  2. Now using format from above present info for this --> Created by Dube, Manish (Alpharetta), last modified by R, Damien Matthew (Chennai) about 4 hours ago


Product Name: 

  

Product Description: 

 GBS Continuous Automation Framework 

Release Version: 

 1.5 

Release Date: 



Prepared by: 

Dube, Manish (Alpharetta) 

Reviewed by: 

Dube, Manish (Alpharetta)  Karuppiah, Sanguth Thalaivan (Chennai) P, Jeeva (Chennai) Ragavan P, Veera (Chennai) Sankar, Balachander (Chennai) S P, Kolunthuvelu (Chennai) DURAIKRISHNAN, S. (Chennai) Kannan, Gopalsamy (Chennai) 

Authorized by: 

Gupta, Vipul (Alpharetta) 



Prerequisite: 

Any previous changes made inside the GBSCAF folder will be overwritten during this upgrade as it is a dev folder – To mitigate the issue, take a backup of your current GBSCAF folder and resolve the conflicts manually. 
Supported JDKs - JDK 11 or above
New Features and Enhancements:



GBSCAF Java	


GBSCAF Python	




OTP reading for Multifactor Authentication with API

GBSCAF

Velu

High

Jeeva is in progress



Known Issues:

No known issues at the time of release. Any issues encountered should be reported to the GBSCAF development team for resolution in future updates.
Please reach out to DL-NA-GBSTech-QE-Support in case of any queries related to GBSCAF.



Stories Delivered:












Prerequisite: 

Any previous changes made inside the GBSCAF folder will be overridden during this upgrade as it is a dev folder – To mitigate the issue, take a backup of your current GBSCAF folder and resolve the conflicts manually. 



New Features and Enhancements:















Parallel Execution :
Cross Browser--Available
Parallel Execution on same Browser---Does not exists

Java

GBSCAF

Durai

High

Needed to fix for FDPOS team performance issues


FDPOS Sauce lab Connectivity

Java

FDPOS

Gopal/Jeeva

High

Needed to fix for FDPOS team performance issues.
QA region is accessible , FDPOS 


Multi Threading	java 	
Jeeva	


Handling the Shared Resources	java	
Jeeva	


Zephyr Enhancement - Field filtering in search Operation	Java 	
Jeeva	


Release Testing

Java

GBSCAF

GBSCAF Team

Medium




Zephyr custom field(Automated and Automation Candidate) - and Test case update for Dashboard.



Zephyr

Sanguth

High

Health Dashboard requirement


CH - Zephyr Enhancement	
Zephyr	Sanguth	High	



OTP reading for Multifactor Authentication with API

Java

GBSCAF

Velu

High

Jeeva is in progress


Multifactor auth from Ping



GBSCAF/CRM

Velu

High

CRM--Ramesh/Satish


FDPOS Cleanup and optimization



GBSCAF/FDPOS

Gopal/Jeeva

High

Jeeva & Gopal in progress


GBSCAF Python 1star Adoption- 

Python

Adoption

Bala

High

To integrate Standalone utility  

Can this be handled by Santhosh and Bala directly?

GQSXML Zephyr Integration

Java

GBSCAF/RC

Jeeva

High

Jeeva in-progress


Saucelab Parallel execution setup

Java

GBSCAF

Durai

High

https://saucelabs.com/resources/blog/an-introduction-to-parallel-testing


CRM Team adoption



Adoption

Sanguth

High



Completed

Implementation Hub Gitlab Integration



Adoption

Sanguth

High



Completed
Python utility - Hosting

Phyton

GBSCAF

Veera

High

Verra is the POC

Need more details and identify how it can be done within the GBSCAF team

TDM - Design POC

Java

GBSCAF

Manish

High

Was put on hold 5/23

GBSCAF-97

Optimizing code to support recent changes

Python

GBSCAF

Damien

Medium



GBSCAFDEV-841

UMF log validation integration with Python GBSCAF

Python

GBSCAF

Damien

Medium



GBSCAFDEV-834

