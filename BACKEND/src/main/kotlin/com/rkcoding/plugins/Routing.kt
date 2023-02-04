package com.rkcoding.plugins

import com.rkcoding.models.TicTacToeGame
import com.rkcoding.socket
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*

fun Application.configureRouting(game:TicTacToeGame) {
    routing {
        socket(game)
    }
}
