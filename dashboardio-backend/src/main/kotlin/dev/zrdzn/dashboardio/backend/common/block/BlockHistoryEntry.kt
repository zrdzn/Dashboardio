package dev.zrdzn.dashboardio.backend.common.block

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.Id
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import java.time.LocalDateTime

typealias BlockHistoryEntryId = Long
typealias BlockName = String

@Entity(name = "BlockHistoryEntry")
@Table(name = "blocks_history")
data class BlockHistoryEntry(
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: BlockHistoryEntryId?,

    @Column(name = "changed_at", updatable = false)
    val changedAt: LocalDateTime?,

    @Column(name = "change", updatable = false)
    val change: Int,

    @Column(name = "name", updatable = false)
    val name: BlockName,

    @Column(name = "x", updatable = false)
    val x: Int,

    @Column(name = "y", updatable = false)
    val y: Int
)