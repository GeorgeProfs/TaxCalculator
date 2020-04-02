fun main() {
    val userInput = UserInput()
    userInput.oldPerf()
    val oldPerf = userInput.userInput()
    userInput.newPerf()
    val newPerf = userInput.userInput()
    userInput.divider()
    val divider = userInput.divideInput()
    val resultOfMonth = CalcLogic().calcResultOfMonth(oldPerf, newPerf, divider)
    val makeFile = OutPutFile().makeNewRes(oldPerf, newPerf, resultOfMonth)
}
