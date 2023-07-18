<?php
    $連接=mysqli_connect("localhost","root","","暑假研習");
    $sql="SELECT * FROM `留言板`";
    $資料堆=mysqli_query($連接,$sql);
    for($i=0;$i<mysqli_num_rows($資料堆);$i++){
        $列資料=mysqli_fetch_assoc($資料堆);
        print('<div class="清單區塊" style="width:100%; margin:5px 0px; width:30rem;">');
            print("作者:".$列資料["作者"]);
            print("<hr/>");
            print("主題:".$列資料["主題"]);
            print("<hr/>");
            print("時間:".$列資料["時間"]);
            print("<hr/>");
        
                print"<div style='width:300px; word-wrap:break-word'>";
                    print($列資料["內容"]);
                print"</div>";
        print("</div>");
        
    }
    mysqli_close($連接);
?>