<?php        
        $姓氏=$_POST["姓氏"];
        $名字=$_POST["名字"];
        $出生日期=$_POST["出生日期"];
        $留言=$_POST["留言"];

        $連接=mysqli_connect("localhost","root","","暑假研習");
        $sql="INSERT INTO `暑假技術研習`(`姓氏`, `名字`, `出生日期`, `想說的話`) VALUES ('$姓氏','$名字','$出生日期','$留言')";
        mysqli_query($連接,$sql);
        mysqli_close($連接);
        print('<script>
                alert("送出成功");
                location.href="表單練習.php";
               </script>');
?>