<?php
    $書號=$_GET["書號"];
    $書名=$_GET["書名"];
    $定價=$_GET["定價"];
    $訂購數量=$_GET["訂購數量"];

    setcookie($書號,implode(",",array($書名,$定價,$訂購數量)),time()-10);
    header("location:購物車列表.php");
?>