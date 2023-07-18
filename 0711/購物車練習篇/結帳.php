<?php
    session_start();
    $連接=mysqli_connect("localhost","root","","暑假研習");
    $帳號=$_SESSION["帳號"];
    foreach($_COOKIE as $書 =>$資料堆){
        if($書=="PHPSESSID") continue;
        $資料=explode(",",$資料堆);
        $數量=$資料[2];

        date_default_timezone_set('Asia/Taipei');
    
        $時間=date("Y-m-d H:i:s");
        $sql="INSERT INTO `書訂單`(`訂購人`, `書號`, `訂購數量`,`下訂時間`) VALUES ('$帳號','$書','$數量','$時間')";
        mysqli_query($連接,$sql);
        setcookie($書,"",time()-10);
    }
    mysqli_close($連接);
    print('<script>
                window.open("訂購表.php","_bottom");
            </script>');
    
?>
