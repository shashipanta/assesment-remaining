# Assesment 2 : LocalDateTime to UTC and vice versa 

`ZoneId` : indcates the zone id of geographical region <br>
`ZonedDateTime` : date and time along with zone  <br>
`withZonedSameInstant(zoneId)` : convert a zonedDateTime instant to zonedDateTime instant of another zone <br>
`DateTimeFormatter` : format date and time object based on it's pattern

---

# Assesment 3 : Generate random Alpha-Numeric String

eg: Qz38hsAIDHI

### Using JAVA Random along with Stream API

| Character range | Numeric range |
| --- | --- |
| 0 - 9 | 48 - 57 |
| A - Z | 65 - 90 |
| a - z | 97 - 122 |


`filter(Predicate) : filter special characters that comes between given range `<br>
`limit(maxSize)    : limit the number of random Strings generated `<br>
`collect(Supplier,Accumulator,Combiner)`<br>
**Supplier** : StringBuilder::new <br>
supply new instance of StringBuilder <br>
**Accumulator** : StringBuilder::appendCodePoint <br>
accumulates the results into the mutable container <br>
**Combiner** : StringBuilder::append <br>
combines the partial results when the reduction operation takes place in parallel
