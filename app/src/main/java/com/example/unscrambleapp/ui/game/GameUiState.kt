package com.example.unscrambleapp.ui.game

data class GameUiState(
    val currentScrambleWord: String = "",
    val currentWordCount: Int = 1,
    val score: Int = 0,
    val isGuessedWordWrong: Boolean = false,
    val isGameOver: Boolean = false
)