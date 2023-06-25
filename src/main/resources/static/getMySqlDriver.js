function getMysqlDriver() {
    console.log("shankai start");
    var mysql = require('mysql');
    console.log("shankai" + mysql);
    return mysql;
}

getMysqlDriver();