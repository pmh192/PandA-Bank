set -e
mvn package
java -jar target/PandABank-1.0-SNAPSHOT.jar server
