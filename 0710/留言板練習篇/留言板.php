<!DOCTYPE html>
<html lang="zh-TW">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="style.css">
    <style>
        .表單{
            display: flex;
            flex-direction: column;
        }
        body{
            display: flex;
            flex-direction: row;
            justify-content: center;
        }
        #重填{
            background-color: rgb(112, 115, 116);
            color: aliceblue;
        }
        #重填:hover{
            color: black;
            
            background-color: rgb(234, 234, 234);
        }
        .留言區{
            padding: 10px;
            display: flex;
            height: 30rem;
            flex-direction: column;
            overflow-x:auto; 
            overflow-y:scroll;
        }
        .留言區::-webkit-scrollbar {
            width: 1em;
        }
        
        .留言區::-webkit-scrollbar-track {
            box-shadow: inset 0 0 6px rgba(0, 0, 0, 0.3);
            border-radius: 20px;
        }
        
        .留言區::-webkit-scrollbar-thumb {
            background-color: rgb(129, 185, 222);
            border: 1px solid slategrey;
            border-radius: 20px;
        }
    </style>
</head>
<body>


    <div class="清單區塊" style="width:30%; margin:10px; height: 25%;">
        <form class="表單" action="張貼.php" method="post">
            作者:<input type="text" class="in-set" name="作者" required>
            主題:<input type="text" class="in-set" name="主題" required>
            內容:
            <textarea style="border-radius: 10px;  padding: 10px 10px; max-width:100%;" name="內容" cols="30" rows="10"></textarea>
            <div style="margin-top: 10px;">
                <input type="submit" class="b-set" value="新增留言">
                <input type="reset" id="重填" class="b-set" value="重新填寫">
                
            </div>
        </form>
    </div>

    <div class="留言區">
        <?php
            include("瀏覽.php");
        ?>
    </div>
    

</body>
</html>
