<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        table,td{
            border: 1px solid ;
            
        }
        td{
            padding: 20px;
        }
        .t-a{
            width: 100px;
        }
    </style>
</head>
<body>
    <table>
        <tr>
            <td>姓氏</td>
            <td>名字</td>
            <td>出生日期</td>
            <td>留言</td>
        </tr>
        <?php
            $連接=mysqli_connect("localhost","root","","暑假研習");
            $sql="SELECT * FROM `暑假技術研習`";
            $資料堆=mysqli_query($連接,$sql);
            for($i=0;$i<mysqli_num_rows($資料堆);$i++){
                $資料列=mysqli_fetch_assoc($資料堆);
        ?>
        <tr>
            <td><?php print($資料列["姓氏"]) ?></td>
            <td><?php print($資料列["名字"]) ?></td>
            <td><?php print($資料列["出生日期"]) ?></td>
            <td><textarea class="t-a" id="" cols="30" rows="10" readonly><?php print($資料列["想說的話"]) ?></textarea></td>
        </tr>
        <?php
            }
            mysqli_close($連接);
        ?>
    </table>
    <a href="./表單練習.php">表單建立</a>
</body>
</html>