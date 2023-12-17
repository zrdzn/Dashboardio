package dev.zrdzn.dashboardio.backend.common.player

import dev.zrdzn.dashboardio.backend.api.player.PlayerCreateRequest
import dev.zrdzn.dashboardio.backend.api.player.PlayerCreateResponse
import org.springframework.transaction.annotation.Transactional

open class PlayerFacade(private val playerRepository: PlayerRepository) {

    @Transactional
    open fun createPlayer(playerCreateRequest: PlayerCreateRequest): PlayerCreateResponse {
        val player = Player(null, playerCreateRequest.playerName)
        return PlayerCreateResponse(playerRepository.save(player).id!!)
    }

    @Transactional
    open fun getPlayerByPlayerName(playerName: String): Player? = playerRepository.findByPlayerName(playerName)

}