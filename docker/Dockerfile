#基于jdK 8构建镜像文件 指定基础镜像，必备的指令 并且必须是第一条指令
FROM openjdk:8
#在构建镜像时 指定镜像的工作目录 之后命令都基于此工作目录
#如果不存在 则会创建目录 而且进入容器时 会默认定位到该路径中
WORKDIR /usr/local/software
#将主机文件拷贝镜像文件
#拷贝当前路径的所有的jar 拷贝到镜像文件中指（基于WORKDIR设置的目录）中 如果目标路径不存在 则会自动创建目录
#/jenkinsTest.jar:容器中的路径和jar名称
COPY *.jar ./jenkinsTest.jar
EXPOSE 8899
#容器启动时需要执行的命令 当使用docker ps 时在Command列 中会可以看出docker容器最后执行的命令
CMD java -jar jenkinsTest.jar