package dev.zrdzn.dashboardio.backend.api.block

import dev.zrdzn.dashboardio.backend.common.block.BlockHistoryEntryId
import dev.zrdzn.dashboardio.backend.common.block.BlockName

data class BlockHistoryEntryCreateRequest(
    val name: BlockName,
    val x: Int,
    val y: Int
)

data class BlockHistoryEntryCreateResponse(
    val id: BlockHistoryEntryId
)