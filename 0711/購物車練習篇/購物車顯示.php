<!DOCTYPE html>
<html lang="zh-TW">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>購物車</title>
    <link rel="stylesheet" href="style.css">
    <style>
        
        tr:nth-child(1),td{
            background-color: rgb(69, 141, 161);
            color: #FFF;
            text-align: center;
        }
        
    </style>
    <script>
        function 重設高度(){
            var iframeid=document.getElementById("框"); 
            
            iframeid.height = iframeid.contentDocument.body.offsetHeight+20;  
            
        }
    </script>
</head>
<body>
<h1>KS訂書網</h1>
<h1>購物車</h1>
    <?php
        session_start();
        if(empty($_SESSION["帳號"])){
            print('<script>
                    alert("無效的存取權");
                    location.href="登入.html";
                </script>');
                exit();
        }
        echo "<h2>使用者名稱:".$_SESSION["帳號"]."</h2>";
        

    ?>
    
    <iframe style="margin-top: 10px; height:80px; width: 500px;" src="選單列.html" frameborder="0" ></iframe>
    <div  class="清單區塊" style="width:45rem;">
        <iframe id="框" src="購物車列表.php" frameborder="0" style="width: 100%;" onload="重設高度()" scrolling="no"></iframe>
    </div>
    <div style="margin:30px 0px;">
        <a class="連結" href="./登出處理.php">登出</a>
    </div>
        
</body>
</html>