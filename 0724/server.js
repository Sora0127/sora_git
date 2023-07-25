const express = require("express");
const app = express();
const port =3000;
const bodyParser = require('body-parser');


const fs =require("fs");
const { promisify } = require("util");
const readFileAsync = promisify(fs.readFile)
const writeFileAsync = promisify(fs.writeFile)


app.use((req,res,next)=>{
    res.header('Access-Control-Allow-Origin','*');
    res.header('Access-Control-Allow-Headers','Origin, X-Requested-With, Content-Type,Accept');
    next();
})

app.use(express.urlencoded({extended:true}))
app.use(express.json())
let 清單陣列 =[]


app.get('/', async(req,res)=>{
    try{
        const 資料 = await readFileAsync("代辦清單.txt",'utf8')
        清單陣列 = JSON.parse(資料)
        res.json(清單陣列)
    }catch(e){
        console.error(e)
        res.send("錯誤!!")
    }
})

app.post('/',async(req,res)=>{
    const 新清單 = req.body.內容;
    console.log(新清單)
    清單陣列.push(新清單)

    try{
        await writeFileAsync('代辦清單.txt',JSON.stringify(清單陣列),'utf8')
        res.send('新增完成')
    }catch(e){
        console.error(e)
        res.send("寫檔錯誤")
    }
})

初始();

async function 初始(){
    try{
        const 資料 = await readFileAsync("代辦清單.txt",'utf8')
        清單陣列 = JSON.parse(資料)
    }catch(e){
        console.error(e)
        清單陣列 = [];
    }

    if(清單陣列.length ===0){
        清單陣列.push("吃飯");
        清單陣列.push("睡覺");
    }

    try{
        await writeFileAsync('代辦清單.txt',JSON.stringify(清單陣列),'utf8')
        console.log('寫檔完成')
    }catch(e){
        console.error(e)
    }
}

app.listen(port,()=>{
    console.log(`Server listing at http:localhost:${port}`);
})