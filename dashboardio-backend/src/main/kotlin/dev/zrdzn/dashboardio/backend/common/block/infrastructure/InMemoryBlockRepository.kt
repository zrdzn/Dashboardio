package dev.zrdzn.dashboardio.backend.common.block.infrastructure

import dev.zrdzn.dashboardio.backend.common.block.Block
import dev.zrdzn.dashboardio.backend.common.block.BlockId
import dev.zrdzn.dashboardio.backend.common.block.BlockRepository
import dev.zrdzn.dashboardio.backend.common.block.BlockName

class InMemoryBlockRepository : BlockRepository {

    private val blocksHistory = mutableMapOf<BlockId, Block>()

    override fun save(block: Block): Block =
        blocksHistory.put(blocksHistory.size + 1L, block)!!


    override fun findAll(limit: Int): Set<Block> =
        blocksHistory.values
            .take(limit)
            .toSet()

    override fun calculateBlocksCountByName(name: BlockName): Long {
        TODO("Not yet implemented")
    }

}