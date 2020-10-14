path=$1
filename="${path%.*}"
kotlinc-jvm $filename.kt -include-runtime -d $filename.jar && java -jar $filename.jar
