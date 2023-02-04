package com.rkcoding

import com.rkcoding.models.TicTacToeGame
import io.ktor.server.application.*
import com.rkcoding.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    val game = TicTacToeGame()
    configureSockets()
    configureMonitoring()
    configureSerialization()
    configureRouting(game)
}
