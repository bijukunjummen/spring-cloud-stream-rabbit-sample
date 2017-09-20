package works.processor.domain

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class WorkUnit @JsonCreator constructor(@param:JsonProperty("id") val id: String,
            @param:JsonProperty("definition") val definition: String)
