package com.vendetta.numbercomposition.domain.usecases

import com.vendetta.numbercomposition.domain.entity.Question
import com.vendetta.numbercomposition.domain.repository.GameRepository

class GenerateQuestionUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(maxSumValue:Int): Question {
        return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)
    }
    private companion object{
        private const val COUNT_OF_OPTIONS = 6
    }
}
