<?php
    $書號=$_POST["書號"];
    $書名=$_POST["書名"];
    $價格=$_POST["價格"];
    $數量=$_POST["數量"];
    for($i=0;$i<count($書號);$i++){
        if($數量[$i]==0) continue;
        if(!empty($_COOKIE[$書號[$i]])){
            setcookie($書號[$i],implode(",",array($書名[$i],$價格[$i],explode(",",$_COOKIE[$書號[$i]])[2]+$數量[$i])));
        }else{
            setcookie($書號[$i],implode(",",array($書名[$i],$價格[$i],$數量[$i])));
        }
    }
    print('<script>
                alert("成功加入購物車");
                location.href="書單列表.php";
               </script>');
?>