path=$1
name="${path%.*}"
kotlinc-jvm $name.kt -include-runtime -d $name.jar
