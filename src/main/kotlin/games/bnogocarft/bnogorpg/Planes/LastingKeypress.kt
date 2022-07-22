package games.bnogocarft.bnogorpg.Planes

import org.bukkit.entity.Player
import org.bukkit.scheduler.BukkitRunnable
import org.bukkit.util.Vector

val pressW = HashMap<Player, Boolean>()
val pressA = HashMap<Player, Boolean>()
val pressS = HashMap<Player, Boolean>()
val pressD = HashMap<Player, Boolean>()

val wVector = Vector(0.0, 0.3, 0.0)
val sVector = Vector(-0.3, -0.3, 0.0)

class removeScheduler() : BukkitRunnable() {
    override fun run() {
        // W Looper
        for (player in pressW.keys) {
            if (pressW[player] == true) {
                pressW[player] = false
            }
            if (pressW[player] == false) {
                pressW.remove(player)
                val plane = planes[player.vehicle]!!
                plane.isSteering = false
                print("stopped pressing W")
            }
        }

        // A Looper
        for (player in pressA.keys) {
            if (pressA[player] == true) {
                pressA[player] = false
            }
            if (pressA[player] == false) {
                pressA.remove(player)
                val plane = planes[player.vehicle]!!
                plane.isSteering = false
                print("stopped pressing A")
            }
        }

        // S Looper
        for (player in pressS.keys) {
            if (pressS[player] == true) {
                pressS[player] = false
            }
            if (pressS[player] == false) {
                pressS.remove(player)
                val plane = planes[player.vehicle]!!
                plane.isSteering = false
                print("stopped pressing S")
            }
        }

        // D Looper
        for (player in pressD.keys) {
            if (pressD[player] == true) {
                pressD[player] = false
            }
            if (pressD[player] == false) {
                pressD.remove(player)
                val plane = planes[player.vehicle]!!
                plane.isSteering = false
                print("stopped pressing D")
            }
        }
    }
}