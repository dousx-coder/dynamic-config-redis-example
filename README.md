[dynamic-config-redis](https://github.com/dousx-coder/dynamic-config-redis)

docker 部署步骤
1. 先打包
```shell
gradle clean bootJar
```
2. 构建镜像(修改版本号)
```shell
docker build -t dcrx:0.1 .
```
3. 运行
```shell
docker run -d -p 7210:7210 --name=dcrx dcrx:0.1
```