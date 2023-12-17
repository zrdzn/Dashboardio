package dev.zrdzn.dashboardio.backend.common.block

import dev.zrdzn.dashboardio.backend.api.block.BlockCreateRequest
import dev.zrdzn.dashboardio.backend.api.block.BlockCreateResponse
import org.springframework.data.domain.PageRequest
import org.springframework.transaction.annotation.Transactional

open class BlockFacade(private val blockRepository: BlockRepository) {

    @Transactional
    open fun createBlock(blockCreateRequest: BlockCreateRequest): BlockCreateResponse =
        blockRepository
            .save(
                Block(
                    id = null,
                    actionId = blockCreateRequest.actionId,
                    blockName = blockCreateRequest.name,
                    x = blockCreateRequest.x,
                    y = blockCreateRequest.y
                )
            )
            .let {
                BlockCreateResponse(
                    blockId = it.id!!
                )
            }

    @Transactional
    open fun findAll(limit: Int): Set<Block> = blockRepository.findAll(PageRequest.of(0, limit)).toSet()

    @Transactional
    open fun calculateBlocksCountByName(name: BlockName): Long = blockRepository.calculateBlocksCountByName(name)

}