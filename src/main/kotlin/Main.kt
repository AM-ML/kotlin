fun main() {
    fun pyramid(height: Int){
        if(height == 1){
            print("#")
            return
        }
        
        var n = height
        var blocks = 1

        for(i in 1..n){
            print(" ")
        }

        println("#")

        while(n > 1){
            for(i in 1..n-1){
                print(" ")
            }

            for(i in 1..blocks*2+1){
                print("#")
            }

            n--
            blocks++
            println()
        }
    }

    var s: String
    var n: Int

    while(true){
        print("Enter: ")
        s = readLine().toString()
        n = s.toInt()

        pyramid(n)
    }
}
