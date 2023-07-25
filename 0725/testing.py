# 年紀=input("請輸入:")

# try:
#     if int(年紀) >= 18:
#         print("已成年")
#     else:
#         print("未成年")
# except:
#     print("輸入錯誤!!")

# arr = []
# for num in range(1,20,3):
#     arr.append(num)
# else:
#     print(arr)

# num = 5
# while num >=0:
#     print(num)
#     num-=1

# class 車子:
#     def __init__(self,顏色,容納人數):
#         self.顏色 = 顏色
#         self.容納人數 = 容納人數
#     def 駕駛(self):
#         print(f"我的車是{self.顏色}的\n可容納{self.容納人數}人")
#         # print("我的車是",self.顏色,"的","\n可容納",self.容納人數,"人")

# 車子A = 車子("紅色",3)
# 車子A.駕駛()


元組=(1,2,"D")
列表=[1,2,True,"4"]

for 元素 in 列表:
    print(元素)

if 4 in 列表:
    print("有存在")
else:
    print("不存在")

字典={0:"A",
     "G":4,
     "C":8}


for 鍵,值 in 字典.items():
    print(鍵,":",值)
