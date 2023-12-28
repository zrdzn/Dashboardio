package dev.zrdzn.dashboardio.backend.common.action.infrastructure

import dev.zrdzn.dashboardio.backend.api.action.ActionCreateRequest
import dev.zrdzn.dashboardio.backend.api.action.ActionCreateResponse
import dev.zrdzn.dashboardio.backend.common.action.ActionFacade
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController("/api/action")
class ActionController(private val actionFacade: ActionFacade) {

    @PostMapping("/create")
    fun createAction(@RequestBody actionCreateRequest: ActionCreateRequest): ResponseEntity<ActionCreateResponse> =
        ok(actionFacade.createAction(actionCreateRequest))

}