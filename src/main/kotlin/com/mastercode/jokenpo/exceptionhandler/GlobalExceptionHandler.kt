package com.mastercode.jokenpo.exceptionhandler

import com.mastercode.jokenpo.domain.Move
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.http.converter.HttpMessageNotReadableException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(HttpMessageNotReadableException::class)
    fun handleInvalidEnum(ex: HttpMessageNotReadableException): ResponseEntity<com.mastercode.jokenpo.domain.ErrorResponse> {

        val validMoves = Move.entries.joinToString(", ")

        val message = "Invalid move. Valid options are: $validMoves."

        return ResponseEntity
            .status(HttpStatus.BAD_REQUEST)
            .body(com.mastercode.jokenpo.domain.ErrorResponse(message))
    }
}