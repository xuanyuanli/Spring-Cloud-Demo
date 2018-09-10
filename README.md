# 项目启动
- 先启动eureka-server
- blog-api是二方包
- blog-service是blog-api的实现，是个服务提供方，启动它
- blog-app是消费方，也是对外服务出口，启动它
- blog-gateway是服务网关，通过网关来访问app
- 以后还有配置中心和链路追踪

