<!DOCTYPE html>
<html lang="zh-TW">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>訂購單</title>
    <link rel="stylesheet" href="style.css">
    <style>
        body{
            display: flex;
            flex-direction: column;
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
<h1>商品目錄</h1>
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
    
    <iframe style="margin-top: 10px; height:80px;" src="選單列.html" frameborder="0" ></iframe>
    <div class="清單區塊" style="width:40rem;">
        <iframe src="書單列表.php" id="框" frameborder="0"  style="width: 100%;" onload="重設高度()" scrolling="no"></iframe>
    </div>
    <div style="margin:30px 0px;">
        <a class="連結" href="./登出處理.php">登出</a>
    </div>
</body>
</html>