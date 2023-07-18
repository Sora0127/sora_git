<?php
  header("Content-type:text/html; charset=utf-8");  

  setcookie("文字測試","溫敏淦");
  setcookie("自動毀滅測試",123,time()+10);
?>