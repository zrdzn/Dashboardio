package dev.zrdzn.dashboardio.backend.common.action

import dev.zrdzn.dashboardio.backend.api.action.ActionCreateRequest
import dev.zrdzn.dashboardio.backend.api.action.ActionCreateResponse
import org.springframework.transaction.annotation.Transactional

open class ActionFacade(private val actionRepository: ActionRepository) {

    @Transactional
    open fun createAction(actionCreateRequest: ActionCreateRequest): ActionCreateResponse {
        val action = Action(
            id = null,
            actionType = actionCreateRequest.actionType,
            playerId = actionCreateRequest.playerId,
            occurredAt = actionCreateRequest.occurredAt
        )
        return ActionCreateResponse(actionRepository.save(action).id!!)
    }

}