package dev.zrdzn.dashboardio.backend.common.player

interface PlayerRepository {

    fun save(player: Player): Player

    fun findByPlayerName(playerName: String): Player?

}