package dev.zrdzn.dashboardio.backend.common.block

import dev.zrdzn.dashboardio.backend.api.action.ActionType
import org.springframework.data.domain.Pageable

interface BlockRepository {

    fun save(block: Block): Block

    fun findAll(limit: Pageable): List<Block>

    fun calculateBlocksCountByNameAndActionType(blockName: BlockName, actionType: ActionType): Long

}