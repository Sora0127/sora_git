<!DOCTYPE html>
<html lang="zh-TW">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <form id="表單" action="新增.php" method="post">
        <h1>暑假技術研習</h1>
        <a>姓氏</a>
        <input class="in-set" type="text" name="姓氏" id="">
        <a>名字</a>
        <input class="in-set" type="text" name="名字" id="">
        <a>出生日期</a>
        <input class="in-set" type="date" name="出生日期" id="">
        <a>想說的話</a>
        <textarea class="in-set" name="留言" id="" cols="30" rows="10"></textarea>
        <div class="容器">
            <input class="b-set" type="submit" value="送出表單">
        </div>
    </form>
    <div style="margin-top:30px;">
        <a class="連結" href="./顯現.php">列表</a>
    </div>
</body>
</html>