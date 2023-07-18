<?php
    session_start();
    // session_destroy();
    $_SESSION["教師"]="溫老師";
    print_r($_SESSION);
    // session_destroy();
    unset($_SESSION["教師"]);
    print("<br>");
    print_r($_SESSION);
?>