package dev.zrdzn.dashboardio.backend.common.player.infrastructure

import dev.zrdzn.dashboardio.backend.api.player.PlayerCreateRequest
import dev.zrdzn.dashboardio.backend.api.player.PlayerCreateResponse
import dev.zrdzn.dashboardio.backend.common.player.PlayerFacade
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.notFound
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController("/api/player")
class PlayerController(private val playerFacade: PlayerFacade) {

    @PostMapping
    fun createPlayer(@RequestBody playerCreateRequest: PlayerCreateRequest): ResponseEntity<PlayerCreateResponse> =
        ok(playerFacade.createPlayer(playerCreateRequest))

    @GetMapping("/{name}")
    fun getPlayerByName(@PathVariable name: String): ResponseEntity<PlayerCreateResponse> =
        playerFacade.getPlayerByPlayerName(name)
            ?.let { ok(PlayerCreateResponse(it.id!!)) }
            ?: notFound().build()

}