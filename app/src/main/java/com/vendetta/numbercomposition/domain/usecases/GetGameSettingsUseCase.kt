package com.vendetta.numbercomposition.domain.usecases

import com.vendetta.numbercomposition.domain.entity.GameSettings
import com.vendetta.numbercomposition.domain.entity.Level
import com.vendetta.numbercomposition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }

}