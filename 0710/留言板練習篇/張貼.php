<?php
    date_default_timezone_set('Asia/Taipei');
    $作者=$_POST["作者"];
    $主題=$_POST["主題"];
    $時間=date("Y-m-d H:i:s");
    $內容=$_POST["內容"];
    $連接=mysqli_connect("localhost","root","","暑假研習");
    $sql="INSERT INTO `留言板`(`作者`, `主題`, `時間`, `內容`) VALUES ('$作者','$主題','$時間','$內容')";
    mysqli_query($連接,$sql);
    header("location:留言板.php");
    mysqli_close($連接);
?>