package com.zpi.model.dto

import com.google.gson.annotations.SerializedName

data class MinigameAnswerDTO (
    @SerializedName("correct") var correct: Double? = null,
    @SerializedName("reg_date") var regDate: String? = null,
    @SerializedName("fk_story") var fkStory: Int? = null,
    @SerializedName("fk_user") var fkUser: Int? = null
)