<?php
    echo "<h1>session建立</h1>";
    session_start();
    $_SESSION['使用者']="kobayashisora";
    $_SESSION['帳號']="sora-025";
    
    print_r($_SESSION);
?>