<!DOCTYPE html>
<html lang="zh-TW">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="style.css">
    <style>
        body{
            background-color: rgba(255,255,255,0);
        }
        td:nth-child(1){
            background-color: rgb(69, 141, 161);
            color: #FFF;
            text-align: center;
        }
        tr:nth-child(1+n){
            background-color: rgb(169, 181, 181);
        }
        
        td:not(:nth-child(2))>input{
            width: 100px;
        }
        td{
            padding: 10px;
        }
        
        .修改{
            padding: 10px;   
            margin: 10px;
        }
    </style>
</head>
<body>
    <form action="修改處理.php" method="post">
        <table>
            <tr>
                <td>書號</td>
                <td>
                    <input type="text" name="書號" value="<?php print($_GET["書號"]); ?>" readonly>
                </td>
            </tr>
            <tr>
                <td>書名</td>
                <td>
                    <input type="text" name="書名" value="<?php print($_GET["書名"]) ?>" readonly>
                </td>
            </tr>
            <tr>
                <td>定價</td>
                <td>
                    <input type="text" name="定價" value="<?php print($_GET["定價"]) ?>" readonly>
                </td>
            </tr>
            <tr>
                <td>訂購數量</td>
                <td>
                    <input type="number" name="訂購數量" value="<?php print($_GET["訂購數量"]) ?>" min="1">
                </td>
            </tr>
        </table>
        <div style="margin-top: 10px;">
            <input class="b-set" type="submit" value="送出">
            <a class="b-set" style="text-decoration: none; font-size:11pt" href=<?php print"刪除.php?書號=".$_GET["書號"]."&書名=".$_GET["書名"]."&定價=".$_GET["定價"]."&訂購數量=".$_GET["訂購數量"].""?>>刪除此筆</a>
        </div>
    </form>
</body>
</html>