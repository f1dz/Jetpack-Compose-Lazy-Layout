package com.iteqno.jetheroes.data

import com.iteqno.jetheroes.model.Hero
import com.iteqno.jetheroes.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }
}