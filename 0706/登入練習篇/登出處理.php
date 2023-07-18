<?php
    session_start();
    session_destroy();
    print('<script>
                alert("已登出");
                location.href="登入介面.html";
            </script>');
?>