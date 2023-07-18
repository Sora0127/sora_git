<!DOCTYPE html>
<html lang="zh-TW">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>圖片上傳</title>
    <link rel="stylesheet" href="style.css">
    <style>
        img{
            width: 200px;
        }
    </style>
</head>
<body>
    <form action="上傳處理.php" method="post" enctype=multipart/form-data>
        <div class="清單區塊" style="width: 300px;">
            <input type="file" name="圖片" id="">
            <div style="margin: 10px;">
                <input class="b-set" type="submit" value="上傳">
                <input class="b-set" type="reset" value="清除">
            </div>
        </div>
        
    </form>
<?php
    $a = glob("./圖片/*.*");
    if(empty($a)){
        print "沒有資料";
    }else{
        print("<table>");
        foreach($a as $r){
            print("<tr>");
                print("<td>");
                    print("<img src=\"".$r."\" >");
                print("</td>");
                print("<td>");
                $檔名 = explode("/", $r);
                
                    print "<a href=\"".$r."\" download>".$檔名[count($檔名)-1]."</a>";
                print("</td>");
            print("</tr>");
        }
        print("</table>");
    }
?>
</body>
</html>