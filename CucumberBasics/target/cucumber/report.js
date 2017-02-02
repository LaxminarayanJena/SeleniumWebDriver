$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "In order to perform sucessful login\r\nAs a user\r\nI want to enter correct username and password",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "duration": 281066,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "In order to verify login to facebook",
  "description": "",
  "id": "login;in-order-to-verify-login-to-facebook",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "user navigates to facebook website",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user validates the homepage title",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user entered the username",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user entered the password",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user should be successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.user_navigates_to_facebook_website()"
});
formatter.result({
  "duration": 145724143,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_validates_the_homepage_title()"
});
formatter.result({
  "duration": 67503,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_entered_the_username()"
});
formatter.result({
  "duration": 86846,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_entered_the_password()"
});
formatter.result({
  "duration": 205273,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_should_be_successfully_logged_in()"
});
formatter.result({
  "duration": 82899,
  "status": "passed"
});
formatter.after({
  "duration": 71845,
  "status": "passed"
});
formatter.uri("logintoprod.feature");
formatter.feature({
  "line": 2,
  "name": "Login to production",
  "description": "In order to perform sucessful login to production\r\nAs a user\r\nI want to enter correct username and password",
  "id": "login-to-production",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@sandbox"
    }
  ]
});
formatter.scenarioOutline({
  "line": 11,
  "name": "In order to verify login to facebook production",
  "description": "",
  "id": "login-to-production;in-order-to-verify-login-to-facebook-production",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 12,
  "name": "user entered \"\u003cusername\u003e\" username",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user entered \"\u003cpassword\u003e\" password",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user select the  age category",
  "rows": [
    {
      "cells": [
        "age",
        "location"
      ],
      "line": 15
    },
    {
      "cells": [
        "below18",
        "india"
      ],
      "line": 16
    },
    {
      "cells": [
        "above18",
        "usa"
      ],
      "line": 17
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user validates the  captcha image",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user \"\u003cloginType\u003e\" successfully logged in",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "login-to-production;in-order-to-verify-login-to-facebook-production;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "loginType"
      ],
      "line": 22,
      "id": "login-to-production;in-order-to-verify-login-to-facebook-production;;1"
    },
    {
      "cells": [
        "valid",
        "valid",
        "should be"
      ],
      "line": 23,
      "id": "login-to-production;in-order-to-verify-login-to-facebook-production;;2"
    },
    {
      "cells": [
        "invalid",
        "inavlid",
        "shouldnot"
      ],
      "line": 24,
      "id": "login-to-production;in-order-to-verify-login-to-facebook-production;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 205273,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "user navigates to facebook website",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user validates the homepage title",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.user_navigates_to_facebook_website()"
});
formatter.result({
  "duration": 196983,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_validates_the_homepage_title()"
});
formatter.result({
  "duration": 84477,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "In order to verify login to facebook production",
  "description": "",
  "id": "login-to-production;in-order-to-verify-login-to-facebook-production;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@sandbox"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user entered \"valid\" username",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user entered \"valid\" password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user select the  age category",
  "rows": [
    {
      "cells": [
        "age",
        "location"
      ],
      "line": 15
    },
    {
      "cells": [
        "below18",
        "india"
      ],
      "line": 16
    },
    {
      "cells": [
        "above18",
        "usa"
      ],
      "line": 17
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user validates the  captcha image",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user \"should be\" successfully logged in",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 14
    }
  ],
  "location": "LoginProdStep.user_entered_username(String)"
});
formatter.result({
  "duration": 2888429,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 14
    }
  ],
  "location": "LoginProdStep.user_entered_password(String)"
});
formatter.result({
  "duration": 105795,
  "status": "passed"
});
formatter.match({
  "location": "LoginProdStep.user_select_the_age_category(DataTable)"
});
formatter.result({
  "duration": 1206374,
  "status": "passed"
});
formatter.match({
  "location": "LoginProdStep.user_validates_the_captcha_image()"
});
formatter.result({
  "duration": 60793,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "should be",
      "offset": 6
    }
  ],
  "location": "LoginProdStep.user_successfully_logged_in(String)"
});
formatter.result({
  "duration": 94347,
  "status": "passed"
});
formatter.after({
  "duration": 63950,
  "status": "passed"
});
formatter.after({
  "duration": 47371,
  "status": "passed"
});
formatter.before({
  "duration": 183167,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "user navigates to facebook website",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user validates the homepage title",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.user_navigates_to_facebook_website()"
});
formatter.result({
  "duration": 181588,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_validates_the_homepage_title()"
});
formatter.result({
  "duration": 69082,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "In order to verify login to facebook production",
  "description": "",
  "id": "login-to-production;in-order-to-verify-login-to-facebook-production;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@sandbox"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user entered \"invalid\" username",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user entered \"inavlid\" password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user select the  age category",
  "rows": [
    {
      "cells": [
        "age",
        "location"
      ],
      "line": 15
    },
    {
      "cells": [
        "below18",
        "india"
      ],
      "line": 16
    },
    {
      "cells": [
        "above18",
        "usa"
      ],
      "line": 17
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user validates the  captcha image",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user \"shouldnot\" successfully logged in",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "invalid",
      "offset": 14
    }
  ],
  "location": "LoginProdStep.user_entered_username(String)"
});
formatter.result({
  "duration": 125138,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "inavlid",
      "offset": 14
    }
  ],
  "location": "LoginProdStep.user_entered_password(String)"
});
formatter.result({
  "duration": 118427,
  "status": "passed"
});
formatter.match({
  "location": "LoginProdStep.user_select_the_age_category(DataTable)"
});
formatter.result({
  "duration": 166981,
  "status": "passed"
});
formatter.match({
  "location": "LoginProdStep.user_validates_the_captcha_image()"
});
formatter.result({
  "duration": 168561,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shouldnot",
      "offset": 6
    }
  ],
  "location": "LoginProdStep.user_successfully_logged_in(String)"
});
formatter.result({
  "duration": 104215,
  "status": "passed"
});
formatter.after({
  "duration": 41054,
  "status": "passed"
});
formatter.after({
  "duration": 41450,
  "status": "passed"
});
});