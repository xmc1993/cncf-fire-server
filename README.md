留言模块：
实体类中的MessageSet和Message类是用于留言模块的，MessageSet是某个用户和管理员对话集，其中的每一条对话（留言）对应的实体类为
Message，存储在message表中。Message隶属于MessageSet,message表中setId字段标识这条留言属于哪个留言集

关于admin user btcm(委员)三者的权限管理
不能将btcm和