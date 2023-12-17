package dev.zrdzn.dashboardio.backend.common.player

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

typealias PlayerId = Int

@Entity(name = "Player")
@Table(name = "players")
data class Player(
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: PlayerId?,

    @Column(name = "player_name", updatable = false)
    val playerName: String,
)