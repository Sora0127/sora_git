<?php
    $帳號=$_POST["帳號"];
    $密碼=$_POST["密碼"];
    $連接=mysqli_connect("localhost","root","","暑假研習");
    $sql="SELECT * FROM `書庫帳密表` WHERE `帳號`='$帳號' AND `密碼`='$密碼'";
    
    $資料堆=mysqli_query($連接,$sql);
    
    if(mysqli_num_rows($資料堆)>0){
        session_start();
        $_SESSION['帳號']=$帳號;
        
        mysqli_close($連接);
        
        if(mysqli_fetch_assoc($資料堆)["權限"]=="1"){
            print('<script>
                    alert("登入成功，管理者");
                    location.href="./管理端/訂單管理.php";
                   </script>');
        }else{
            print('<script>
                    alert("登入成功");
                    location.href="訂購表.php";
                   </script>');
        }
    }else{
        mysqli_close($連接);

        print('<script>
                alert("登入失敗");
                location.href="登入.html";
               </script>');
    }

?>