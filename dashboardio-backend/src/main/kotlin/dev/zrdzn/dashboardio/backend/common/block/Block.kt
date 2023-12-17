package dev.zrdzn.dashboardio.backend.common.block

import dev.zrdzn.dashboardio.backend.common.action.ActionId
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.Id
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType

typealias BlockId = Int
typealias BlockName = String

@Entity(name = "Block")
@Table(name = "blocks_history")
data class Block(
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: BlockId?,

    @Column(name = "action_id", updatable = false)
    val actionId: ActionId,

    @Column(name = "block_name", updatable = false)
    val blockName: BlockName,

    @Column(name = "x", updatable = false)
    val x: Int,

    @Column(name = "y", updatable = false)
    val y: Int
)