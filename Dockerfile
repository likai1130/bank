FROM demoregistry.dataman-inc.com/library/centos7-jdk8:latest

ADD ./target/bank-0.0.1-SNAPSHOT.jar  bank-0.0.1-SNAPSHOT.jar

CMD java -jar -Duser.timezone=Asia/Shanghai -Duser.language=zh  -Duser.country=CN  -Dsun.jnu.encoding=UTF-8 -Dfile.encoding=UTF-8 -Dclient.encoding.override=UTF-8  -Ddefault.client.encoding=UTF-8 bank-0.0.1-SNAPSHOT.jar