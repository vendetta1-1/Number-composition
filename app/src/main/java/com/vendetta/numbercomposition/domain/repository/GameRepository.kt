package com.vendetta.numbercomposition.domain.repository

import com.vendetta.numbercomposition.domain.entity.GameSettings
import com.vendetta.numbercomposition.domain.entity.Level
import com.vendetta.numbercomposition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue:Int,
        countOfOptions:Int
    ):Question

    fun getGameSettings(level:Level):GameSettings
}