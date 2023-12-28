package dev.zrdzn.dashboardio.backend.common.block.infrastructure

import dev.zrdzn.dashboardio.backend.api.block.BlockCreateRequest
import dev.zrdzn.dashboardio.backend.api.block.BlockCreateResponse
import dev.zrdzn.dashboardio.backend.common.block.Block
import dev.zrdzn.dashboardio.backend.common.block.BlockFacade
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/api/block")
class BlockController(private val blockFacade: BlockFacade) {

    @PostMapping("/create")
    fun createBlock(blockCreateRequest: BlockCreateRequest): ResponseEntity<BlockCreateResponse> =
        ok(blockFacade.createBlock(blockCreateRequest))

    @GetMapping
    fun findAll(): ResponseEntity<Set<Block>> =
        ok(blockFacade.findAll(100))

    @GetMapping("/placed/{name}")
    fun getTotalPlacedBlocksByName(@PathVariable name: String): ResponseEntity<Long> =
        ok(blockFacade.getTotalPlacedBlocksByName(name))

    @GetMapping("/broken/{name}")
    fun getTotalBrokenBlocksByName(@PathVariable name: String): ResponseEntity<Long> =
        ok(blockFacade.getTotalBrokenBlocksByName(name))

}