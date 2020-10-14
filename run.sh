path=$1
name="${path%.*}"
if test -f "$name.jar"; then
    java -jar $name.jar
else
    kotlinc-jvm $name.kt -include-runtime -d $name.jar && java -jar $name.jar
fi
