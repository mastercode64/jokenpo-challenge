package com.mastercode.jokenpo.domain

data class JokenpoResponse(
    val playerMove: Move,
    val machineMove: Move,
    val result: Result
)
