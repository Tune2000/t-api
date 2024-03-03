<a name="huhHN"></a>
## API开放平台
<a name="XNuVz"></a>
## 项目简介
该项目是基于React + Spring Boot + Dubbo + Gateway 的 API 接口开放调用平台。管理员可以接入并发布接口，可视化各接口调用情况。用户可以开通接口调用权限、浏览接口及在线调试，并通过客户端SDK 轻松调用接口。
<a name="ja1xZ"></a>
## 项目技术栈
Spring Boot、Spring Cloud Gateway、Dubbo、Nacos、MySQL、MyBatis-Plus、Hutool 工具库
<a name="vylqC"></a>
## 项目地址
后端：[https://github.com/Tune2000/t-api](https://github.com/Tune2000/t-api)<br />前端：[https://github.com/Tune2000/t-api](https://github.com/Tune2000/t-api)
<a name="TZKGN"></a>
## 项目详情
该项目实现了管理员端可进行接口接入和发布，同时可视化查看个接口调用情况，对接口信息进行增删查。用户端可以访问前台，浏览接口并调用，且每次调用会进行统计。<br />项目亮点

- 为防止接口被恶意调用，设计API 签名认证算法，为用户分配唯一 ak / sk 以鉴权，保障调用的安全性、可溯源性（指便于统计接口调用次数）。
- 选用Spring Cloud Gateway 作为 API 网关，实现了路由转发、访问控制、流量染色，并集中处理签名校验、请求参数校验、接口调用统计等业务逻辑，提高安全性的同时、便于系统开发维护。
- 为解决多个子系统内代码大量重复的问题，抽象模型层和业务层代码为公共模块，并使用Dubbo RPC 框架实现子系统间的高性能接口调用，减少重复代码。

