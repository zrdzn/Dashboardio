package dev.zrdzn.dashboardio.backend.api.action

data class ActionCreateRequest(
    val actionType: ActionType,
    val playerId: String,
    val occurredAt: String
)