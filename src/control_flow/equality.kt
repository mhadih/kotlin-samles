package org.kotlinlang.play.control_flow

fun main() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain")

    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)   // 1
    println(authors === writers)  // 2
}