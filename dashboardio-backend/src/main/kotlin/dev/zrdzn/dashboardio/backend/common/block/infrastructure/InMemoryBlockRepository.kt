package dev.zrdzn.dashboardio.backend.common.block.infrastructure

import dev.zrdzn.dashboardio.backend.api.action.ActionType
import dev.zrdzn.dashboardio.backend.common.action.ActionFacade
import dev.zrdzn.dashboardio.backend.common.block.Block
import dev.zrdzn.dashboardio.backend.common.block.BlockId
import dev.zrdzn.dashboardio.backend.common.block.BlockRepository
import dev.zrdzn.dashboardio.backend.common.block.BlockName
import org.apache.commons.lang3.BooleanUtils.and
import org.springframework.data.domain.Pageable

class InMemoryBlockRepository(
    private val actionFacade: ActionFacade
) : BlockRepository {

    private val blocksHistory = mutableMapOf<BlockId, Block>()

    override fun save(block: Block): Block =
        blocksHistory.put(blocksHistory.size + 1, block)!!


    override fun findAll(limit: Pageable): List<Block> =
        blocksHistory.values
            .take(limit.pageSize)

    override fun calculateBlocksCountByNameAndActionType(blockName: BlockName, actionType: ActionType): Long =
        blocksHistory.values
            .count {
                and(
                    it.blockName == blockName,
                    actionFacade.getActionById(it.actionId)?.actionType == actionType
                )
            }
            .toLong()

}