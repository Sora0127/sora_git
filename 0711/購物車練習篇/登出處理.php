<?php
    session_start();
    session_destroy();
    foreach($_COOKIE as $書 =>$資料堆){
        if($書=="PHPSESSID") continue;
        setcookie($書,"",time()-10);
    }
    print('<script>
                alert("已登出");
                location.href="登入.html";
            </script>');
?>