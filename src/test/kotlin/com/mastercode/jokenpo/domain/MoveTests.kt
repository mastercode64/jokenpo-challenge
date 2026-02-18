package com.mastercode.jokenpo.domain

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import com.mastercode.jokenpo.domain.Move.TESOURA
import com.mastercode.jokenpo.domain.Move.PAPEL
import com.mastercode.jokenpo.domain.Move.PEDRA

class MoveTests {
    @Test
    fun `rock should win against scissors`() {
        assertTrue(PEDRA.winsAgainst(TESOURA))
    }

    @Test
    fun `rock should not win against paper`() {
        assertFalse(PEDRA.winsAgainst(PAPEL))
    }

    @Test
    fun `paper should win against rock`() {
        assertTrue(PAPEL.winsAgainst(PEDRA))
    }

    @Test
    fun `paper should not win against scissors`() {
        assertFalse(PAPEL.winsAgainst(TESOURA))
    }

    @Test
    fun `scissors should win against paper`() {
        assertTrue(TESOURA.winsAgainst(PAPEL))
    }
    @Test
    fun `scissors should not win against paper`() {
        assertFalse(TESOURA.winsAgainst(PEDRA))
    }

    @Test
    fun `same moves should not win`() {
        assertFalse(PEDRA.winsAgainst(PEDRA))
        assertFalse(PAPEL.winsAgainst(PAPEL))
        assertFalse(TESOURA.winsAgainst(TESOURA))
    }
}