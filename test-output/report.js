$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ramya/eclipse-workspace/javalearning/FreeCRM_BDDFramework/src/main/java/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "FreeCRM Login Functionality",
  "description": "",
  "id": "freecrm-login-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "CRM Login Functionality",
  "description": "",
  "id": "freecrm-login-functionality;crm-login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "# with Examples keyword"
    }
  ],
  "line": 7,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "The Title of Login Page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User is on Home Page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User closes the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "freecrm-login-functionality;crm-login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 16,
      "id": "freecrm-login-functionality;crm-login-functionality;;1"
    },
    {
      "cells": [
        "batchautomation",
        "Test@12345"
      ],
      "line": 17,
      "id": "freecrm-login-functionality;crm-login-functionality;;2"
    },
    {
      "cells": [
        "tom",
        "Test123@12345"
      ],
      "line": 18,
      "id": "freecrm-login-functionality;crm-login-functionality;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "CRM Login Functionality",
  "description": "",
  "id": "freecrm-login-functionality;crm-login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "# with Examples keyword"
    }
  ],
  "line": 7,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "The Title of Login Page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters \"batchautomation\" and \"Test@12345\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User is on Home Page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User closes the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.verifyLoginPage()"
});
formatter.result({
  "duration": 10523416100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.the_Title_of_Login_Page_is_Free_CRM()"
});
formatter.result({
  "duration": 42100200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "batchautomation",
      "offset": 13
    },
    {
      "val": "Test@12345",
      "offset": 35
    }
  ],
  "location": "LoginStepDef.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 1103999000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 3539838100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 36153400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.closeTheBroswer()"
});
formatter.result({
  "duration": 829787000,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "CRM Login Functionality",
  "description": "",
  "id": "freecrm-login-functionality;crm-login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "# with Examples keyword"
    }
  ],
  "line": 7,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "The Title of Login Page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters \"tom\" and \"Test123@12345\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User is on Home Page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User closes the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDef.verifyLoginPage()"
});
formatter.result({
  "duration": 7543413900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.the_Title_of_Login_Page_is_Free_CRM()"
});
formatter.result({
  "duration": 21705600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tom",
      "offset": 13
    },
    {
      "val": "Test123@12345",
      "offset": 23
    }
  ],
  "location": "LoginStepDef.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 666268500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 2329984900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 211440800,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cCRMPRO[]\u003e but was:\u003cCRMPRO[ - CRM software for customer relationship management, sales, and support.]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat stepDefinitions.LoginStepDef.user_is_on_Home_Page(LoginStepDef.java:72)\r\n\tat ✽.Then User is on Home Page(C:/Users/ramya/eclipse-workspace/javalearning/FreeCRM_BDDFramework/src/main/java/features/login.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDef.closeTheBroswer()"
});
formatter.result({
  "status": "skipped"
});
});