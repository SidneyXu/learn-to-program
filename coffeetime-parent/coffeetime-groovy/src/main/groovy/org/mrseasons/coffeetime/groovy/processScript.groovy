package org.mrseasons.coffeetime.groovy

/**
 * Created by mrseasons on 2015/3/15.
 */
Process p = "mvn archetype:generate".execute()
println "${p.text}"