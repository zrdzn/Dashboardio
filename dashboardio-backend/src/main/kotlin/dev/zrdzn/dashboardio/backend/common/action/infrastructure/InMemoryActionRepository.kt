package dev.zrdzn.dashboardio.backend.common.action.infrastructure

import dev.zrdzn.dashboardio.backend.common.action.Action
import dev.zrdzn.dashboardio.backend.common.action.ActionId
import dev.zrdzn.dashboardio.backend.common.action.ActionRepository

class InMemoryActionRepository : ActionRepository {

    private val actions = mutableMapOf<ActionId, Action>()

    override fun save(action: Action): Action =
        actions.put(actions.size + 1L, action)!!

}