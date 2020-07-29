package com.byoyedele.fundamentals

fun main() {
    println("Hello World")
   print("abs-sba".checkPalindrome())
}

fun String.checkPalindrome(): Boolean {

    val regexpattern = Regex("[^A-Za-z0-9 ]")
    val fineStr = regexpattern.replace(this, "")
    for(i in fineStr.indices){
        if (fineStr[i] != fineStr[fineStr.length - i -1]) {
            return false
        }
    }
    return true
}