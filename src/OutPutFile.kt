import java.io.File
import java.time.LocalDate

class OutPutFile {

    fun makeNewRes(oldPerfomance: Perfomance, newPerfomance: Perfomance, payResult: Int) {
        val date = LocalDate.now()
        val fileName = "Room pay of $date.txt"
        val myFile = File(fileName)
        myFile.printWriter().use { out ->
            out.println(oldPerfomance)
            out.println(newPerfomance)
            out.println("Total tax pay $payResult")
        }
    }
}