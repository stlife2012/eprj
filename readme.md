# dev 模板工程
## 业务、技术划分
    基于Java等技术领域、服务、框架等划分
    python py   dev.py
    scala sc    dev.sc
    
  - 业务、专业、行业、领域模块(buz)
  ```
  hospital  医院行业 package：java.buz.hospital
  jvm       虚拟机   package：java.buz.jvm
  ```
  - 第三方组件类(spring)
  ```
   db            关系数据库业务模块  spring.db
   cache         缓存业务模块
   security      安全业务模块
  ```
  - 服务类(boot)
  ```
    hospital  医院行业 package：boot.hospital
    bd  大数据相关    package:boot.bd
        hdfs   package:boot.bd.hdfs
        hbase   package:boot.bd.hbase
        hive   package:boot.bd.hive
    ml  机器学习相关spark     package:boot.ml
        spark   package:boot.ml.spark
        mr      package:boot.ml.mr
    dl  深度学习
        pytorch package:boot.dl.pytorch
    ui  前端技术
    tools 工具类，包括运维、管理等
  ```
  - 分布式(cloud)
    
# std 学习工程
+ java    主要是java相关项目，包括spring、boot、cloud
+ bd      大数据相关hdfs、hbase、hive
+ ml      机器学习相关
+ dl      深度学习相关
+ python  python常用工具类

