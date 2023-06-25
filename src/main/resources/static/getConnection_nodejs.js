var mysql = require('mysql');
var connection = mysql.createConnection({
  host     : 'localhost',
  user     : 'root',
  port: '3306',
  password : '123456',
  database : 'spring'
});
connection.connect();
console.log("mysql has connnected");
connection.end();
console.log("mysql has closed");