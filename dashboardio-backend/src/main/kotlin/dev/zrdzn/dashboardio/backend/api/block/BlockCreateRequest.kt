package dev.zrdzn.dashboardio.backend.api.block

import dev.zrdzn.dashboardio.backend.common.action.ActionId
import dev.zrdzn.dashboardio.backend.common.block.BlockName

data class BlockCreateRequest(
    val actionId: ActionId,
    val name: BlockName,
    val x: Int,
    val y: Int
)