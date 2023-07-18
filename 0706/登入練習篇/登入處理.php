<?php
    $帳號=$_POST["帳號"];
    $密碼=$_POST["密碼"];
    $連接=mysqli_connect("localhost","root","","暑假研習");
    $sql="SELECT * FROM `帳密表` WHERE `帳號`='$帳號' AND `密碼`='$密碼'";
    
    $資料堆=mysqli_query($連接,$sql);
    
    if(mysqli_num_rows($資料堆)>0){
        session_start();
        $_SESSION['帳號']=$帳號;
        
        mysqli_close($連接);
        print('<script>
                alert("登入成功");
                location.href="主頁面.php";
               </script>');
    }else{
        mysqli_close($連接);

        print('<script>
                alert("登入失敗");
                location.href="登入介面.html";
               </script>');
    }

?>