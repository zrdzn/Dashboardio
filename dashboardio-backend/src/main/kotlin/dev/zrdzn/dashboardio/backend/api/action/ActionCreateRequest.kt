package dev.zrdzn.dashboardio.backend.api.action

import java.time.Instant

data class ActionCreateRequest(
    val actionType: ActionType,
    val playerId: Int,
    val occurredAt: Instant
)