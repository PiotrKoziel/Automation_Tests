$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/Cucumber/Features/CreateCodersLabAccount.feature");
formatter.feature({
  "line": 1,
  "name": "create account on CodersLab web page",
  "description": "",
  "id": "create-account-on-coderslab-web-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#  Scenario: Creating new user account"
    },
    {
      "line": 4,
      "value": "#    Given open browser with coders lab page"
    },
    {
      "line": 5,
      "value": "#    When  I go to sign in page"
    },
    {
      "line": 6,
      "value": "#    And   I type the following email address @op.pl and create account"
    },
    {
      "line": 7,
      "value": "#    And   I choose title"
    },
    {
      "line": 8,
      "value": "#    And   I type first name Jan and last name Janowski"
    },
    {
      "line": 9,
      "value": "#    And   I confirm email address"
    },
    {
      "line": 10,
      "value": "#    And   I type following password Janek"
    },
    {
      "line": 11,
      "value": "#    And   I select day of birth"
    },
    {
      "line": 12,
      "value": "#    And   I select month of birth"
    },
    {
      "line": 13,
      "value": "#    And   I select year of birth"
    },
    {
      "line": 14,
      "value": "#    And   I have created new account"
    },
    {
      "line": 15,
      "value": "#    Then  New user is registered and I see the following \"Your account has been created\""
    },
    {
      "line": 16,
      "value": "#    And   close the browser"
    },
    {
      "line": 17,
      "value": "##"
    },
    {
      "line": 18,
      "value": "##"
    }
  ],
  "line": 19,
  "name": "Creating new user account - parameters",
  "description": "",
  "id": "create-account-on-coderslab-web-page;creating-new-user-account---parameters",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 20,
  "name": "an open browser with coderslab web site",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I go to sign in page",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I type the following email address \u003cEmail\u003e and create account",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I choose title",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I type first name \u003cFirstName\u003e and last name \u003cLastName\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I confirm email address",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I type following password \u003cPassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I select day of birth",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I select month of birth",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I select year of birth",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I have created new account",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "New user is registered and I see the following \"Your account has been created\"",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 33,
  "name": "",
  "description": "",
  "id": "create-account-on-coderslab-web-page;creating-new-user-account---parameters;",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "Email",
        "Password"
      ],
      "line": 34,
      "id": "create-account-on-coderslab-web-page;creating-new-user-account---parameters;;1"
    },
    {
      "cells": [
        "Tytus",
        "Nowak",
        "@wp.pl",
        "tytusnow"
      ],
      "line": 35,
      "id": "create-account-on-coderslab-web-page;creating-new-user-account---parameters;;2"
    },
    {
      "cells": [
        "Jan",
        "Kowalski",
        "@onet.pl",
        "kowal"
      ],
      "line": 36,
      "id": "create-account-on-coderslab-web-page;creating-new-user-account---parameters;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 35,
  "name": "Creating new user account - parameters",
  "description": "",
  "id": "create-account-on-coderslab-web-page;creating-new-user-account---parameters;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 20,
  "name": "an open browser with coderslab web site",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I go to sign in page",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I type the following email address @wp.pl and create account",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I choose title",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I type first name Tytus and last name Nowak",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I confirm email address",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I type following password tytusnow",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I select day of birth",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I select month of birth",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I select year of birth",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I have created new account",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "New user is registered and I see the following \"Your account has been created\"",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "CreateCodersLabAccount.openCodersLabPage()"
});
formatter.result({
  "duration": 4532355235,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: cannot determine loading status\nfrom disconnected: received Inspector.detached event\n  (Session info: chrome\u003d86.0.4240.75)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027piotrk\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.4.0-52-generic\u0027, java.version: \u002714.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.75, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: /tmp/.com.google.Chrome.zKuxGH}, goog:chromeOptions: {debuggerAddress: localhost:41555}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: b8b4309a88d57fd34c6dac4a5303f00a\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\n\tat steps.CreateCodersLabAccount.openCodersLabPage(CreateCodersLabAccount.java:27)\n\tat ✽.Given an open browser with coderslab web site(src/Cucumber/Features/CreateCodersLabAccount.feature:20)\n",
  "status": "failed"
});
formatter.match({
  "location": "CreateCodersLabAccount.goToSignPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "@wp.pl",
      "offset": 35
    }
  ],
  "location": "CreateCodersLabAccount.enterEmailAddress(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateCodersLabAccount.chooseTitle()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Tytus",
      "offset": 18
    },
    {
      "val": "Nowak",
      "offset": 38
    }
  ],
  "location": "CreateCodersLabAccount.typeFullName(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateCodersLabAccount.confirmEmail()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "tytusnow",
      "offset": 26
    }
  ],
  "location": "CreateCodersLabAccount.setPassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateCodersLabAccount.setDayOfBirth()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateCodersLabAccount.setMonthOfBirth()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateCodersLabAccount.setYearOfBirth()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateCodersLabAccount.newAccountCreated()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\"Your account has been created\"",
      "offset": 47
    }
  ],
  "location": "CreateCodersLabAccount.confirmRemark(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateCodersLabAccount.closeTheBrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 36,
  "name": "Creating new user account - parameters",
  "description": "",
  "id": "create-account-on-coderslab-web-page;creating-new-user-account---parameters;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 20,
  "name": "an open browser with coderslab web site",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I go to sign in page",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I type the following email address @onet.pl and create account",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I choose title",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I type first name Jan and last name Kowalski",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I confirm email address",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I type following password kowal",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I select day of birth",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I select month of birth",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I select year of birth",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I have created new account",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "New user is registered and I see the following \"Your account has been created\"",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "CreateCodersLabAccount.openCodersLabPage()"
});
formatter.result({
  "duration": 2844484728,
  "status": "passed"
});
formatter.match({
  "location": "CreateCodersLabAccount.goToSignPage()"
});
formatter.result({
  "duration": 69624259,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d86.0.4240.75)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027piotrk\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.4.0-52-generic\u0027, java.version: \u002714.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.75, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: /tmp/.com.google.Chrome.3QlpZ4}, goog:chromeOptions: {debuggerAddress: localhost:41219}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 6678ce89256f61037a70bda650d1fdc0\n*** Element info: {Using\u003dcss selector, value\u003da[class*\u003d\u0027login\u0027]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:420)\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:431)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat steps.CreateCodersLabAccount.goToSignPage(CreateCodersLabAccount.java:32)\n\tat ✽.When I go to sign in page(src/Cucumber/Features/CreateCodersLabAccount.feature:21)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "@onet.pl",
      "offset": 35
    }
  ],
  "location": "CreateCodersLabAccount.enterEmailAddress(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateCodersLabAccount.chooseTitle()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Jan",
      "offset": 18
    },
    {
      "val": "Kowalski",
      "offset": 36
    }
  ],
  "location": "CreateCodersLabAccount.typeFullName(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateCodersLabAccount.confirmEmail()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "kowal",
      "offset": 26
    }
  ],
  "location": "CreateCodersLabAccount.setPassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateCodersLabAccount.setDayOfBirth()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateCodersLabAccount.setMonthOfBirth()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateCodersLabAccount.setYearOfBirth()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateCodersLabAccount.newAccountCreated()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\"Your account has been created\"",
      "offset": 47
    }
  ],
  "location": "CreateCodersLabAccount.confirmRemark(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateCodersLabAccount.closeTheBrowser()"
});
formatter.result({
  "status": "skipped"
});
});