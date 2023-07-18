<?php
    $書號=$_POST["書號"];
    $書名=$_POST["書名"];
    $定價=$_POST["定價"];
    $訂購數量=$_POST["訂購數量"];

    setcookie($書號,implode(",",array($書名,$定價,$訂購數量)));
    header("location:購物車列表.php");
?>