# 1 介绍
## 1.1 功能
1.	将V8引擎集成到Spring Boot的项目中
2.  可以通过v8引擎执行简单的js命令。
## 1.2 基本环境版本
java 1.8
mysql 8.x
其他依赖库的版本：见pom.xml文件
maven仓本地路径：C:\Users\shand\.m2\repository\org\springframework\boot\spring-boot

# 2 工程目录结构
docs：存放一些文件。
src：maven框架下的源码文件
target：编译生成的class文件

# 3 部署和使用说明
（1）源码交付，可以直接使用IDEA直接打开工程，进行部署和运行。 
（2）操作说明：可以直接运行com.example.demo.V8Test.test_runScript函数。

# 4 参考文献
[1] https://blog.csdn.net/hp910315/article/details/78915193
[2] https://blog.csdn.net/weixin_60387745/article/details/126853599
    当.m2下的setting.xml不存在如何配置
[3] https://blog.csdn.net/qq_38360892/article/details/120738404
    指定了一个maven坐标。
[4] https://mvnrepository.com/artifact/com.eclipsesource.j2v8
    J2V8的maven仓库
[5] https://blog.csdn.net/OCEAN_C/article/details/89719578
    MySql错误 1251 - Client does not support authentication protocol requested by server 解决方案
[6] https://blog.csdn.net/xiao_jun_0820/article/details/76498268
    java 中使用ScriptEngine执行javascript脚本代码和使用中应该注意的事项
