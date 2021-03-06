package org.mrseasons.coffeetime.kotlin._12_object_enum

/**
 * Created by mrseasons on 2015/06/09.
 */
//  Enum
enum class TrafficColor(val info: String) {
    RED("stop"), YELLOW("warning"), GREEN("walking"), BLUE("walking")
}

//  Anonymous Class
enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },
    TALKING {
        override fun signal() = WAITING
    };
    abstract fun signal(): ProtocolState
}