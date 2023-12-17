package dev.zrdzn.dashboardio.backend.common.player.infrastructure

import dev.zrdzn.dashboardio.backend.common.player.Player
import dev.zrdzn.dashboardio.backend.common.player.PlayerId
import dev.zrdzn.dashboardio.backend.common.player.PlayerRepository

class InMemoryPlayerRepository : PlayerRepository {

    private val players = mutableMapOf<PlayerId, Player>()

    override fun save(player: Player): Player =
        players.put(players.size + 1L, player)!!

    override fun findByPlayerName(playerName: String): Player? = players.values.firstOrNull { it.playerName == playerName }

}