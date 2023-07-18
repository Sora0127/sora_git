<!DOCTYPE html>
<html lang="zh-TW">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="style.css">
    <style>
        body{
            background-color: #fff;
        }
        body{
            background-color: #fff;
        }
        table{
            border-spacing:0;
        }
        tr:nth-child(1){
            background-color: rgb(69, 141, 161);
            color: #FFF;
            text-align: center;
        }
        tr:not(:first-child):not(:last-child) td{
            border-bottom: 1px solid #000;
        }
        
        td>input[type=text]{
            width: 80px;
        }
        td:nth-child(4)>input[type=text]{
            width: 130px;
        }
        td{
            padding: 10px;
        }
        
    </style>
</head>
<body>
    
        <table>
                <tr>
                    <td>訂購人</td>
                    <td>書號</td>
                    <td>訂購數量</td>
                    <td>下訂時間</td>
                </tr>
                <?php
                    $連接=mysqli_connect("localhost","root","","暑假研習");
                    $sql="SELECT * FROM `書訂單` ORDER BY `下訂時間` DESC";
                    $資料堆=mysqli_query($連接,$sql);
                    for($i=0;$i<mysqli_num_rows($資料堆);$i++){
                        $資料列=mysqli_fetch_assoc($資料堆);
                ?>
                <tr>
                    <td>
                        <input type="text" name="訂購人[]" value="<?php print($資料列["訂購人"]) ?>" readonly>
                    </td>
                    <td>
                        <input type="text" name="書號[]" value="<?php print($資料列["書號"]) ?>" readonly>
                    </td>
                    <td>
                        <input type="text" name="訂購數量[]" value="<?php print($資料列["訂購數量"]) ?>" readonly>
                    </td>
                    <td>
                        <input type="text" name="下訂時間[]" value="<?php print($資料列["下訂時間"]) ?>" readonly>
                    </td>
                </tr>
                <?php
                    }
                ?>
        </table>

        
    
        <?php
            mysqli_close($連接);
        ?>
</body>
</html>