<!DOCTYPE html>
<html lang="zh-TW">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="style.css">
    <style>
        td:first-child{
            padding: 10px 10px 10px 0;
        }
        td{
            padding: 10px;
        }
    </style>
</head>
<body>
    <?php
        session_start();
        if(empty($_SESSION["帳號"])){
            print('<script>
                    alert("無效的存取權");
                    location.href="登入介面.html";
                </script>');
                exit();
        }
        echo "<h1>使用者名稱:".$_SESSION["帳號"]."</h1>";
    ?>
    <div class="清單區塊" style="width: 300px;">
        <h3 style="margin-top:5px;">購物資訊與清單</h3>
        <form name="商品">
            <table>
                <tr>
                    <td>🍎蘋果</td>
                    <td><input type="number" class="in-set" value="0" name="蘋果" max="5" min="0"></td>
                </tr>
                <tr>
                    <td>🍍鳳梨</td>
                    <td><input type="number" class="in-set" value="0" name="鳳梨" max="5" min="0"></td>
                </tr>
                <tr>
                    <td>🍌香蕉</td>
                    <td><input type="number" class="in-set" value="0" name="香蕉" max="5" min="0"></td>
                </tr>
                <tr>
                    <td>🍊橘子</td>
                    <td><input type="number" class="in-set" value="0" name="橘子" max="5" min="0"></td>
                </tr>
            </table>
        </form>
    </div>
    <div style="margin-top:30px;">
        <a class="連結" href="./登出處理.php">登出</a>
    </div>
</body>
</html>