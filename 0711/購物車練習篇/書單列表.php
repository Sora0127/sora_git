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
        
        td:not(:nth-child(2))>input{
            width: 100px;
        }
        td{
            padding: 10px;
        }
        
    </style>
</head>
<body>
    <form action="加入購物車.php" method="post">
        <table>
                <tr>
                    <td>書號</td>
                    <td>書名</td>
                    <td>定價</td>
                    <td>數量</td>
                </tr>
                <?php
                    $連接=mysqli_connect("localhost","root","","暑假研習");
                    $sql="SELECT * FROM `書庫`";
                    $資料堆=mysqli_query($連接,$sql);
                    for($i=0;$i<mysqli_num_rows($資料堆);$i++){
                        $資料列=mysqli_fetch_assoc($資料堆);
                ?>
                <tr>
                    <td>
                        <input type="text" name="書號[]" value="<?php print($資料列["書號"]) ?>" readonly>
                    </td>
                    <td>
                        <input type="text" name="書名[]" value="<?php print($資料列["書名"]) ?>" readonly>
                    </td>
                    <td>
                        <input type="text" name="價格[]" value="<?php print($資料列["價格"]) ?>" readonly>
                    </td>
                    <td><input type="number" name="數量[]" value="0" min="0"></td>
                </tr>
                <?php
                    }
                ?>
        </table>
        <div style="margin-top:10px;">
            <input type="submit" class="b-set" value="放入購物車">
        </div>
        
    </form>
        <?php
            mysqli_close($連接);
        ?>
</body>
</html>