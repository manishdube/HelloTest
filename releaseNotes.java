
Here is a list of features developed based on the commit messages provided:

1. **Zephyr Integration:**
   - Initial integration.
   - Upload failure attachments.
   - Upload log files and existing test cycle execution.
   - Zephyr test case creation.
   - Zephyr naming convention.
   - Zephyr code cleanup.

2. **Schema Validation:**
   - Request schema validation method creation.

3. **Configuration Management:**
   - Handling Gpath using YAML file.
   - Configuration and reading values from CSV.
   - Chrome driver temporary solution.
   - DataHelper modifications based on review comments.
   - Configuration structure change for rerunning failure scenarios.
   - ProtectConfigFile to protect Config.yaml during code merge.
   - Wait time configuration and element highlighter.
   - Solution for driver changes.
   - Nexus integration.
   - Default profile added in POM.xml file.
   - Code cleanup.

4. **API Enhancements:**
   - API steps and utilities updates.
   - API wrapper methods addition.
   - Log info update with Report portal.
   - Push log to Report portal.
   - Password encryption updates.
   - Fetch search results from Splunk.

5. **Test Automation Enhancements:**
   - GWT format validations.
   - Access modifiers updated.
   - Adding new steps for explicit wait.
   - Extent report and PDF report with timestamp.
   - Protect file plugin.
   - Retry failed scenarios.
   - Mobile execution changes for iOS and Android.
   - Selenium-remote-driver dependency update.

6. **Reporting Enhancements:**
   - Modified extent report and PDF report with timestamp.
   - Report structure changes.
   - Spark report changes.
   - Report plugin dependency issue fix.

If you need more detailed descriptions or additional context for any of these features, feel free to ask!

jeeva.p's avatar
GBSCAF|GBSW-140782 | Zephyr Integration
jeeva.p authored 9 months ago
d9563288
jeeva.p's avatar
GBSCAF|GBSW-140784 | Zephyr Upload Failure Attachments
jeeva.p authored 9 months ago
f9079923
S. DURAIKRISHNAN - 10154843's avatar
Request Schema validation method has been created
S. DURAIKRISHNAN - 10154843 authored 9 months ago
6aacc489
S. DURAIKRISHNAN - 10154843's avatar
Merge remote-tracking branch 'origin/release/2.0' into release/2.0
S. DURAIKRISHNAN - 10154843 authored 9 months ago
f67b4946
S. DURAIKRISHNAN - 10154843's avatar
GBSW-140773 Handling Gpath using Yaml file
S. DURAIKRISHNAN - 10154843 authored 9 months ago
5c84f85d
S. DURAIKRISHNAN - 10154843's avatar
GBSW-140773
S. DURAIKRISHNAN - 10154843 authored 9 months ago
ceab8be3
jeeva.p's avatar
GBSCAF|GBSW-140788 & GBSW-140787 | Zephyr Upload Log files And Existing test cycle execution
jeeva.p authored 9 months ago
13f15183
S. DURAIKRISHNAN - 10154843's avatar
GBSCAFDEV-23 & 24 configuration and reading the value from CSV
S. DURAIKRISHNAN - 10154843 authored 9 months ago
e2d69717
S. DURAIKRISHNAN - 10154843's avatar
Modified the DataHelper.java based on Arun's Review comments GBSCAFDEV-12
S. DURAIKRISHNAN - 10154843 authored 9 months ago
dcbece76
S. DURAIKRISHNAN - 10154843's avatar
APISteps.java and APIUtils.java is updated based on Arun's Review comment
S. DURAIKRISHNAN - 10154843 authored 9 months ago
6fe95316
Sanguth Thalaivan K - 10132888's avatar
GBSW-139533 | Fetch Search Results from Splunk
Sanguth Thalaivan K - 10132888 authored 9 months ago
d5b7e2b3
Sanguth Thalaivan K - 10132888's avatar
Merge branch 'release/2.0' of... 
Sanguth Thalaivan K - 10132888 authored 9 months ago
7e86e967
jeeva.p's avatar
GBSCAF|GBSW-140788 & GBSW-140787 | Zephyr Integration
jeeva.p authored 9 months ago
7e30c48f
S. DURAIKRISHNAN - 10154843's avatar
temporary chrome driver solution has been added
S. DURAIKRISHNAN - 10154843 authored 9 months ago
a1df1574
S. DURAIKRISHNAN - 10154843's avatar
Merge remote-tracking branch 'origin/release/2.0' into release/2.0
S. DURAIKRISHNAN - 10154843 authored 9 months ago
bd055024
jeeva.p's avatar
GBSCAF|GBSCAFDEV-25| Zephyr test case creation
jeeva.p authored 9 months ago
16162dae
jeeva.p's avatar
GBSCAF|GBSCAFDEV-25| Zephyr test case creation config file
jeeva.p authored 9 months ago
3aa1da2f
Sanguth Thalaivan K - 10132888's avatar
GBSW-139533 | Fetch Search Results from Splunk | Method Name update
Sanguth Thalaivan K - 10132888 authored 9 months ago
5a9bb679
jeeva.p's avatar
GBSCAF|GWT format validations
jeeva.p authored 9 months ago
8b1a8489
jeeva.p's avatar
GBSCAF|Access modifiers updated
jeeva.p authored 9 months ago
7527d2b9
S. DURAIKRISHNAN - 10154843's avatar
Changes did for Chrome driver updation 116 - GBSW-141515
S. DURAIKRISHNAN - 10154843 authored 9 months ago
c5afb013
jeeva.p's avatar
GBSCAF|Adding new step for explicit wait
jeeva.p authored 9 months ago
eddbb880
S. DURAIKRISHNAN - 10154843's avatar
Modified the extent report and pdf report with timestamp
S. DURAIKRISHNAN - 10154843 authored 9 months ago
55f046cf
jeeva.p's avatar
GBSCAF|GBSCAFDEV-164, GBSCAFDEV-165 & GBSCAFDEV-166 |GWT format and access... 
jeeva.p authored 9 months ago
377a2af3
jeeva.p's avatar
GBSCAF|GBSCAFDEV-166 | Web wrapper methods and steps creation
jeeva.p authored 9 months ago
3c157de4
jeeva.p's avatar
GBSCAF | Web steps issue fix
jeeva.p authored 9 months ago
68b0dd0e
S. DURAIKRISHNAN - 10154843's avatar
Changes did in BaseRunner
S. DURAIKRISHNAN - 10154843 authored 9 months ago
e68a6cd0
Gopalsamy Kannan - 10174964's avatar
Retry failed scenario.
Gopalsamy Kannan - 10174964 authored 9 months ago
1d8b26e7
jeeva.p's avatar
GBSCAFDEV-191 | Adding logs in Web Utils
jeeva.p authored 9 months ago
142f8cac
jeeva.p's avatar
GBSCAFDEV-191 | Adding logs in PlatformIndependentUtils
jeeva.p authored 9 months ago
5cb64e54
jeeva.p's avatar
GBSCAFDEV-191 | Adding logs in APIUtils
jeeva.p authored 9 months ago
17e4c428
jeeva.p's avatar
GBSCAFDEV-26 | Zephyr naming convention
jeeva.p authored 9 months ago
5e05f884
jeeva.p's avatar
GBSCAFDEV-266 | Extent report timestamp issue
jeeva.p authored 9 months ago
e8a4166c
jeeva.p's avatar
GBSCAFDEV-260 | Solution for driver changes
jeeva.p authored 8 months ago
0af224fc
jeeva.p's avatar
GBSCAFDEV-267 | Adding comment lines
jeeva.p authored 8 months ago
01e59db2
S. DURAIKRISHNAN - 10154843's avatar
Push Log to Reprot portal - https://jira.onefiserv.net/browse/GBSCAFDEV-181
S. DURAIKRISHNAN - 10154843 authored 8 months ago
a740b38b
S. DURAIKRISHNAN - 10154843's avatar
PasswordEncryption.java has been updated GBSCAFDEV-4
S. DURAIKRISHNAN - 10154843 authored 8 months ago
48de4490
S. DURAIKRISHNAN - 10154843's avatar
Log info update with Report portal
S. DURAIKRISHNAN - 10154843 authored 8 months ago
d09f06d2
Arun Subramanian Veerabahu - 10132064's avatar
Merge branch 'release/2.0' into 'feature/2.0' 
Arun Subramanian Veerabahu - 10132064 authored 8 months ago
f4f94479
Arun Subramanian Veerabahu - 10132064's avatar
Merge branch 'feature/2.0' into 'release/2.0' 
Arun Subramanian Veerabahu - 10132064 authored 8 months ago
aa48cfe3
jeeva.p's avatar
GBSCAFDEV-402 | Config structure change for rerunning failure scenarios
jeeva.p authored 8 months ago
9799c2f9
jeeva.p's avatar
GBSCAFDEV-333 | ProtectConfigFile to protect Config.yaml file in code merge
jeeva.p authored 8 months ago
09e06765
S. DURAIKRISHNAN - 10154843's avatar
Variable name changed for video recording changes did config.yaml and Hooks.java
S. DURAIKRISHNAN - 10154843 authored 7 months ago
0dc1a3f4
S. DURAIKRISHNAN - 10154843's avatar
Changes did for wait time configuration GBSCAFDEV-435 and element highlighter - GBSCAFDEV-437
S. DURAIKRISHNAN - 10154843 authored 7 months ago
12c49130
S. DURAIKRISHNAN - 10154843's avatar
Changes did in APIUtils.java
S. DURAIKRISHNAN - 10154843 authored 7 months ago
cfa101a2
S. DURAIKRISHNAN - 10154843's avatar
API Wrapper methods has been added - GBSCAFDEV-443
S. DURAIKRISHNAN - 10154843 authored 7 months ago
d7831272
jeeva.p's avatar
Code fix in API utils
jeeva.p authored 7 months ago
774564ad
jeeva.p's avatar
GBSCAFADT-39 | Nexus integration
jeeva.p authored 7 months ago
29e78f10
jeeva.p's avatar
GBSCAFDEV-426 | Protect file plugin
jeeva.p authored 7 months ago
560df2cf
S. DURAIKRISHNAN - 10154843's avatar
Changes did for Mobile execution in the GBSCAF iOS
S. DURAIKRISHNAN - 10154843 authored 7 months ago
4347003e
jpriyam's avatar
FLLogvalidator File INput
jpriyam authored 7 months ago
8147ab57
jpriyam's avatar
FLLogvalidator File INput
jpriyam authored 7 months ago
97886ba3
jpriyam's avatar
FLLogvalidator File INput
jpriyam authored 7 months ago
35e794f8
S. DURAIKRISHNAN - 10154843's avatar
Mobile Android Dry run with Clover script has been updated
S. DURAIKRISHNAN - 10154843 authored 7 months ago
ecd942ee
S. DURAIKRISHNAN - 10154843's avatar
Merge remote-tracking branch 'origin/release/1.1' into release/1.1
S. DURAIKRISHNAN - 10154843 authored 7 months ago
d01e8971
S. DURAIKRISHNAN - 10154843's avatar
API Wrapper methods has been added - GBSCAFDEV-443
S. DURAIKRISHNAN - 10154843 authored 7 months ago
6c454036
S. DURAIKRISHNAN - 10154843's avatar
selenium-remote-driver dependency has been updated
S. DURAIKRISHNAN - 10154843 authored 7 months ago
ed23e8f3
jeeva.p's avatar
Reverting jaishree commits
jeeva.p authored 7 months ago
b59dafcb
jeeva.p's avatar
GBSCAFDEV-469|Zephyr code cleanup
jeeva.p authored 7 months ago
4d6df74e
jeeva.p's avatar
GBSCAFDEV-469|Zephyr code cleanup
jeeva.p authored 7 months ago
c98d931f
S. DURAIKRISHNAN - 10154843's avatar
Changes did for GBSCAFDEV-467
S. DURAIKRISHNAN - 10154843 authored 7 months ago
13274168
jeeva.p's avatar
GBSCAFDEV | Nexus-Ci Integration
jeeva.p authored 7 months ago
8c8c5951
jeeva.p's avatar
GBSCAFDEV | POM xml changes
jeeva.p authored 7 months ago
9dbd8945
jeeva.p's avatar
GBSCAFDEV | Jenkins test
jeeva.p authored 7 months ago
4fa13f19
jeeva.p's avatar
GBSCAFDEV | Jenkins test
jeeva.p authored 7 months ago
ca0a5457
jeeva.p's avatar
GBSCAFDEV | Report template change
jeeva.p authored 7 months ago
df054bde
jeeva.p's avatar
GBSCAFDEV | Default profile added in pom.xml file
jeeva.p authored 7 months ago
1d20ae20
jeeva.p's avatar
GBSCAFDEV | Jenkins test commit
jeeva.p authored 7 months ago
ebc3ac10
Sanguth Thalaivan K - 10132888's avatar
PDF repert name change
Sanguth Thalaivan K - 10132888 authored 7 months ago
79a132d8
S. DURAIKRISHNAN - 10154843's avatar
Report structure has been changed
S. DURAIKRISHNAN - 10154843 authored 7 months ago
f11c38ff
jeeva.p's avatar
GBSCAFDEV | Report structure changes
jeeva.p authored 7 months ago
75737ea8
jeeva.p's avatar
GBSCAFDEV | Code clean up
jeeva.p authored 7 months ago
ef979a38
jeeva.p's avatar
GBSCAFDEV| Nexus changes in pom file
jeeva.p authored 6 months ago
ab6c5aa4
jeeva.p's avatar
GBSCAFDEV| Spark report changes
jeeva.p authored 6 months ago
cae0fdb4
jeeva.p's avatar
GBSCAFDEV| Zephyr changes for test case creation
jeeva.p authored 6 months ago
b88d5a4b
jeeva.p's avatar
GBSCAFDEV-509 | report plugin dependency issue fix
jeeva.p authored 6 months ago
b55b88bd
