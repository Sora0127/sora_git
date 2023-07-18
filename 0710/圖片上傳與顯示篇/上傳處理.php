<?php
        
        $檔案 = $_FILES["圖片"];
        $檔名 = basename($檔案["name"]);
        $tmp_路徑 = $檔案["tmp_name"];
        $路徑 = "./圖片/";
        if (is_uploaded_file($tmp_路徑)){
            if(move_uploaded_file($tmp_路徑,$路徑.$檔名)){
                print('<script>
                alert("上傳成功");
                location.href="圖片上傳.php";
               </script>');
            }
        }
        

?>