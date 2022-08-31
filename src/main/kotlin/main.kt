fun main() {
    val amount = 12000_00
    val minTax = 35_00
    val tax = amount * 0.0075
    val resultTax = if (tax < minTax) minTax else tax
    println("Total Tax: $resultTax")
}