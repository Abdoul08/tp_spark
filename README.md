This project contain a spark lesson programs. it also contain the docker-compose to run on dev env.
Docker needs to be installed.
To run spark cluster
docker-compose up -d --remove-orphans
Connect to one of worker node and run :
#Main
spark-submit --deploy-mode client --master spark://spark-master:7077 --total-executor-cores 1 --class com.uie.main --driver-memory 1G --executor-memory 1G --jars /opt/spark-apps/dependencies/config-1.4.2.jar,/opt/spark-apps/dependencies/mysql-connector-java-8.0.25.jar /opt/spark-apps/spark-lesson_2.12-0.1.jar