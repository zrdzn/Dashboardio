package dev.zrdzn.dashboardio.backend.common.block.infrastructure

import dev.zrdzn.dashboardio.backend.common.block.Block
import dev.zrdzn.dashboardio.backend.common.block.BlockId
import dev.zrdzn.dashboardio.backend.common.block.BlockRepository
import dev.zrdzn.dashboardio.backend.common.block.BlockName
import org.springframework.data.domain.Pageable

class InMemoryBlockRepository : BlockRepository {

    private val blocksHistory = mutableMapOf<BlockId, Block>()

    override fun save(block: Block): Block =
        blocksHistory.put(blocksHistory.size + 1, block)!!


    override fun findAll(limit: Pageable): List<Block> =
        blocksHistory.values
            .take(limit.pageSize)

    override fun calculateBlocksCountByName(name: BlockName): Long {
        TODO("Not yet implemented")
    }

}