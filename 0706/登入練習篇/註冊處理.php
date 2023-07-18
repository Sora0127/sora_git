<?php
$帳號=$_POST["帳號"];
$密碼=$_POST["密碼"];

if(empty($帳號)||empty($密碼)){
    print('<script>
            alert("無效的存取權");
            location.href="登入介面.html";
        </script>');
        exit();
}

$連接=mysqli_connect("localhost","root","","暑假研習");

$sql="SELECT * FROM `帳密表` WHERE `帳號`='$帳號' AND `密碼`='$密碼'";
    
$資料堆=mysqli_query($連接,$sql);


if(mysqli_num_rows($資料堆)>0){
    print('<script>
    alert("註冊失敗，已有此帳號");
    location.href="登入介面.html";
   </script>');
}

$sql="INSERT INTO `帳密表`(`帳號`, `密碼`) VALUES ('$帳號','$密碼')";
mysqli_query($連接,$sql);
mysqli_close($連接);
print('<script>
        alert("註冊成功");
        location.href="登入介面.html";
       </script>');


?>