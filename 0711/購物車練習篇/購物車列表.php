<!DOCTYPE html>
<html lang="zh-TW">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>購物車列表</title>
    <link rel="stylesheet" href="style.css">
    <style>
        body{
            background-color: rgba(255,255,255,0);
        }
        tr:nth-child(1){
            background-color: rgb(69, 141, 161);
            color: #FFF;
            text-align: center;
        }
        table{
            border-spacing:0;
        }
        tr:not(:first-child):not(:last-child) td{
            border-bottom: 1px solid #000;
        }
        td:not(:nth-child(2))>input{
            width: 100px;
        }
        td{
            padding: 14px 10px;
        }
        
        .修改{
            padding: 10px;   
            margin: 10px;
            border-radius: 5px;
        }
    </style>
</head>
<body>
    <table>
        <tr>
            <td>書號</td>
            <td>書名</td>
            <td>定價</td>
            <td>訂購數量</td>
            <td>修改</td>
        </tr>
        <?php
            
            foreach($_COOKIE as $書 =>$資料堆){
                if($書=="PHPSESSID") continue;
                $資料=explode(",",$資料堆);
        ?>
        <tr>
            <td>
                <input type="text" value="<?php print($書) ?>" readonly>
            </td>
            <td>
                <input type="text" value="<?php print($資料[0]) ?>" readonly>
            </td>
            <td>
                <input type="text" value="<?php print($資料[1]) ?>" readonly>
            </td>
            <td>
                <input type="text" value="<?php print($資料[2]) ?>" readonly>
            </td>
            <td>
                <a class="連結 修改" href="<?php print "修改.php?書號=$書&書名=".urlencode($資料[0])."&定價=$資料[1]&訂購數量=$資料[2]"?>">修改</a>
            </td>
        </tr>
        <?php
            }
        ?>
    </table>
</body>
</html>