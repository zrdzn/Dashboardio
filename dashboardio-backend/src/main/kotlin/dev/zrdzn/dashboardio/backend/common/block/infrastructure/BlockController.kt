package dev.zrdzn.dashboardio.backend.common.block.infrastructure

import dev.zrdzn.dashboardio.backend.api.block.BlockCreateRequest
import dev.zrdzn.dashboardio.backend.api.block.BlockCreateResponse
import dev.zrdzn.dashboardio.backend.common.block.BlockFacade
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/api/block")
class BlockController(private val blockFacade: BlockFacade) {

    @PostMapping
    fun createBlock(blockCreateRequest: BlockCreateRequest): ResponseEntity<BlockCreateResponse> =
        ok(blockFacade.createBlock(blockCreateRequest))

    @GetMapping

}