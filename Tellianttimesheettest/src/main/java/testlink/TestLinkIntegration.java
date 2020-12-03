package testlink;
import testlink.api.java.client.TestLinkAPIClient;
import testlink.api.java.client.TestLinkAPIException;
import utilities.PropertyFile;

public class TestLinkIntegration {

public static void updateResults(String testCase, String exception, String result) throws TestLinkAPIException {
    TestLinkAPIClient testlinkAPIClient = new TestLinkAPIClient(PropertyFile.prop.getProperty("APIKEY"), PropertyFile.prop.getProperty("Testlink_URL"));
    testlinkAPIClient.reportTestCaseResult(PropertyFile.prop.getProperty("project_Name"),
    		PropertyFile.prop.getProperty("Test_Plan"), testCase,PropertyFile.prop.getProperty("Build_Name"), exception, result);
  // System.out.println("testcase id"+testlinkAPIClient.getTestCaseIDByName("US132_TC01_Verify if Admin is able to Deactivate a role with user mapped"));
}

}