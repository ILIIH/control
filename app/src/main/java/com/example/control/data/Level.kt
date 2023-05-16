package com.example.control.data

data class Level(
    val dialog1: List<DialogUnit>,
    val idPhoto: String,
    val roomPhoto: String,
    val nationality: String,
    val passportNo: String,
    val dateOfBirth: String,
    val dateOfExpiry: String,
    val placeOfBirth: String,
    val Sex: String,
    val FullName: String,
    val Signature: String,
    val IdString: String,
    val Bio: String,
    val AdditionalQuestionDialog1: List<DialogUnit>,
    val AdditionalQuestionDialog2: List<DialogUnit>,
    val AdditionalQuestionDialog3: List<DialogUnit>,
    val AdditionalQuestionDialog4: List<DialogUnit>,
    val isItSpy: Boolean,
    val whyItSpyDescription: String,
    val dangerBeingKilledBy: Int,
    val dangerLitigation: Int,

    )