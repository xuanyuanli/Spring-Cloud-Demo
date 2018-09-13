# 项目启动
- 先启动eureka-server和config-server
- blog-api是二方包
- blog-service是blog-api的实现，是个服务提供方，启动它
- blog-app是消费方，也是对外服务出口，启动它
- blog-gateway是服务网关，通过网关来访问blog-app
- config-server是配置中心，用blog-app同时作为config-client
- 断路器的演示在bolg-app和blog-api中，Feign自带了断路器。后期考虑自定义断路器逻辑
- 链路追踪

# 访问url
- 注册中心：http://localhost:8761/
- 配置中心示例： http://localhost:8888/foo/dev
- blog-app熔断器示例（不启动blog-service）：http://localhost:14201/blog/list
- blog-app读取配置中心配置示例：http://localhost:14201/env?key=name
- 网关示例，会路由到blog-app：http://localhost:8900/column/env?key=name 或 http://localhost:8900/article/env?key=name

