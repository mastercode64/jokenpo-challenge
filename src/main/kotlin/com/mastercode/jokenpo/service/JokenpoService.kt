package com.mastercode.jokenpo.service

import com.mastercode.jokenpo.domain.JokenpoResponse
import com.mastercode.jokenpo.domain.Move
import com.mastercode.jokenpo.domain.Result
import org.springframework.stereotype.Service

@Service
class JokenpoService {
    fun play(playerMove: Move): JokenpoResponse {
        val machineMove = Move.entries.toTypedArray().random()

        val result = when {
            playerMove == machineMove -> Result.EMPATE
            playerMove.winsAgainst(machineMove) -> Result.VITORIA
            else -> Result.DERROTA
        }

        return JokenpoResponse(
            playerMove = playerMove,
            machineMove = machineMove,
            result = result
        )
    }
}