package com.example.devmon.model.repository

import com.example.devmon.model.domain.Creature
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CreaturesRepository @Inject constructor() {
    val creatures: List<Creature>

    init {
        val	creature1	=	Creature(1,	"Java",	"https://i.imgur.com/PHfd1h2.png")
        val	creature2	=	Creature(2,	"Kotlin",	"https://i.imgur.com/EZ3zCBp.png")
        val	creature3	=	Creature(3,	"????",	"https://i.imgur.com/rNKVxSt.png")
        val	creature4	=	Creature(4,	"C",	"https://i.imgur.com/iWeXxA9.png")
        val	creature5	=	Creature(5,	"C++",	"https://i.imgur.com/YYkSF5A.png")
        val	creature6	=	Creature(6,	"????",	"https://i.imgur.com/rNKVxSt.png")

        creatures = listOf(
            creature1,
            creature2,
            creature3,
            creature4,
            creature5,
            creature6
        )
    }
}