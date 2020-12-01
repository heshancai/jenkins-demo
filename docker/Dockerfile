FROM openjdk:8
#在构建镜像时 指定镜像的工作目录 之后命令都基于此工作目录
#如果不存在 则会创建目录 而且进入容器时 会默认定位到该路径中
WORKDIR /usr/local/software
#拷贝当前路径的所有的jar 到指定路径中/jenkinsTest.jar
COPY *.jar ./jenkinsTest.jar
EXPOSE 8899
CMD java -jar jenkinsTest.jar