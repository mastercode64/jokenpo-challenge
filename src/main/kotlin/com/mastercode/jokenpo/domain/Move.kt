package com.mastercode.jokenpo.domain

enum class Move {
    PEDRA,
    PAPEL,
    TESOURA;

    fun winsAgainst(opponentMove: Move): Boolean {
        return when (this) {
            PEDRA -> opponentMove == TESOURA
            TESOURA -> opponentMove == PAPEL
            PAPEL -> opponentMove == PEDRA
        }
    }

}