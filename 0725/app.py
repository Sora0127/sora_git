from flask import Flask,jsonify,request,url_for,json,redirect,render_template
from flask_cors import CORS

app = Flask(__name__)
CORS(app)
清單 =[
    {"編號":1,"項目":"吃飯","完成與否":False},
    {"編號":2,"項目":"睡覺","完成與否":False}
]

@app.route("/")
def index():
    return render_template("todo.html")

@app.route("/todo",methods=["GET"])
def get_todo():
    return json.dumps(清單,ensure_ascii=False)

@app.route("/todo",methods=["POST"])
def creat_todo():
    資料 = request.form['新增資料']
    print(資料)
    if len(清單)>0:
        單筆 = {"編號":(清單[len(清單)-1]["編號"])+1,"項目":資料,"完成與否":False}
    else:
        單筆 = {"編號":1,"項目":資料,"完成與否":False}

    清單.append(單筆)
    return redirect(url_for('index'))



@app.route("/del",methods=["POST"])
def delete_todo():
    刪除編號 = request.form['刪除資料']
    for i in 清單:
        if i["編號"]==int(刪除編號):
            清單.remove(i)
    return redirect(url_for("index"))


if __name__ =='__main__':
    app.run(port=5501)


