$a = Main

all:
	{ time (kotlinc ${a}.kt -include-runtime -d ${a}.jar && clear && java -jar ${a}.jar; ) ; } 2>&1 | tee output.txt
