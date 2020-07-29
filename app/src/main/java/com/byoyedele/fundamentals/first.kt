package com.byoyedele.fundamentals

fun main() {
    println("Hello World")
   print("abaf".checkPalindrome())
}

fun String.checkPalindrome(): Boolean {

    for(i in this.indices){
        if (this[i] != this[this.length - i -1]) {
            return false
        }
    }
    return true
}