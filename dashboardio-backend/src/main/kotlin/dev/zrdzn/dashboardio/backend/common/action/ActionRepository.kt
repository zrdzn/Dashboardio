package dev.zrdzn.dashboardio.backend.common.action

interface ActionRepository {

    fun save(action: Action): Action

    fun findById(id: Int): Action?

}