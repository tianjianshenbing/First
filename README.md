# First
    想做个开源项目很久 奈何水平太次 
    现在就做个自己的记录算了 
    平时遇见的问题和仔细没事想起的一些工具类
	
	eurka-common 主要是自定的工具类的编写(各种业务封装)
	eurka-demo   
	eurka-ticket 主要是springcloud 的验证中心
	eurka-client 和eurka-server 用于测试接口间的调用
	eurka-three  主要是第三方对eurka-three 接口的调用
	eurka-server  本地服务  去调用第三方服务
	

#1 
    实现一个第三方买票接口
        1. 向客户端发送请求
        2. 客户端向服务端发送请求
        3. 服务器调用第三方接口买票
    实现一个秒杀效果
        10 张票   100个人买
        
