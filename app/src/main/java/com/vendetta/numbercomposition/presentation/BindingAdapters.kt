package com.vendetta.numbercomposition.presentation

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.vendetta.numbercomposition.R
import com.vendetta.numbercomposition.domain.entity.GameResult

@BindingAdapter("requiredAnswers")
fun bindRequiredAnswers(textView: TextView, count: Int) {
    textView.text = String.format(
        textView.context.getString(R.string.required_score),
        count.toString()
    )
}

@BindingAdapter("scoreAnswers")
fun bindScoreAnswers(textView: TextView, count: Int) {
    textView.text = String.format(
        textView.context.getString(R.string.score_answers),
        count.toString()
    )
}

@BindingAdapter("requiredPercentage")
fun bindRequirePercentage(textView: TextView, percent: Int) {
    textView.text = String.format(
        textView.context.getString(R.string.required_percentage),
        percent.toString()
    )
}

@BindingAdapter("resultEmoji")
fun bindEmoji(imageView: ImageView, winner: Boolean) {
    if (winner) {
        imageView.setImageResource(R.drawable.ic_smile)
    } else {
        imageView.setImageResource(R.drawable.ic_sad)
    }
}

@BindingAdapter("scorePercentage")
fun bindScorePercentage(textView: TextView, gameResult: GameResult) {
    textView.text = String.format(
        textView.context.getString(R.string.score_percentage),
        getPercentOfRightAnswers(gameResult).toString()
    )
}

private fun getPercentOfRightAnswers(gameResult: GameResult): Int {
    with(gameResult) {
        if (countOfQuestions == 0) {
            return 0
        } else {
            return ((countOfRightAnswers / countOfQuestions.toDouble()) * 100).toInt()
        }
    }
}