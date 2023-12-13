package dev.zrdzn.dashboardio.backend.common.block

import dev.zrdzn.dashboardio.backend.api.block.BlockHistoryEntryCreateRequest
import dev.zrdzn.dashboardio.backend.api.block.BlockHistoryEntryCreateResponse
import org.springframework.transaction.annotation.Transactional

class BlockHistoryFacade(private val blockHistoryRepository: BlockHistoryRepository) {

    @Transactional
    fun createBlockHistoryEntry(blockHistoryEntryCreateRequest: BlockHistoryEntryCreateRequest): BlockHistoryEntryCreateResponse =
        blockHistoryRepository
            .save(
                BlockHistoryEntry(
                    id = null,
                    changedAt = null,
                    name = blockHistoryEntryCreateRequest.name,
                    x = blockHistoryEntryCreateRequest.x,
                    y = blockHistoryEntryCreateRequest.y
                )
            )
            .let {
                BlockHistoryEntryCreateResponse(
                    id = it.id!!
                )
            }

    @Transactional
    fun findAll(limit: Int): Set<BlockHistoryEntry> = blockHistoryRepository.findAll(limit)

    @Transactional
    fun calculateBlocksCountByName(name: BlockName): Long = blockHistoryRepository.calculateBlocksCountByName(name)

}