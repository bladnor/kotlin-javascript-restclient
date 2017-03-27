import org.w3c.dom.HTMLDivElement
import org.w3c.xhr.XMLHttpRequest
import kotlin.browser.document

fun main(args: Array<String>) {
    val request: dynamic = XMLHttpRequest()
    request.open("GET", "http://localhost:8080/superheroes", true)
    request.onload = fun() {
        val htmlDivElement = document.getElementById("response") as HTMLDivElement
        htmlDivElement.innerText = request.responseText
    }
    request.send()
}