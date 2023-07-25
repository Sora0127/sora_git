// console.log("晚安，瑪卡巴卡")

const express = require("express");
const app = express();
const port =3000;
const bodyParser = require('body-parser');

// app.use(bodyParser.text({type:"*/*"}))
app.use(bodyParser.urlencoded({extended:true}))

app.get('/',(req,res)=>{
    res.send('我有冰七另')
})

app.get('/'+encodeURI("晚安"),(req,res)=>{
    res.send('晚安，瑪卡巴卡')
})

app.get('/getUser/:id/:name',(req,res)=>{
    res.send(req.params.id + req.params.name)
})

app.get('/user',(req,res)=>{
    var user = JSON.parse(req.body)
    res.send("使用者資訊" + JSON.stringify(user))
})

app.post("/"+encodeURI("BMI計算"),(req,res)=>{
    var 體重 = Number(req.body.體重)
    var 身高 = Number(req.body.身高)*0.01
    var BMI = 體重/(身高*身高)
    
    res.send(`<div id="塊">你的BMI為:${BMI}</div>
            <style>
            #塊{
                margin-top: 100px;
                padding: 20px;
                box-shadow: 1px 2px 5px rgba(0,0,0,0.2);
                border-radius: 10px;
                background-color: rgb(242, 245, 248);
                display: flex;
                flex-direction: column;
                width: fit-content;
                height:fit-content;
            }
            body{
                display: flex;
                justify-content: center;
                background-color: rgb(195, 220, 220);
            }
            </style>`);
})

app.listen(port,()=>{
    console.log(`Server listing at http:localhost:${port}`);
})