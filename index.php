<?php
$server= "localhost";

$username = "root";
$password ="";

$con = mysqli_connect($server ,$username , $password);

if(!$con)
{
    die("connection failed due to" . mysqli_connect_error());
}
//echo "Success connecting to the database";
 $name=$_POST['name'];
 $email=$_POST['email'];
 $phone=$_POST['phone'];
 $message=$_POST['message'];
 $crust=$_POST['crust'];
 $sauce=$_POST['sauce'];
 $cheese=$_POST['cheese'];
 $toppings=$_POST['toppings'];
 $sql = "INSERT INTO `pizzario` ( `name`, `email`, `phone`, `message`, `crust`, 
`sauce`, `cheese`, `toppings`, `date`) VALUES ('$name', '$email', 
'$phone', '$message', '$crust', '$sauce', '$cheese', '$toppings', CURRENT_TIMESTAMP);";

echo $sql;
?>