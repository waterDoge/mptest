## 这是啥
**这是一个重现mybatis-plus分页bug的demo**

## 什么BUG
使用order by field()时，分页插件报错

## 如何重现

1. 拉取代码到本地
2. 在mysql数据库创建一个名为mptest的schema, 修改[application.yml](src/main/resources/application.yml)内的数据源配置
3. 执行[ResourceServiceTest](src/test/java/com/example/mptest/service/ResourceServiceTest.java)
