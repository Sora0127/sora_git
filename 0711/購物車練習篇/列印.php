<!DOCTYPE html>
<html lang="zh-TW">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>購物車列表</title>
    <link rel="stylesheet" href="style.css">
    <style>
        body{
            background-color:rgba(255,255,255,0);
        }
        table{
            border-spacing:0;
        }
        tr:not(:first-child):not(:last-child) td{
            border-bottom: 1px solid #000;
        }
        tr:nth-child(1){
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
    <form action="結帳.php" method="post">
        <table>
            <tr>
                <td>書號</td>
                <td>書名</td>
                <td>定價</td>
                <td>訂購數量</td>
                <td>小計</td>
            </tr>
            <?php
                $總計=0;
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
                    <input type="text" value="<?php print($資料[1]*$資料[2]) ?>" readonly>
                </td>
            </tr>
            <?php
                    $總計+=($資料[1]*$資料[2]);
                }
            ?>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td style="font-weight:bold;">總計</td>
                <td style="font-weight:bold;"><?php print$總計;?></td>
            </tr>
        </table>
        <div style="margin-top:10px;">
            <input type="submit" class="b-set" value="結帳">
        </div>
    </form>
</body>
</html>