## Kotlin Coroutines - April 27th 2021 

Review Questions: 
- Create a function that uses a coroutine in kotlin 
- Explain the role of the delay function 
- Define the relationship between Dispatcher.Main and the viewModelScope
- Write a test (WIP)
- How do you create an amomymous class in kotlin 

Questions about the reading: 

> "When creating a coroutine from a non-coroutine, start with launch.
>
>That way, if they throw an uncaught exception it'll automatically be propagated to uncaught exception handlers (which by default crash the app). A coroutine >started with async won't throw an exception to its caller until you call await. However, you can only call await from inside a coroutine, since it is a suspend >function.
>
>Once inside a coroutine, you can use launch or async to start child coroutines. Use launch for when you don't have a result to return, and async when you do.
>"
- Im a bit confused as to what a "non-coroutine" would be. The event bubbling part of this note makes sense though. 

### Sources 
- Tutorial: [Use Kotlin Coroutines in your Android App](https://developer.android.com/codelabs/kotlin-coroutines?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-coroutines%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fkotlin-coroutines#4)
- [Generating Code via Annotations in Kotlin](https://willowtreeapps.com/ideas/generating-code-via-annotations-in-kotlin)
  - How to generate boilerplate code using Kapt annotation processor in kotlin. 
