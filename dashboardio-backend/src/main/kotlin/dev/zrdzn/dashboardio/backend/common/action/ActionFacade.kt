package dev.zrdzn.dashboardio.backend.common.action

class ActionFacade(private val actionRepository: ActionRepository) {

    fun createAction(action: Action): Action {
        return actionRepository.save(action)
    }

}