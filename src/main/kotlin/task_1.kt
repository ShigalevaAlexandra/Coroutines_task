import kotlinx.coroutines.*

suspend fun main() = coroutineScope {

    val time = arrayOf(5, 7, 10)
    val sounds = arrayOf("tick tick tick", "TicK TicK", "TICK")

    for (i in 0..2) {
        launch {
            for (j in 1..time[i]) {
                delay(1000L)
                println(sounds[i])
            }
            println("$i прозвенел")
        }
    }
}